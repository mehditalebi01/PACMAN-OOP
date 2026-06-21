package GAME.Tiles;

import GAME.Graphics.Assets;

public class squareLeftTile extends Tile {

    public squareLeftTile(int id)
    {
        super(Assets.getSquare_left(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}

