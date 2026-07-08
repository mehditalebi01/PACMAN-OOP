package GAME.Tiles;

import GAME.XGraphics.Assets;

public class Right extends Tile{
    public Right(int id)
    {
        super(Assets.getRight(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
