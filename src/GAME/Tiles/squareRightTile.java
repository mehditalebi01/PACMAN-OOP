package GAME.Tiles;

import GAME.XGraphics.Assets;

public class squareRightTile extends Tile {

    public squareRightTile(int id)
    {
        super(Assets.getSquare_right(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
