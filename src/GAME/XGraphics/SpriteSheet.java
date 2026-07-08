package GAME.XGraphics;

import java.awt.image.BufferedImage;

public final class SpriteSheet {
    private final BufferedImage spriteSheet;
    public SpriteSheet(BufferedImage buffImg)
    {
        spriteSheet = buffImg;
    }

    public BufferedImage crop(int x, int y,int width,int height)
    {
        return spriteSheet.getSubimage(x, y , width, height);
    }
}
