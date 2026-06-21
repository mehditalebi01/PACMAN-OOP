package GAME.Tiles;

import GAME.Graphics.Assets;

public class Block extends Tile{
    public Block(int idd) {
        super(Assets.getBlock(), idd);
    }

    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
