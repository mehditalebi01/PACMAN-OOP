package GAME;

import GAME.Graphics.Assets;
import GAME.Graphics.ImageNotFoundException;
import GAME.Keys.KeyManager;
import GAME.Keys.Mouse;
import GAME.States.GameState;
import GAME.States.MenuState;
import GAME.States.State;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class Game implements Runnable{

    private GameWindow wnd;
    private final int width;
    private final int height;
    private final String title;
    private int score;

    private boolean runState;
    private Thread gameThread;

    private Graphics g;

    private final KeyManager key;
    private final Mouse mouse;

    private State menuState;

    private int level;

    private final GameFileManager gameFileManager;

    public Game(String title, int width, int intHeight, GameFileManager gameFileManager){ 
        this.width = width;
        this.height = intHeight; 
        this.title = title;
        key = new KeyManager();
        mouse = new Mouse();
        this.gameFileManager = gameFileManager;

        int[] loadedData = gameFileManager.loadGame();
        this.level = loadedData[0];
        this.score = loadedData[2];
    }

    @Override
    public void run() {
        try {
            InitGame();
        } catch (ImageNotFoundException | InvalidFileException e) {
            e.printStackTrace();
        }
        long oldTime = System.nanoTime();
        long currentTime; 
        final int framesPerSecond   = 60;
        final double timeFrame      = (double) 1000000000 / framesPerSecond;

        while (runState)
        {
            currentTime = System.nanoTime();
            if((currentTime - oldTime) > timeFrame)
            {
                try {
                    Update();
                } catch (InvalidFileException e) {
                    e.printStackTrace();
                }
                
                Draw();
                oldTime = currentTime;
            }
        }
        StopGame();
    }

    private void Draw() {
        BufferStrategy bs = wnd.GetCanvas().getBufferStrategy();
        if(bs == null)
        {
            try
            {
                wnd.GetCanvas().createBufferStrategy(3);
                return;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        assert bs != null;
        g = bs.getDrawGraphics();
        g.clearRect(0, 0,width,height);
        if(State.getState()!=null)
            State.getState().Draw(g);

        bs.show();
        g.dispose();
    }

    private void Update() throws InvalidFileException { 
        key.Update();

        if(State.getState()!=null)
            State.getState().Update();
    }

    private void InitGame() throws ImageNotFoundException, InvalidFileException {
        wnd = new GameWindow(title, width, height);
        wnd.getFrame().addKeyListener(key);
        wnd.getFrame().addMouseListener(mouse);
        wnd.getFrame().addMouseMotionListener(mouse);
        wnd.getCanvas().addMouseListener(mouse);
        wnd.getCanvas().addMouseMotionListener(mouse);
        Assets.Init();
        Handler handler = new Handler(this, gameFileManager);

        State gameState = new GameState(handler, this.level);
        menuState = new MenuState(handler);
        State.setState(menuState);
    }

    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public Graphics getGraphics() {
        return g;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int amount) {
        this.score = this.score + amount;
    }

    public State getMenuState() {
        return menuState;
    }

    public synchronized void StartGame()
    {
        if(!runState)
        {
            runState = true;
            gameThread = new Thread(this);
            gameThread.start();
        }

    }

    public synchronized void StopGame()
    {
        if(runState)
        {
            runState = false;
            try
            {
                gameThread.join();
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }

    }
    public KeyManager getKey()
    {
        return key;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public Mouse getMouse() {
        return mouse;
    }

}