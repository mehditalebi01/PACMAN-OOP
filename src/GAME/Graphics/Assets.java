package GAME.Graphics;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Assets {
    private static final int width=48, height=48;

    private static BufferedImage about,rectangle,up,down,left,right,right_down_corner2,left_up_corner2,left_down_corner2,right_up_corner2,background,square_up,square_left,square_right,square_down,
            PowerDot,dot,playerRight,playerLeft,playerDown,playerUp,gateUp,gateDown,gateLeft,gateRight,
            left_down_corner,left_up_corner,right_down_corner,right_up_corner,halfRight,halfLeft;
    private static Image RedGhost,BlueGhost,PinkGhost,OrangeGhost;
    private static Image startMenu;
    private static Image play,quit,sound,yes,no;
    private static Image levels,level1,level2,level3,level4,Life,start_menu_button;
    private static BufferedImage block;
    private static Image sound_icon;

    public static void Init() throws ImageNotFoundException {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.LoadImage("/tiles/sheet2.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.LoadImage("/tiles/Capture.png"));
        SpriteSheet button1 = new SpriteSheet(ImageLoader.LoadImage("/tiles/play2.png"));
        SpriteSheet button2 = new SpriteSheet(ImageLoader.LoadImage("/tiles/quit2.png"));
        SpriteSheet button3 = new SpriteSheet(ImageLoader.LoadImage("/tiles/about1.png"));
        SpriteSheet Rectangle = new SpriteSheet(ImageLoader.LoadImage("/tiles/re.jpg"));
        SpriteSheet Levels = new SpriteSheet(ImageLoader.LoadImage("/tiles/levels.png"));
        SpriteSheet Level1 = new SpriteSheet(ImageLoader.LoadImage("/tiles/level1.png"));
        SpriteSheet Level2 = new SpriteSheet(ImageLoader.LoadImage("/tiles/level2.png"));
        SpriteSheet Level3 = new SpriteSheet(ImageLoader.LoadImage("/tiles/level3.png"));
        SpriteSheet Level4 = new SpriteSheet(ImageLoader.LoadImage("/tiles/level4.png"));
        SpriteSheet Block = new SpriteSheet(ImageLoader.LoadImage("/tiles/block.png"));
        SpriteSheet Sound = new SpriteSheet(ImageLoader.LoadImage("/tiles/sound.png"));
        SpriteSheet Yes= new SpriteSheet(ImageLoader.LoadImage("/tiles/yes.png"));
        SpriteSheet No = new SpriteSheet(ImageLoader.LoadImage("/tiles/no.png"));
        SpriteSheet Start_Menu_Button = new SpriteSheet(ImageLoader.LoadImage("/tiles/start_menu.png"));
        SpriteSheet Sound_icon = new SpriteSheet(ImageLoader.LoadImage("/tiles/Sound_icon.png"));

        playerRight=sheet.crop(0,0,width,height);
        playerLeft=sheet.crop(48,0,width,height);
        playerDown=sheet.crop(2*width,0,width,height);
        playerUp=sheet.crop(3*width,0,width,height);
        gateDown=sheet.crop(4*width,0,width,height);
        gateLeft=sheet.crop(5*width,0,width,height);
        gateRight=sheet.crop(6*width,0,width,height);
        gateUp=sheet.crop(7*width,0,width,height);
        halfLeft=sheet.crop(8*width,0,width,height);
        halfRight=sheet.crop(9*width,0,width,height);
        left_down_corner=sheet.crop(0,48,width,height);
        left_up_corner=sheet.crop(width,width,width,height);
        right_down_corner=sheet.crop(2*width,width,width,height);
        right_up_corner=sheet.crop(3*width,width,width,height);
        PowerDot=sheet.crop(4*width,height,width,height);
        Life=sheet.crop(width,4*height,width,height);
        sound_icon=Sound_icon.crop(0,0,width,39);

        right_up_corner2 = sheet.crop(6 * width, 2*height, width, height);
        right_down_corner2 = sheet.crop(5 * width, 2*height, width, height);
        left_up_corner2 = sheet.crop(7 * width, 2*height, width, height);
        left_down_corner2 = sheet.crop(8 * width, 2*height, width, height);

        up= sheet.crop(1 * width, 3*height, width, height);
        down = sheet.crop(0 * width, 3*height, width, height);
        left = sheet.crop(2 * width, 3*height, width, height);
        right = sheet.crop(9 * width, 2*height, width, height);

        RedGhost=sheet.crop(width,2*height,width,height);
        BlueGhost=sheet.crop(width*2,2*height,width,height);
        PinkGhost=sheet.crop(width*4,2*height,width,height);
        OrangeGhost=sheet.crop(width*3,2*height,width,height);

        square_up=sheet.crop(5*width,height,width,height);
        square_left=sheet.crop(6*width,height,width,height);
        square_right=sheet.crop(7*width,height,width,height);
        square_down=sheet.crop(8*width,height,width,height);

        background=sheet.crop(9*width,height,width,height);
        dot=sheet.crop(0,2*height,width,height);

        startMenu=sheet3.crop(0,0,18*width,14*height);
        levels=Levels.crop(0,0,18*width,14*height);
        level1=Level1.crop(0,0,5*width,2*height);
        level2=Level2.crop(0,0,5*width,2*height);
        level3=Level3.crop(0,0,5*width,2*height);
        level4=Level4.crop(0,0,5*width,2*height);
        start_menu_button=Start_Menu_Button.crop(0,0,5*width,2*height);
        play=button1.crop(0,0,5*width,2*height);
        quit=button2.crop(0,0,5*width,2*height);
        about=button3.crop(0,0,5*width,2*height);
        sound=Sound.crop(0,0,5*width,2*height);
        yes=Yes.crop(0,0,5*width,2*height);
        no=No.crop(0,0,5*width,2*height);
        rectangle=Rectangle.crop(0,0,800,50);
        block=Block.crop(0,0,48,48);
    }

    public static BufferedImage getAbout() { return about; }
    public static BufferedImage getRectangle() { return rectangle; }
    public static BufferedImage getUp() { return up; }
    public static BufferedImage getDown() { return down; }
    public static BufferedImage getLeft() { return left; }
    public static BufferedImage getRight() { return right; }
    public static BufferedImage getRight_down_corner2() { return right_down_corner2; }
    public static BufferedImage getLeft_up_corner2() { return left_up_corner2; }
    public static BufferedImage getLeft_down_corner2() { return left_down_corner2; }
    public static BufferedImage getRight_up_corner2() { return right_up_corner2; }
    public static BufferedImage getBackground() { return background; }
    public static BufferedImage getSquare_up() { return square_up; }
    public static BufferedImage getSquare_left() { return square_left; }
    public static BufferedImage getSquare_right() { return square_right; }
    public static BufferedImage getSquare_down() { return square_down; }
    public static BufferedImage getPowerDot() { return PowerDot; }
    public static BufferedImage getDot() { return dot; }
    public static BufferedImage getPlayerRight() { return playerRight; }
    public static BufferedImage getPlayerLeft() { return playerLeft; }
    public static BufferedImage getPlayerDown() { return playerDown; }
    public static BufferedImage getPlayerUp() { return playerUp; }
    public static BufferedImage getGateUp() { return gateUp; }
    public static BufferedImage getGateDown() { return gateDown; }
    public static BufferedImage getGateLeft() { return gateLeft; }
    public static BufferedImage getGateRight() { return gateRight; }
    public static BufferedImage getLeft_down_corner() { return left_down_corner; }
    public static BufferedImage getLeft_up_corner() { return left_up_corner; }
    public static BufferedImage getRight_down_corner() { return right_down_corner; }
    public static BufferedImage getRight_up_corner() { return right_up_corner; }
    public static BufferedImage getHalfLeft() { return halfLeft; }
    public static BufferedImage getHalfRight() { return halfRight; }
    public static Image getRedGhost() { return RedGhost; }
    public static Image getBlueGhost() { return BlueGhost; }
    public static Image getPinkGhost() { return PinkGhost; }
    public static Image getOrangeGhost() { return OrangeGhost; }
    public static Image getStartMenu() { return startMenu; }
    public static Image getPlay() { return play; }
    public static Image getQuit() { return quit; }
    public static Image getSound() { return sound; }
    public static Image getYes() { return yes; }
    public static Image getNo() { return no; }
    public static Image getLevels() { return levels; }
    public static Image getLevel1() { return level1; }
    public static Image getLevel2() { return level2; }
    public static Image getLevel3() { return level3; }
    public static Image getLevel4() { return level4; }
    public static Image getLife() { return Life; }
    public static Image getStart_menu_button() { return start_menu_button; }
    public static BufferedImage getBlock() { return block; }
    public static Image getSound_icon() { return sound_icon; }
}