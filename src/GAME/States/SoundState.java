package GAME.States;

import GAME.Graphics.Assets;
import GAME.Handler;
import GAME.Sound;

import java.awt.*;

public final class SoundState extends State{
    public SoundState(Handler handler) {
        super(handler);
    }

    @Override
    public void Update() {
        Rectangle yes = new Rectangle(56,550, 240, 96);
        Rectangle no = new Rectangle(570,550, 240, 96);
        if(getHandler().getMouse().pressed_left() && no.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            State.setState(getHandler().getGame().getMenuState());
        }
        if(getHandler().getMouse().pressed_left() && yes.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())){
            Sound.getBeginningSound().setSoundOff(1); 
            Sound.getChompSound().setSoundOff(1); 
            Sound.getDeathSound().setSoundOff(1); 
            Sound.getBeginningSound().stop();
            State.setState(getHandler().getGame().getMenuState());
        }
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.getStartMenu(), 0, 0, getHandler().getGame().getWidth(), getHandler().getGame().getHeight(), null); 
        g.setColor(Color.black);
        g.setFont(new Font("Sergiue", Font.BOLD, 45));
        g.drawString("Do you want to turn off the sound?", 60, 450);
        g.drawImage(Assets.getYes(), 56 , 550 , null); 
        g.drawImage(Assets.getNo(), 570 , 550 , null); 
    }
}