package GAME.Tiles;

import GAME.Graphics.Assets;

public class Up extends Tile{
    public Up(int id)
    {
        super(Assets.getUp(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
