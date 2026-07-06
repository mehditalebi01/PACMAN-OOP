package GAME.Entities.Statics;

import GAME.Graphics.Assets;
import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Tiles.Tile;

import java.awt.*;

public final class Dot extends StaticEntity{

    public Dot(Handler handler, double x, double y) {
        super(handler, x, y, Tile.getTileWidth(), Tile.getTileHeight());

        getSolidArea().x = 10;
        getSolidArea().y = (int) ( getHeight() / 1.5f );
        getSolidArea().width = getWidth() - 20;
        getSolidArea().height = (int) ( getHeight() - getHeight() / 1.5f);
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.getDot(),(int)getX(),(int)getY(),getWidth(),getHeight(),null);
    }
    @Override
    public void Update() {

    }
}