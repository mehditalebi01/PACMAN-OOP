package GAME.Tiles;

import GAME.Graphics.Assets;

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

