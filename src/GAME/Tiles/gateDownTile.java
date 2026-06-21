package GAME.Tiles;


import GAME.Graphics.Assets;

public class gateDownTile extends Tile {

    public gateDownTile(int idd) {
        super(Assets.getGateDown(), idd);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}