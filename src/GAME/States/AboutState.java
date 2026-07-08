package GAME.States;

import GAME.XGraphics.Assets;
import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Sound;

import java.awt.*;

public final class AboutState extends State{
    public AboutState(Handler handler) {
        super(handler);
    }

    @Override
    public void Update() throws InvalidFileException {
        Rectangle level1 = new Rectangle(56,300, 240, 96);
        Rectangle level2 = new Rectangle(56,400, 240, 96);
        Rectangle level3 = new Rectangle(570,250, 240, 96);
        Rectangle level4 = new Rectangle(570,400, 240, 96);
        Rectangle start_menu = new Rectangle(313,500, 240, 96);

        if(getHandler().getMouse().pressed_left() && level1.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            getHandler().getGame().setLevel(1);
            getHandler().getGame().setScore(-getHandler().getGame().getScore());
            getHandler().getGameFileManager().saveGame(1, 5, 0);
            State.setState(new GameState(getHandler(),1));
            if(Sound.getBeginningSound().isActive())
                Sound.getBeginningSound().stop();
            Sound.getChompSound().loop();
        }
        if(getHandler().getMouse().pressed_left() && level2.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            getHandler().getGame().setLevel(2);
            getHandler().getGame().setScore(-getHandler().getGame().getScore());
            getHandler().getGameFileManager().saveGame(2, 5, 0);
            State.setState(new GameState(getHandler(),2));
            if(Sound.getBeginningSound().isActive())
                Sound.getBeginningSound().stop();
            Sound.getChompSound().loop();
        }
        if(getHandler().getMouse().pressed_left() && level3.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            getHandler().getGame().setLevel(3);
            getHandler().getGame().setScore(-getHandler().getGame().getScore());
            getHandler().getGameFileManager().saveGame(3, 5, 0);
            State.setState(new GameState(getHandler(),3));
            if(Sound.getBeginningSound().isActive())
                Sound.getBeginningSound().stop();
            Sound.getChompSound().loop();
        }
        if(getHandler().getMouse().pressed_left() && level4.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            getHandler().getGame().setLevel(4);
            getHandler().getGame().setScore(-getHandler().getGame().getScore());
            getHandler().getGameFileManager().saveGame(4, 5, 0);
            State.setState(new GameState(getHandler(),4));
            if(Sound.getBeginningSound().isActive())
                Sound.getBeginningSound().stop();
            Sound.getChompSound().loop();
        }
        if(getHandler().getMouse().pressed_left() && start_menu.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            State.setState(getHandler().getGame().getMenuState());
        }
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.getLevels(), 0, 0, getHandler().getGame().getWidth(), getHandler().getGame().getHeight(), null); 
        g.drawImage(Assets.getLevel1(), 56 , 250 , null); 
        g.drawImage(Assets.getLevel2(), 56 , 400 , null); 
        g.drawImage(Assets.getLevel3(), 570 , 250 , null); 
        g.drawImage(Assets.getLevel4(), 570 , 400 , null); 
        g.drawImage(Assets.getStart_menu_button(), 313 , 500 , null); 
    }
}
