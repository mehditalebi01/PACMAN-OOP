package GAME.Entities.MovingCreatures;

import GAME.Graphics.Assets;
import GAME.Handler;
import GAME.Tiles.Tile;

import java.awt.*;

public class PinkGhost extends Creature {

    private int speed;

    public PinkGhost(Handler handler, double x, double y) {
        super(handler, x, y);
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

    }

    @Override
    public void Update() {
        if(speed < 0){ 
            int ty = (int) (getY() + getSolidArea().y) / Tile.getTileHeight();
            if(collision((int) (getX() + getSolidArea().x) / Tile.getTileWidth(), ty) &&
                    collision((int) (getX() + getSolidArea().x + getSolidArea().width - 1) / Tile.getTileWidth(), ty)){
            }else{
                speed = -speed;
            }
        }else if (speed > 0){
            int ty = (int) (getY() + getSolidArea().height + getSolidArea().y) / Tile.getTileHeight();
            if(collision((int) (getX() + getSolidArea().x) / Tile.getTileWidth(), ty) &&
                    collision((int) (getX() + getSolidArea().x + getSolidArea().width - 1) / Tile.getTileWidth(), ty)){
            }else{
                speed = -speed;
            }
        }

        setx(getX() + speed);

    }


    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.getPinkGhost(),(int) getX() , (int) getY() , getWidth() , getHeight() , null);
    }

    @Override
    public void die() {

    }
}
