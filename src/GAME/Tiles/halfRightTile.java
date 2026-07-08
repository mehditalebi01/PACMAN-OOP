package GAME.Tiles;

import GAME.XGraphics.Assets;

public class halfRightTile extends Tile {

    public halfRightTile(int id)
    {
        super(Assets.getHalfRight(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
