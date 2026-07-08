package GAME.States;

import GAME.Entities.MovingCreatures.Player;
import GAME.XGraphics.Assets;
import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Levels;
import GAME.Sound;

import java.awt.*;

public final class GameState extends State{
    private final Levels hart;
    private static final Rectangle SOUND_BUTTON = new Rectangle(300, 10, 48, 39);
    private static final Rectangle MENU_BUTTON = new Rectangle(500, 30, 150, 40);

    public GameState(Handler handler,int level) throws InvalidFileException {
        super(handler);
        hart = new Levels(handler ,"res/maps/" , level);
    }

    @Override
    public void Update() throws InvalidFileException {
        hart.Update();
        handleMenuClick();
        handleSoundClick();
    }

    @Override
    public void Draw(Graphics g) {
       hart.Draw(g);
       drawHud(g);
    }

    private void drawHud(Graphics g) {
        Player player = getHandler().getMap().getEntityManager().getPlayer();

        g.setFont(new Font("Sergiue", Font.BOLD, 22));
        g.drawString("Score : " + getHandler().getGame().getScore(), 700, 40);
        g.drawString("Level : " + getHandler().getGame().getLevel(), 400, 40);
        g.drawString("Start Menu", 530, 40);
        g.drawImage(Assets.getSound_icon(), 300, 10, null);

        for (int i = 0; i < player.getLives(); i++) {
            g.drawImage(Assets.getLife(), i * 48, 0, null);
        }
    }

    private void handleMenuClick() {
        if (getHandler().getMouse().pressed_left() &&
                MENU_BUTTON.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            Player player = getHandler().getMap().getEntityManager().getPlayer();
            State.setState(getHandler().getGame().getMenuState());
            Sound.getChompSound().stop();
            getHandler().getGameFileManager().saveGame(
                    getHandler().getGame().getLevel(),
                    player.getLives(),
                    getHandler().getGame().getScore()
            );
        }
    }

    private void handleSoundClick() {
        if (getHandler().getMouse().pressed_left() &&
                SOUND_BUTTON.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            Sound.getChompSound().stop();
        }
    }

}
