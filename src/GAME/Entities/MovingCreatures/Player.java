package GAME.Entities.MovingCreatures;

import GAME.Entities.Entity;
import GAME.Entities.Statics.Dot;
import GAME.Graphics.Assets;
import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Sound;
import GAME.States.GameState;
import GAME.States.State;

import java.util.Map;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public final class Player extends Creature implements Damageable{

    private static final Map<String, BufferedImage> directionImages;
    private int lives ;
    private int k;
    private boolean winner = false;
    private boolean dead = false;
    private boolean leaderboardSaved = false;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y);
        getSolidArea().x = 8;
        getSolidArea().y = 8;
        getSolidArea().width = 32;
        getSolidArea().height = 32;
        this.lives = handler.getGameFileManager().loadGame()[1];
    }

    static {
        directionImages = new HashMap<>();
        directionImages.put("up", Assets.getPlayerUp());
        directionImages.put("down", Assets.getPlayerDown());
        directionImages.put("left", Assets.getPlayerLeft());
        directionImages.put("right", Assets.getPlayerRight());
    }
    @Override
    public void Draw(Graphics g) {
        BufferedImage image = directionImages.get(getDirection());
        g.drawImage(image, (int) getX(), (int) getY() , null);

        g.setFont(new Font("Sergiue", Font.BOLD, 22));
        g.drawString("Score : " + getHandler().getGame().getScore() , 700 , 40 );
        g.drawString("Level : " + getHandler().getGame().getLevel() , 400 , 40 );
        g.drawString("Start Menu" , 530 , 40 );
        g.drawImage(Assets.getSound_icon(), 300 , 10,null );
        Rectangle sound = new Rectangle(300,10, 48, 39);
        Rectangle menu = new Rectangle(500,30, 150, 40);
        if(getHandler().getMouse().pressed_left() && menu.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            State.setState(getHandler().getGame().getMenuState());
            Sound.getChompSound().stop();
            getHandler().getGameFileManager().saveGame(getHandler().getGame().getLevel(),
                lives, getHandler().getGame().getScore()
            );
        }
        if(getHandler().getMouse().pressed_left() && sound.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
           Sound.getChompSound().stop();
        }
        for (int i = 0; i < lives; i++) {
            g.drawImage(Assets.getLife(), i*48, 0, null);
        }
    }

    public void die() {
        lives--;
        getHandler().getGameFileManager().saveGame(
                getHandler().getGame().getLevel(),
            lives,
                getHandler().getGame().getScore()
        );

        if(lives <= 0) {
            dead = true;
            saveScoreToLeaderboard();
            Sound.getChompSound().stop();
            Sound.getDeathSound().play();
        }
    }

    @Override
    public void takeDamage(int amount) {
        System.out.println("Player taking " + amount + " damage!");
        die();
    }


    @Override
    public void Update() throws InvalidFileException {
        double nextXMove = 0;
        double nextYMove = 0;
        if (getHandler().getKeyManager().isUpPressed()) {
            setDirection("up");
            nextYMove -= getSpeed();
        }
        if (getHandler().getKeyManager().isDownPressed()) {
            setDirection("down");
            nextYMove += getSpeed();
        }
        if (getHandler().getKeyManager().isLeftPressed()) {
            setDirection("left");
            nextXMove -= getSpeed();
        }
        if (getHandler().getKeyManager().isRightPressed()) {
            setDirection("right");
            nextXMove += getSpeed();
        }

        setxMove(nextXMove);
        setyMove(nextYMove);

        move();
        EatDots();
        checkLevel();
    }

    public void EatDots() {
        Rectangle cb = getCollisionBounds(0, 0);
        Rectangle ar = new Rectangle();
        int arSize = 30;
        ar.width = arSize;
        ar.height = arSize;

        if (getHandler().getKeyManager().isUpPressed()) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y - arSize / 2 + 30;
        } else if (getHandler().getKeyManager().isDownPressed()) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height - 40;
        } else if (getHandler().getKeyManager().isLeftPressed()) {
            ar.x = cb.x - arSize + 60;
            ar.y = cb.y + cb.height / 2 - arSize / 2 + 20;
        } else if (getHandler().getKeyManager().isRightPressed()) {
            ar.x = cb.x + cb.width - 40;
            ar.y = cb.y + cb.height / 2 - arSize / 2 + 20;
        } else {
            ar.x = cb.x - arSize + 40;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        }

        for (Entity e : getHandler().getMap().getEntityManager().getEntities()) {
            if (e.equals(this)) {
                continue;
            }

            if (e.getCollisionBounds(0, 0).intersects(ar)) {
                if (e instanceof Dot) {
                    e.setActive(false);
                    getHandler().getGame().setScore(10);
                    getHandler().getGameFileManager().saveGame(
                            getHandler().getGame().getLevel(),
                        lives,
                            getHandler().getGame().getScore()
                    );
                    return;
                }
                if(e instanceof BlueGhost || e instanceof RedGhost || e instanceof OrangeGhost || e instanceof PinkGhost)
                {
                    k--;
                    if(k%10==0) {
                        if(getHandler().getGame().getScore()-50 >= 0)
                            getHandler().getGame().setScore(-50);
                        else
                            getHandler().getGame().setScore(-getHandler().getGame().getScore());
                        Damageable playerAsDamageable = this;
                        playerAsDamageable.takeDamage(50);
                    }
                    if(dead) {
                        State.setState(getHandler().getGame().getMenuState());
                    }
                }
            }
        }
    }

    private void checkLevel() throws InvalidFileException {
        int count = 0;
        for(Entity e : getHandler().getMap().getEntityManager().getEntities()){
            if(e instanceof Dot)
                count++;
        }

        if(count == 0)
        {
            int currentLevel = getHandler().getGame().getLevel();

            GameState gameState;
            if(currentLevel == 1) {
                getHandler().getGame().setLevel(2);
                gameState = new GameState(getHandler() , 2);
                State.setState(gameState);
            } else if (currentLevel == 2) {
                getHandler().getGame().setLevel(3);
                gameState = new GameState(getHandler() , 3);
                State.setState(gameState);
            } else if (currentLevel == 3) {
                getHandler().getGame().setLevel(4);
                gameState = new GameState(getHandler() , 4);
                State.setState(gameState);
            } else {
                winner = true;
                saveScoreToLeaderboard();
                getHandler().getGame().setLevel(1);
            }
            getHandler().getGameFileManager().saveGame(
                    getHandler().getGame().getLevel(),
                lives,
                    getHandler().getGame().getScore()
            );
            if (winner) {
                State.setState(getHandler().getGame().getMenuState());
            }
        }
    }


    public boolean isWinner() {
        return winner;
    }

    public boolean isDead() {
        return dead;
    }

    private void saveScoreToLeaderboard() {
        if (!leaderboardSaved) {
            getHandler().getGameFileManager().saveLeaderboardScore(getHandler().getGame().getScore());
            leaderboardSaved = true;
        }
    }

}
