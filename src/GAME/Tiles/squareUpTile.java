package GAME.Tiles;

import GAME.Graphics.Assets;

public class squareUpTile extends Tile {

    public squareUpTile(int id)
    {
        super(Assets.getSquare_up(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}