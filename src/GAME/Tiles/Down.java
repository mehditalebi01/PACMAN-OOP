package GAME.Tiles;

import GAME.Graphics.Assets;

public class Down extends Tile{
    public Down(int id)
    {
        super(Assets.getDown(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
