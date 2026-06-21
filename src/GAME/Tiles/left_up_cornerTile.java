package GAME.Tiles;

import GAME.Graphics.Assets;

public class left_up_cornerTile extends Tile {

    public left_up_cornerTile(int id)
    {
        super(Assets.getLeft_up_corner(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}

