package GAME.Tiles;

import GAME.XGraphics.Assets;

public class left_down_cornerTile extends Tile {

    public left_down_cornerTile(int id)
    {
        super(Assets.getLeft_down_corner(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
