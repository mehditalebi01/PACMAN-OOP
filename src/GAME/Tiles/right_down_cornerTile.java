package GAME.Tiles;

import GAME.XGraphics.Assets;

public class right_down_cornerTile extends Tile {

    public right_down_cornerTile(int id)
    {
        super(Assets.getRight_down_corner(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
