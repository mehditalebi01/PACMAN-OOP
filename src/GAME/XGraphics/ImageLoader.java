package GAME.XGraphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import java.awt.Graphics2D; 

public final class ImageLoader {
    public static BufferedImage LoadImage(String path) throws ImageNotFoundException {
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(ImageLoader.class.getResource(path), "Resource not found at path: " + path));
            System.out.println("Successfully loaded image: " + path); 
            return image;
        } catch (IOException e) {
            System.err.println("Error reading image file from " + path + ": " + e.getMessage());
            throw new ImageNotFoundException("Error reading image: " + path);
        } catch (NullPointerException e) { 
            System.err.println("Image resource not found (NullPointerException) at " + path + ": " + e.getMessage()); 
            throw new ImageNotFoundException("Image resource not found: " + path);
        } catch (Exception e) { 
            System.err.println("An unexpected error occurred while loading image from " + path + ": " + e.getMessage()); 
            throw new ImageNotFoundException("Failed to load image: " + path);
        }
    }


}
