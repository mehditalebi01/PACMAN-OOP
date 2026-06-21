package GAME;

import javax.swing.JFrame;
import java.awt.*;

public class GameWindow {

    private JFrame frame;
    private final String title;
    private final int width;
    private final int height;
    private Canvas canvas;

    public GameWindow(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        buildGameWindow();
    }
    private void buildGameWindow(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setBackground(Color.black);
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();
    }

    public Canvas GetCanvas()
    {
        return canvas;
    }
    public JFrame getFrame()
    {
        return frame;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }


    public Component getCanvas() {
        return canvas;
    }
}