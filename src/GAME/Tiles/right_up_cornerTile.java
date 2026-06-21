package GAME.Tiles;

import GAME.Graphics.Assets;

public class right_up_cornerTile extends Tile {

    public right_up_cornerTile(int id)
    {
        super(Assets.getRight_up_corner(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}

