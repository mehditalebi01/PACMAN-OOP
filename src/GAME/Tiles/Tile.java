package GAME.Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    

    private static final int NO_TILES   = 300;
    private static final int TILE_WIDTH  = 48; 
    private static final int TILE_HEIGHT = 48;
    private static final Tile[] tiles = new Tile[NO_TILES];
    private final BufferedImage img;
    private final int id;

    private static final Tile gateUpTile=new gateUpTile(0);
    private static final Tile gateDownTile=new gateDownTile(1);
    private static final Tile gateLeftTile=new gateLeftTile(2);
    private static final Tile gateRightTile=new gateRightTile(3);
    private static final Tile left_down_cornerTile=new  left_down_cornerTile(4);
    private static final Tile left_up_cornerTile=new left_up_cornerTile(5);
    private static final Tile right_down_cornerTile=new  right_down_cornerTile(6);
    private static final Tile right_up_cornerTile=new right_up_cornerTile(7);
    private static final Tile halfLeftTile=new halfLeftTile(8);
    private static final Tile halfRightTile=new  halfRightTile(9);
    private static final Tile dot=new DotTile(10);
    private static final Tile squareUpTile=new squareUpTile(11);
    private static final Tile squareLeftTile=new squareLeftTile(12);
    private static final Tile squareRightTile=new  squareRightTile(13);
    private static final Tile squareDownTile=new squareDownTile(14);
    private static final Tile backgroundTile=new backgroundTile(15);
    private static final Tile PowerDot=new PowerDotTile(16);
    private static final Tile right_up_corner2=new right_up_corner2(17);
    private static final Tile right_down_corner2=new right_down_corner2(18);
    private static final Tile left_down_corner2=new left_down_corner2(19);
    private static final Tile left_up_corner2=new left_up_corner2(20);
    private static final Tile up=new Up(21);
    private static final Tile down=new Down(22);
    private static final Tile left=new Left(23);
    private static final Tile right=new Right(24);
    private static final Tile block=new Block(25);


    public Tile(BufferedImage image, int idd)
    {
        img = image;
        id = idd;
        tiles[id] = this; 
    }

    public void Update()
    {

    }

    public void Draw(Graphics g, int x, int y)
    {
        g.drawImage(img, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    public boolean IsSolid()
    {
        return false;
    }


    public static Tile getBlock() { return block; }

    public int getId() {
        return this.id;
    }
    public static int getTileWidth() {return TILE_WIDTH;}

    public static int getTileHeight() {return TILE_HEIGHT;}

    public static Tile getTileById(int id) {
        if (id >= 0 && id < NO_TILES && tiles[id] != null) {
            return tiles[id];
        }
        return block; 
    }
}
