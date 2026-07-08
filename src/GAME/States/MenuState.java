package GAME.States;

import java.awt.*;

import GAME.XGraphics.Assets;
import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Sound;

    public final class MenuState extends State {

    public MenuState(Handler handler)
    {
        super(handler);
    }

    @Override
    public void Update() throws InvalidFileException {
        Rectangle play = new Rectangle(56,400, 240, 96);
        Rectangle quit = new Rectangle(580,400, 240, 96);
        Rectangle about = new Rectangle(180,530, 240, 96);
        Rectangle sound = new Rectangle(480,530, 240, 96);
        Rectangle load = new Rectangle(312,395, 240, 45);
        Rectangle leaderboard = new Rectangle(312,455, 240, 45);

        if(getHandler().getMouse().pressed_left() && about.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            State.setState(new AboutState(getHandler()));
        }
        if(getHandler().getMouse().pressed_left() && sound.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            State.setState(new SoundState(getHandler()));
        }

        if(getHandler().getMouse().pressed_left() && play.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            getHandler().getGame().setLevel(1);
            getHandler().getGame().setScoreValue(0);
            getHandler().getGameFileManager().saveGame(1, 5, 0);
            State.setState(new GameState(getHandler(),1));
            if(Sound.getBeginningSound().isActive())
                Sound.getBeginningSound().stop();
            Sound.getChompSound().loop();
        }
        if(getHandler().getMouse().pressed_left() && load.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            int[] savedData = getHandler().getGameFileManager().loadGame();
            getHandler().getGame().setLevel(savedData[0]);
            getHandler().getGame().setScoreValue(savedData[2]);
            State.setState(new GameState(getHandler(), savedData[0]));
            if(Sound.getBeginningSound().isActive())
                Sound.getBeginningSound().stop();
            Sound.getChompSound().loop();
        }
        if(getHandler().getMouse().pressed_left() && leaderboard.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            State.setState(new LeaderboardState(getHandler()));
        }
        if(getHandler().getMouse().pressed_left() && quit.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            System.exit(0);
        }
    }

    @Override
    public void Draw (Graphics g)
    {
        g.drawImage(Assets.getStartMenu(), 0, 0, getHandler().getGame().getWidth(), getHandler().getGame().getHeight(), null); 
        g.drawImage(Assets.getPlay(), 56 , 400 , null); 
        g.drawImage(Assets.getQuit(), 580 , 400 , null ); 
        g.drawImage(Assets.getAbout(), 180 , 530 , null ); 
        g.drawImage(Assets.getSound(), 480 , 530 , null ); 
        drawMenuButton(g, 312, 395, "Load Game");
        drawMenuButton(g, 312, 455, "Leaderboard");

        if(getHandler().getMap().getEntityManager().getPlayer().isDead()){
            g.setColor(Color.orange);
            g.setFont(new Font("Sergiue", Font.BOLD, 50));
            g.drawImage(Assets.getRectangle(), 30 , 310 , null); 
            g.drawString("You are killed! Your Score : " + getHandler().getGame().getScore(), 55, 350);
        }

        if(getHandler().getMap().getEntityManager().getPlayer().isWinner()){
            g.setColor(Color.green);
            g.setFont(new Font("Sergiue", Font.BOLD, 40));
            g.drawImage(Assets.getRectangle(), 30 , 310 , null); 
            g.drawString("You Won the Game! Your Score : " + getHandler().getGame().getScore(), 55, 350);
        }
    }

    private void drawMenuButton(Graphics g, int x, int y, String text) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 240, 45);
        g.setColor(Color.YELLOW);
        g.drawRect(x, y, 240, 45);
        g.setFont(new Font("Sergiue", Font.BOLD, 24));
        int textX = x + 35;
        if ("Leaderboard".equals(text)) {
            textX = x + 25;
        }
        g.drawString(text, textX, y + 30);
    }
}
