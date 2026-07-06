package GAME.Entities.MovingCreatures;

import GAME.Entities.Entity;
import GAME.Handler;
import GAME.Tiles.Tile;
import GAME.InvalidFileException;

public abstract class Creature extends Entity {

    private static final int DEFAULT_WIDTH = 48;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_SPEED = 6;

    private int speed;
    private double xMove; 
    private double yMove; 
    private final Handler handler;

    public Creature(Handler handler, double x, double y, int width, int height) {
        super(handler, x, y, width, height);
        this.speed = DEFAULT_SPEED; 
        this.xMove = 0;             
        this.yMove = 0;
        this.handler=handler;
    }

    public Creature(Handler handler, double x, double y) {
    this(handler, x, y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void move() {
        moveX();
        moveY();
    }

    protected boolean collision(int x, int y) {
        return !getHandler().getMap().getTile(x, y).IsSolid();
    }

    private void moveX() {
        if (xMove > 0) {
            int tx = (int) (getX() + xMove + getSolidArea().x + getSolidArea().width) / Tile.getTileWidth();
            if (collision(tx, (int) (getY() + getSolidArea().y) / Tile.getTileHeight()) &&
                    collision(tx, (int) (getY() + getSolidArea().y + getSolidArea().height) / Tile.getTileHeight())) {
                setx(getX() + xMove);
            }
        } else if (xMove < 0) {
            int tx = (int) (getX() + xMove + getSolidArea().x) / Tile.getTileWidth();
            if (collision(tx, (int) (getY() + getSolidArea().y) / Tile.getTileHeight()) &&
                    collision(tx, (int) (getY() + getSolidArea().y + getSolidArea().height) / Tile.getTileHeight())) {
                setx(getX() + xMove);
            }
        }
    }

    private void moveY() {
        if (yMove < 0) { 
            int ty = (int) (getY() + yMove + getSolidArea().y) / Tile.getTileHeight();
            if (collision((int) (getX() + getSolidArea().x) / Tile.getTileWidth(), ty) &&
                    collision((int) (getX() + getSolidArea().x + getSolidArea().width) / Tile.getTileWidth(), ty)) {
                sety(getY() + yMove);
            }
        } else if (yMove > 0) { 
            int ty = (int) (getY() + yMove + getSolidArea().y + getSolidArea().height) / Tile.getTileHeight();
            if (collision((int) (getX() + getSolidArea().x) / Tile.getTileWidth(), ty) &&
                    collision((int) (getX() + getSolidArea().x + getSolidArea().width) / Tile.getTileWidth(), ty)) {
                sety(getY() + yMove);
            }
        }
    }

    public int speedCalculator(){
        if(handler.getGame().getLevel()==1)
            speed=2;
        else
        if(handler.getGame().getLevel()==2)
            speed=2;
        else
        if(handler.getGame().getLevel()==3)
            speed=3;
        else
            speed=4;

        return speed;
    }

    public void setxMove(double xMove) {
        this.xMove = xMove;
    }

    public void setyMove(double yMove) {
        this.yMove = yMove;
    }
    
    public int getSpeed() {
        return speed;
    }

    @Override
    public void Update() throws InvalidFileException {
    }
}