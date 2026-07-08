package GAME.Tiles;

import GAME.XGraphics.Assets;

public class Left extends Tile{
    public Left(int id)
    {
        super(Assets.getLeft(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
