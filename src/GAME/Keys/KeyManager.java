package GAME.Keys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyManager implements KeyListener {
    private final boolean[] keys;
    private boolean up,down,left,right; 
    public KeyManager()
    {
        keys=new boolean[256];
    }
    public void Update()
    {
        up=keys[KeyEvent.VK_UP];
        down=keys[KeyEvent.VK_DOWN];
        left=keys[KeyEvent.VK_LEFT];
        right=keys[KeyEvent.VK_RIGHT];
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()]=false;
    }

    public boolean isUpPressed() {
        return up;
    }

    public boolean isDownPressed() {
        return down;
    }

    public boolean isLeftPressed() {
        return left;
    }

    public boolean isRightPressed() {
        return right;
    }
}
