package GAME;

import GAME.Keys.KeyManager;
import GAME.Keys.Mouse;

public class Handler {
    private Game game;
    private Map map;
    private final GameFileManager gameFileManager;

    public Handler(Game game, GameFileManager gameFileManager)
    {
        this.game = game;
        this.gameFileManager = gameFileManager; 
    }

    public Game getGame()
    {
        return game;
    }
    public void setGame(Game game)
    {
        this.game = game;
    }
    public Map getMap()
    {
        return map;
    }
    public void setMap(Map map)
    {
        this.map = map;
    }
    public int getWidth()
    {
        return game.getWidth();
    }
    public int getHeight()
    {
        return game.getHeight();
    }
    public KeyManager getKeyManager()
    {
        return game.getKey();
    }
    public Mouse getMouse() {
        return game.getMouse();
    }

    public GameFileManager getGameFileManager() {
        return gameFileManager;
    }
}