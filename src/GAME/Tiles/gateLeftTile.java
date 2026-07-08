package GAME.Tiles;

import GAME.XGraphics.Assets;

public class gateLeftTile extends Tile {

    public gateLeftTile(int id)
    {
        super(Assets.getGateLeft(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
