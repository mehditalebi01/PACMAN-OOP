package GAME.Tiles;

import GAME.Graphics.Assets;

public class halfLeftTile extends Tile {

    public halfLeftTile(int id)
    {
        super(Assets.getHalfLeft(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}

