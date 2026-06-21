package GAME.Tiles;

import GAME.Graphics.Assets;

public class left_up_corner2 extends Tile{
    public left_up_corner2(int id)
    {
        super(Assets.getLeft_up_corner2(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}