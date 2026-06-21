package GAME.States;

import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Levels;

import java.awt.*;

public class GameState extends State{
    private final Levels hart;
    public GameState(Handler handler,int level) throws InvalidFileException {
        super(handler);
        hart = new Levels(handler ,"res/maps/" , level);
    }

    @Override
    public void Update() throws InvalidFileException {
        hart.Update();

    }

    @Override
    public void Draw(Graphics g) {
       hart.Draw(g);
    }


}
