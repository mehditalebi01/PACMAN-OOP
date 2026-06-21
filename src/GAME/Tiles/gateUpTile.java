package GAME.Tiles;


import GAME.Graphics.Assets;

public class gateUpTile extends Tile {

    public gateUpTile(int id)
    {
        super(Assets.getGateUp(), id);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}