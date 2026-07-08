package GAME.Tiles;

import GAME.XGraphics.Assets;

public class left_down_corner2 extends Tile{
    public left_down_corner2(int id)
    {
        super(Assets.getLeft_down_corner2(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
