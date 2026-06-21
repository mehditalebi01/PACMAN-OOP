package GAME.Tiles;

import GAME.Graphics.Assets;

public class gateRightTile extends Tile {

    public gateRightTile(int id)
    {
        super(Assets.getGateRight(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}

