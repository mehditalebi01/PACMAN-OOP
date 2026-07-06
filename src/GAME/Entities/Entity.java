package GAME.Entities;

import GAME.Handler;
import GAME.InvalidFileException;

import java.awt.*;

public abstract class Entity {

    private double x,y;
    private static String direction="right";
    private final Handler handler;
    private int width, height;
    private final Rectangle solidArea;
    private boolean active=true;

    public Entity(Handler handler,double x, double y, int width, int height) {

        this.handler=handler;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        solidArea=new Rectangle(0,0,width,height);
    }

    public void sety(double y)
    {
       this.y=y;
    }
    public void setx(double x)
    {
         this.x=x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public abstract void Update() throws InvalidFileException;
    public abstract void Draw(Graphics g);
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public Rectangle getCollisionBounds(float xOffset , float yOffset){
        return new Rectangle( (int)( x + solidArea.x + xOffset ) , (int) ( y + solidArea.y + yOffset) ,solidArea.width , solidArea.height);
    }

    public String getDirection() {
        return direction;
    }

    public Handler getHandler() {
        return handler;
    }

    public Rectangle getSolidArea() {
        return solidArea;
    }

    public void setDirection(String direction) {
        Entity.direction = direction;
    }
}