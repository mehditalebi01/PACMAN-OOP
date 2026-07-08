package GAME.Tiles;

import GAME.XGraphics.Assets;

public class squareDownTile extends Tile {

    public squareDownTile(int id)
    {
        super(Assets.getSquare_down(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
