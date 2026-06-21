package GAME.States;

import GAME.Handler;
import GAME.InvalidFileException;

import java.awt.*;

public abstract class State {
    private static State currentState=null;
    private final Handler handler;
    public static void setState(State state)
    {
        State.currentState=state;
    }
    public static State getState()
    {
        return currentState;
    }
    public State(Handler handler){
        this.handler=handler;
    }

    protected Handler getHandler() {
        return handler;
    }
    
    public abstract void Update() throws InvalidFileException;
    public abstract void Draw(Graphics g);

}
