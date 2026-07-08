package GAME.Tiles;

import GAME.XGraphics.Assets;

public class right_down_corner2 extends Tile{
    public right_down_corner2(int id)
    {
        super(Assets.getRight_down_corner2(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
