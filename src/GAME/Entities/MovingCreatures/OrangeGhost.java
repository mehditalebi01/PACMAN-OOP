package GAME.Entities.MovingCreatures;

import GAME.XGraphics.Assets;
import GAME.Handler;
import GAME.Tiles.Tile;

import java.awt.*;

public final class OrangeGhost extends Creature {

    private int speed;
    public OrangeGhost(Handler handler, double x, double y) {
        super(handler, x, y);
        this.speed = speedCalculator();
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
        sety(getY() + speed);

    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.getOrangeGhost(),(int) getX() , (int) getY() , getWidth() , getHeight() , null);
    }

}
