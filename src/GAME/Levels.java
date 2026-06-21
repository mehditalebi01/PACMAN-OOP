package GAME;

import java.awt.*;


public class Levels {
    private Map map;
    public Levels(Handler handler , String directory , int level) throws InvalidFileException {

        if (level == 1)

            map = new Map(handler, directory + "map1.txt");

        else
            if(level==2)
            map = new Map(handler, directory + "map2.txt");

        else
            if(level==3)
            map = new Map(handler, directory + "map3.txt");
        else
            if(level==4)
                map = new Map(handler, directory + "map4.txt");

        handler.setMap(map);
    }

    public void Update() throws InvalidFileException {
        map.Update();
    }

    public void Draw(Graphics g){
        map.Draw(g);
    }


}
