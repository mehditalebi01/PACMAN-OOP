package GAME.Entities;

import GAME.Entities.MovingCreatures.*;
import GAME.Entities.Statics.Dot;
import GAME.Handler;
import GAME.InvalidFileException;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public final class EntityManager {
    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;

    public EntityManager(Handler handler, Player player){
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        if( handler.getGame().getLevel() == 1 )
            EntitiesLevel1();
             else
             if(handler.getGame().getLevel() == 2 )
                EntitiesLevel2();
             else
                if(handler.getGame().getLevel() == 3 )
                     EntitiesLevel3();
                else
                if(handler.getGame().getLevel() == 4 )
                    EntitiesLevel4();

    addEntity(player);


    }

    private void EntitiesLevel4(){
        addEntity(new Dot(handler, 48, 48*2));
        addEntity(new Dot(handler, 48, 48*1));
        addEntity(new Dot(handler, 48, 48*3));
        addEntity(new Dot(handler, 48, 48*4));
        addEntity(new Dot(handler, 48, 48*5));
        addEntity(new Dot(handler, 48, 48*6));
        addEntity(new Dot(handler, 48, 48*7));
        addEntity(new Dot(handler, 48, 48*8));
        addEntity(new Dot(handler, 48, 48*9));
        addEntity(new Dot(handler, 48, 48*10));
        addEntity(new Dot(handler, 48, 48*11));
        addEntity(new Dot(handler, 48, 48*12));


        addEntity(new Dot(handler, 48*2, 48*1));
        addEntity(new Dot(handler, 48*2, 48*6));
        addEntity(new Dot(handler, 48*2, 48*3));
        addEntity(new Dot(handler, 48*2, 48*7));
        addEntity(new Dot(handler, 48*2, 48*5));
        addEntity(new Dot(handler, 48*2, 48*8));
        addEntity(new Dot(handler, 48*2, 48*9));
        addEntity(new Dot(handler, 48*2, 48*10));
        addEntity(new Dot(handler, 48*2, 48*12));

        addEntity(new Dot(handler, 48*3, 48*1));
        addEntity(new Dot(handler, 48*3, 48*3));
        addEntity(new Dot(handler, 48*3, 48*6));
        addEntity(new Dot(handler, 48*3, 48*7));
        addEntity(new Dot(handler, 48*3, 48*8));
        addEntity(new Dot(handler, 48*3, 48*10));
        addEntity(new Dot(handler, 48*3, 48*12));

        addEntity(new Dot(handler, 48*4, 48*3));
        addEntity(new Dot(handler, 48*4, 48*6));
        addEntity(new Dot(handler, 48*4, 48*7));
        addEntity(new Dot(handler, 48*4, 48*4));
        addEntity(new Dot(handler, 48*4, 48*8));

        addEntity(new Dot(handler, 48*5, 48*1));
        addEntity(new Dot(handler, 48*5, 48*2));
        addEntity(new Dot(handler, 48*5, 48*3));
        addEntity(new Dot(handler, 48*5, 48*4));
        addEntity(new Dot(handler, 48*5, 48*7));
        addEntity(new Dot(handler, 48*5, 48*6));
        addEntity(new Dot(handler, 48*5, 48*8));
        addEntity(new Dot(handler, 48*5, 48*10));
        addEntity(new Dot(handler, 48*5, 48*11));
        addEntity(new Dot(handler, 48*5, 48*12));

        addEntity(new Dot(handler, 48*6, 48*1));
        addEntity(new Dot(handler, 48*6, 48*2));
        addEntity(new Dot(handler, 48*6, 48*4));
        addEntity(new Dot(handler, 48*6, 48*6));
        addEntity(new Dot(handler, 48*6, 48*10));
        addEntity(new Dot(handler, 48*6, 48*12));
        addEntity(new Dot(handler, 48*6, 48*7));
        addEntity(new Dot(handler, 48*6, 48*8));

        addEntity(new Dot(handler, 48*7, 48*1));
        addEntity(new Dot(handler, 48*7, 48*4));
        addEntity(new Dot(handler, 48*7, 48*10));
        addEntity(new Dot(handler, 48*7, 48*12));
        addEntity(new Dot(handler, 48*7, 48*2));


        addEntity(new Dot(handler, 48*8, 48*1));
        addEntity(new Dot(handler, 48*8, 48*4));
        addEntity(new Dot(handler, 48*8, 48*5));
        addEntity(new Dot(handler, 48*8, 48*6));
        addEntity(new Dot(handler, 48*8, 48*7));
        addEntity(new Dot(handler, 48*8, 48*8));
        addEntity(new Dot(handler, 48*8, 48*9));
        addEntity(new Dot(handler, 48*8, 48*10));


        addEntity(new Dot(handler, 48*9, 48*1));
        addEntity(new Dot(handler, 48*9, 48*4));
        addEntity(new Dot(handler, 48*9, 48*5));
        addEntity(new Dot(handler, 48*9, 48*6));
        addEntity(new Dot(handler, 48*9, 48*7));
        addEntity(new Dot(handler, 48*9, 48*8));
        addEntity(new Dot(handler, 48*9, 48*9));
        addEntity(new Dot(handler, 48*9, 48*10));

        addEntity(new Dot(handler, 48*10, 48*1));
        addEntity(new Dot(handler, 48*10, 48*10));
        addEntity(new Dot(handler, 48*10, 48*12));
        addEntity(new Dot(handler, 48*10, 48*2));
        addEntity(new Dot(handler, 48*10, 48*4));

        addEntity(new Dot(handler, 48*11, 48*1));
        addEntity(new Dot(handler, 48*11, 48*10));
        addEntity(new Dot(handler, 48*11, 48*2));
        addEntity(new Dot(handler, 48*11, 48*12));
        addEntity(new Dot(handler, 48*11, 48*4));
        addEntity(new Dot(handler, 48*11, 48*8));
        addEntity(new Dot(handler, 48*11, 48*6));
        addEntity(new Dot(handler, 48*11, 48*7));

        addEntity(new Dot(handler, 48*12, 48*1));
        addEntity(new Dot(handler, 48*12, 48*2));
        addEntity(new Dot(handler, 48*12, 48*3));
        addEntity(new Dot(handler, 48*12, 48*4));
        addEntity(new Dot(handler, 48*12, 48*11));
        addEntity(new Dot(handler, 48*12, 48*7));
        addEntity(new Dot(handler, 48*12, 48*6));
        addEntity(new Dot(handler, 48*12, 48*8));
        addEntity(new Dot(handler, 48*12, 48*10));
        addEntity(new Dot(handler, 48*12, 48*12));

        addEntity(new Dot(handler, 48*13, 48*3));
        addEntity(new Dot(handler, 48*13, 48*4));
        addEntity(new Dot(handler, 48*13, 48*8));
        addEntity(new Dot(handler, 48*13, 48*10));
        addEntity(new Dot(handler, 48*13, 48*6));
        addEntity(new Dot(handler, 48*13, 48*7));

        addEntity(new Dot(handler, 48*14, 48*1));
        addEntity(new Dot(handler, 48*14, 48*3));
        addEntity(new Dot(handler, 48*14, 48*6));
        addEntity(new Dot(handler, 48*14, 48*7));
        addEntity(new Dot(handler, 48*14, 48*8));
        addEntity(new Dot(handler, 48*14, 48*10));
        addEntity(new Dot(handler, 48*14, 48*12));

        addEntity(new Dot(handler, 48*15, 48*1));
        addEntity(new Dot(handler, 48*15, 48*3));
        addEntity(new Dot(handler, 48*15, 48*5));
        addEntity(new Dot(handler, 48*15, 48*6));
        addEntity(new Dot(handler, 48*15, 48*7));
        addEntity(new Dot(handler, 48*15, 48*8));
        addEntity(new Dot(handler, 48*15, 48*9));
        addEntity(new Dot(handler, 48*15, 48*10));
        addEntity(new Dot(handler, 48*15, 48*12));

        addEntity(new Dot(handler, 48*16, 48));
        addEntity(new Dot(handler, 48*16, 48*2));
        addEntity(new Dot(handler, 48*16, 48*3));
        addEntity(new Dot(handler, 48*16, 48*4));
        addEntity(new Dot(handler, 48*16, 48*5));
        addEntity(new Dot(handler, 48*16, 48*6));
        addEntity(new Dot(handler, 48*16, 48*7));
        addEntity(new Dot(handler, 48*16, 48*8));
        addEntity(new Dot(handler, 48*16, 48*9));
        addEntity(new Dot(handler, 48*16, 48*10));
        addEntity(new Dot(handler, 48*16, 48*11));
        addEntity(new Dot(handler, 48*16, 48*12));

        addEntity(new RedGhost(handler, 48*1, 48*8));
        addEntity(new BlueGhost(handler, 48*9, 48*4));
        addEntity(new PinkGhost(handler, 48*5, 48));
        addEntity(new OrangeGhost(handler, 48*15, 48*8));

    }
    private void EntitiesLevel3() {

        addEntity(new Dot(handler, 48, 48*2));
        addEntity(new Dot(handler, 48, 48*3));
        addEntity(new Dot(handler, 48, 48*4));
        addEntity(new Dot(handler, 48, 48*5));
        addEntity(new Dot(handler, 48, 48*6));
        addEntity(new Dot(handler, 48, 48*7));
        addEntity(new Dot(handler, 48, 48*8));
        addEntity(new Dot(handler, 48, 48*9));
        addEntity(new Dot(handler, 48, 48*10));
        addEntity(new Dot(handler, 48, 48*11));
        addEntity(new Dot(handler, 48, 48*12));


        addEntity(new Dot(handler, 48*2, 48*1));
        addEntity(new Dot(handler, 48*2, 48*2));
        addEntity(new Dot(handler, 48*2, 48*3));
        addEntity(new Dot(handler, 48*2, 48*4));
        addEntity(new Dot(handler, 48*2, 48*5));
        addEntity(new Dot(handler, 48*2, 48*8));
        addEntity(new Dot(handler, 48*2, 48*9));
        addEntity(new Dot(handler, 48*2, 48*10));
        addEntity(new Dot(handler, 48*2, 48*11));
        addEntity(new Dot(handler, 48*2, 48*12));

        addEntity(new Dot(handler, 48*3, 48*1));
        addEntity(new Dot(handler, 48*3, 48*3));
        addEntity(new Dot(handler, 48*3, 48*4));
        addEntity(new Dot(handler, 48*3, 48*5));
        addEntity(new Dot(handler, 48*3, 48*6));
        addEntity(new Dot(handler, 48*3, 48*7));
        addEntity(new Dot(handler, 48*3, 48*8));
        addEntity(new Dot(handler, 48*3, 48*9));
        addEntity(new Dot(handler, 48*3, 48*10));
        addEntity(new Dot(handler, 48*3, 48*12));

        addEntity(new Dot(handler, 48*4, 48*1));
        addEntity(new Dot(handler, 48*4, 48*6));
        addEntity(new Dot(handler, 48*4, 48*7));
        addEntity(new Dot(handler, 48*4, 48*12));

        addEntity(new Dot(handler, 48*5, 48*1));
        addEntity(new Dot(handler, 48*5, 48*3));
        addEntity(new Dot(handler, 48*5, 48*5));
        addEntity(new Dot(handler, 48*5, 48*7));
        addEntity(new Dot(handler, 48*5, 48*6));
        addEntity(new Dot(handler, 48*5, 48*8));
        addEntity(new Dot(handler, 48*5, 48*10));
        addEntity(new Dot(handler, 48*5, 48*12));

        addEntity(new Dot(handler, 48*6, 48*1));
        addEntity(new Dot(handler, 48*6, 48*10));
        addEntity(new Dot(handler, 48*6, 48*3));
        addEntity(new Dot(handler, 48*6, 48*12));
        addEntity(new Dot(handler, 48*6, 48*5));
        addEntity(new Dot(handler, 48*6, 48*8));

        addEntity(new Dot(handler, 48*7, 48*1));
        addEntity(new Dot(handler, 48*7, 48*10));
        addEntity(new Dot(handler, 48*7, 48*3));
        addEntity(new Dot(handler, 48*7, 48*12));
        addEntity(new Dot(handler, 48*7, 48*5));
        addEntity(new Dot(handler, 48*7, 48*8));
        addEntity(new Dot(handler, 48*7, 48*2));
        addEntity(new Dot(handler, 48*7, 48*11));

        addEntity(new Dot(handler, 48*8, 48*1));
        addEntity(new Dot(handler, 48*8, 48*2));
        addEntity(new Dot(handler, 48*8, 48*3));
        addEntity(new Dot(handler, 48*8, 48*4));
        addEntity(new Dot(handler, 48*8, 48*5));
        addEntity(new Dot(handler, 48*8, 48*6));
        addEntity(new Dot(handler, 48*8, 48*7));
        addEntity(new Dot(handler, 48*8, 48*8));
        addEntity(new Dot(handler, 48*8, 48*9));
        addEntity(new Dot(handler, 48*8, 48*10));
        addEntity(new Dot(handler, 48*8, 48*11));
        addEntity(new Dot(handler, 48*8, 48*12));


        addEntity(new Dot(handler, 48*9, 48*1));
        addEntity(new Dot(handler, 48*9, 48*2));
        addEntity(new Dot(handler, 48*9, 48*3));
        addEntity(new Dot(handler, 48*9, 48*4));
        addEntity(new Dot(handler, 48*9, 48*5));
        addEntity(new Dot(handler, 48*9, 48*6));
        addEntity(new Dot(handler, 48*9, 48*7));
        addEntity(new Dot(handler, 48*9, 48*8));
        addEntity(new Dot(handler, 48*9, 48*9));
        addEntity(new Dot(handler, 48*9, 48*10));
        addEntity(new Dot(handler, 48*9, 48*11));
        addEntity(new Dot(handler, 48*9, 48*12));

        addEntity(new Dot(handler, 48*10, 48*1));
        addEntity(new Dot(handler, 48*10, 48*10));
        addEntity(new Dot(handler, 48*10, 48*3));
        addEntity(new Dot(handler, 48*10, 48*12));
        addEntity(new Dot(handler, 48*10, 48*5));
        addEntity(new Dot(handler, 48*10, 48*8));
        addEntity(new Dot(handler, 48*10, 48*2));
        addEntity(new Dot(handler, 48*10, 48*11));

        addEntity(new Dot(handler, 48*11, 48*1));
        addEntity(new Dot(handler, 48*11, 48*10));
        addEntity(new Dot(handler, 48*11, 48*3));
        addEntity(new Dot(handler, 48*11, 48*12));
        addEntity(new Dot(handler, 48*11, 48*5));
        addEntity(new Dot(handler, 48*11, 48*8));

        addEntity(new Dot(handler, 48*12, 48*1));
        addEntity(new Dot(handler, 48*12, 48*3));
        addEntity(new Dot(handler, 48*12, 48*5));
        addEntity(new Dot(handler, 48*12, 48*7));
        addEntity(new Dot(handler, 48*12, 48*6));
        addEntity(new Dot(handler, 48*12, 48*8));
        addEntity(new Dot(handler, 48*12, 48*10));
        addEntity(new Dot(handler, 48*12, 48*12));

        addEntity(new Dot(handler, 48*13, 48*1));
        addEntity(new Dot(handler, 48*13, 48*6));
        addEntity(new Dot(handler, 48*13, 48*7));
        addEntity(new Dot(handler, 48*13, 48*12));

        addEntity(new Dot(handler, 48*14, 48*1));
        addEntity(new Dot(handler, 48*14, 48*3));
        addEntity(new Dot(handler, 48*14, 48*4));
        addEntity(new Dot(handler, 48*14, 48*5));
        addEntity(new Dot(handler, 48*14, 48*6));
        addEntity(new Dot(handler, 48*14, 48*7));
        addEntity(new Dot(handler, 48*14, 48*8));
        addEntity(new Dot(handler, 48*14, 48*9));
        addEntity(new Dot(handler, 48*14, 48*10));
        addEntity(new Dot(handler, 48*14, 48*12));

        addEntity(new Dot(handler, 48*15, 48*1));
        addEntity(new Dot(handler, 48*15, 48*2));
        addEntity(new Dot(handler, 48*15, 48*3));
        addEntity(new Dot(handler, 48*15, 48*4));
        addEntity(new Dot(handler, 48*15, 48*5));
        addEntity(new Dot(handler, 48*15, 48*8));
        addEntity(new Dot(handler, 48*15, 48*9));
        addEntity(new Dot(handler, 48*15, 48*10));
        addEntity(new Dot(handler, 48*15, 48*11));
        addEntity(new Dot(handler, 48*15, 48*12));

        addEntity(new Dot(handler, 48*16, 48));
        addEntity(new Dot(handler, 48*16, 48*2));
        addEntity(new Dot(handler, 48*16, 48*3));
        addEntity(new Dot(handler, 48*16, 48*4));
        addEntity(new Dot(handler, 48*16, 48*5));
        addEntity(new Dot(handler, 48*16, 48*6));
        addEntity(new Dot(handler, 48*16, 48*7));
        addEntity(new Dot(handler, 48*16, 48*8));
        addEntity(new Dot(handler, 48*16, 48*9));
        addEntity(new Dot(handler, 48*16, 48*10));
        addEntity(new Dot(handler, 48*16, 48*11));
        addEntity(new Dot(handler, 48*16, 48*12));

        addEntity(new RedGhost(handler, 48*1, 48*11));
        addEntity(new BlueGhost(handler, 48*9, 48*4));
        addEntity(new PinkGhost(handler, 48*15, 48*9));
        addEntity(new OrangeGhost(handler, 48*15, 48*10));

    }
    private void EntitiesLevel1() {


        addEntity(new Dot(handler, 48, 48));
        addEntity(new Dot(handler, 48, 48*2));
        addEntity(new Dot(handler, 48, 48*3));
        addEntity(new Dot(handler, 48, 48*4));
        addEntity(new Dot(handler, 48, 48*5));
        addEntity(new Dot(handler, 48, 48*6));
        addEntity(new Dot(handler, 48, 48*7));
        addEntity(new Dot(handler, 48, 48*8));
        addEntity(new Dot(handler, 48, 48*9));
        addEntity(new Dot(handler, 48, 48*10));
        addEntity(new Dot(handler, 48, 48*11));
        addEntity(new Dot(handler, 48, 48*12));

        addEntity(new Dot(handler, 48*2, 48));
        addEntity(new Dot(handler, 48*2, 48*2));
        addEntity(new Dot(handler, 48*2, 48*4));
        addEntity(new Dot(handler, 48*2, 48*5));
        addEntity(new Dot(handler, 48*2, 48*6));
        addEntity(new Dot(handler, 48*2, 48*7));
        addEntity(new Dot(handler, 48*2, 48*8));
        addEntity(new Dot(handler, 48*2, 48*9));
        addEntity(new Dot(handler, 48*2, 48*11));
        addEntity(new Dot(handler, 48*2, 48*12));

        addEntity(new Dot(handler, 48*3, 48));
        addEntity(new Dot(handler, 48*3, 48*5));
        addEntity(new Dot(handler, 48*3, 48*6));
        addEntity(new Dot(handler, 48*3, 48*7));
        addEntity(new Dot(handler, 48*3, 48*8));
        addEntity(new Dot(handler, 48*3, 48*12));


        addEntity(new Dot(handler, 48*4, 48));
        addEntity(new Dot(handler, 48*4, 48*2));
        addEntity(new Dot(handler, 48*4, 48*4));
        addEntity(new Dot(handler, 48*4, 48*5));
        addEntity(new Dot(handler, 48*4, 48*6));
        addEntity(new Dot(handler, 48*4, 48*7));
        addEntity(new Dot(handler, 48*4, 48*8));
        addEntity(new Dot(handler, 48*4, 48*9));
        addEntity(new Dot(handler, 48*4, 48*12));


        addEntity(new Dot(handler, 48*5, 48*1));
        addEntity(new Dot(handler, 48*5, 48*2));
        addEntity(new Dot(handler, 48*5, 48*3));
        addEntity(new Dot(handler, 48*5, 48*4));
        addEntity(new Dot(handler, 48*5, 48*5));
        addEntity(new Dot(handler, 48*5, 48*6));
        addEntity(new Dot(handler, 48*5, 48*7));
        addEntity(new Dot(handler, 48*5, 48*8));
        addEntity(new Dot(handler, 48*5, 48*9));
        addEntity(new Dot(handler, 48*5, 48*10));
        addEntity(new Dot(handler, 48*5, 48*11));
        addEntity(new Dot(handler, 48*5, 48*12));

        addEntity(new Dot(handler, 48*6, 48*1));
        addEntity(new Dot(handler, 48*6, 48*2));
        addEntity(new Dot(handler, 48*6, 48*3));
        addEntity(new Dot(handler, 48*6, 48*4));
        addEntity(new Dot(handler, 48*6, 48*9));
        addEntity(new Dot(handler, 48*6, 48*10));
        addEntity(new Dot(handler, 48*6, 48*11));
        addEntity(new Dot(handler, 48*6, 48*12));


        addEntity(new Dot(handler, 48*7, 48*1));
        addEntity(new Dot(handler, 48*7, 48*2));
        addEntity(new Dot(handler, 48*7, 48*3));
        addEntity(new Dot(handler, 48*7, 48*4));
        addEntity(new Dot(handler, 48*7, 48*9));
        addEntity(new Dot(handler, 48*7, 48*10));
        addEntity(new Dot(handler, 48*7, 48*11));
        addEntity(new Dot(handler, 48*7, 48*12));

        addEntity(new Dot(handler, 48*8, 48*1));
        addEntity(new Dot(handler, 48*8, 48*2));
        addEntity(new Dot(handler, 48*8, 48*3));
        addEntity(new Dot(handler, 48*8, 48*4));
        addEntity(new Dot(handler, 48*8, 48*9));
        addEntity(new Dot(handler, 48*8, 48*10));
        addEntity(new Dot(handler, 48*8, 48*11));
        addEntity(new Dot(handler, 48*8, 48*12));

        addEntity(new Dot(handler, 48*9, 48*1));
        addEntity(new Dot(handler, 48*9, 48*2));
        addEntity(new Dot(handler, 48*9, 48*3));
        addEntity(new Dot(handler, 48*9, 48*4));
        addEntity(new Dot(handler, 48*9, 48*9));
        addEntity(new Dot(handler, 48*9, 48*10));
        addEntity(new Dot(handler, 48*9, 48*11));
        addEntity(new Dot(handler, 48*9, 48*12));

        addEntity(new Dot(handler, 48*10, 48*1));
        addEntity(new Dot(handler, 48*10, 48*2));
        addEntity(new Dot(handler, 48*10, 48*3));
        addEntity(new Dot(handler, 48*10, 48*4));
        addEntity(new Dot(handler, 48*10, 48*9));
        addEntity(new Dot(handler, 48*10, 48*10));
        addEntity(new Dot(handler, 48*10, 48*11));
        addEntity(new Dot(handler, 48*10, 48*12));

        addEntity(new Dot(handler, 48*11, 48*1));
        addEntity(new Dot(handler, 48*11, 48*2));
        addEntity(new Dot(handler, 48*11, 48*3));
        addEntity(new Dot(handler, 48*11, 48*4));
        addEntity(new Dot(handler, 48*11, 48*9));
        addEntity(new Dot(handler, 48*11, 48*10));
        addEntity(new Dot(handler, 48*11, 48*11));
        addEntity(new Dot(handler, 48*11, 48*12));

        addEntity(new Dot(handler, 48*12, 48*1));
        addEntity(new Dot(handler, 48*12, 48*2));
        addEntity(new Dot(handler, 48*12, 48*3));
        addEntity(new Dot(handler, 48*12, 48*4));
        addEntity(new Dot(handler, 48*12, 48*5));
        addEntity(new Dot(handler, 48*12, 48*6));
        addEntity(new Dot(handler, 48*12, 48*7));
        addEntity(new Dot(handler, 48*12, 48*8));
        addEntity(new Dot(handler, 48*12, 48*9));
        addEntity(new Dot(handler, 48*12, 48*10));
        addEntity(new Dot(handler, 48*12, 48*11));
        addEntity(new Dot(handler, 48*12, 48*12));

        addEntity(new Dot(handler, 48*13, 48*1));
        addEntity(new Dot(handler, 48*13, 48*2));
        addEntity(new Dot(handler, 48*13, 48*4));
        addEntity(new Dot(handler, 48*13, 48*5));
        addEntity(new Dot(handler, 48*13, 48*6));
        addEntity(new Dot(handler, 48*13, 48*7));
        addEntity(new Dot(handler, 48*13, 48*8));
        addEntity(new Dot(handler, 48*13, 48*9));
        addEntity(new Dot(handler, 48*13, 48*11));
        addEntity(new Dot(handler, 48*13, 48*12));

        addEntity(new Dot(handler, 48*14, 48*1));
        addEntity(new Dot(handler, 48*14, 48*5));
        addEntity(new Dot(handler, 48*14, 48*6));
        addEntity(new Dot(handler, 48*14, 48*7));
        addEntity(new Dot(handler, 48*14, 48*8));
        addEntity(new Dot(handler, 48*14, 48*12));


        addEntity(new Dot(handler, 48*15, 48*1));
        addEntity(new Dot(handler, 48*15, 48*2));
        addEntity(new Dot(handler, 48*15, 48*4));
        addEntity(new Dot(handler, 48*15, 48*5));
        addEntity(new Dot(handler, 48*15, 48*6));
        addEntity(new Dot(handler, 48*15, 48*7));
        addEntity(new Dot(handler, 48*15, 48*8));
        addEntity(new Dot(handler, 48*15, 48*9));
        addEntity(new Dot(handler, 48*15, 48*11));
        addEntity(new Dot(handler, 48*15, 48*12));

        addEntity(new Dot(handler, 48*16, 48));
        addEntity(new Dot(handler, 48*16, 48*2));
        addEntity(new Dot(handler, 48*16, 48*3));
        addEntity(new Dot(handler, 48*16, 48*4));
        addEntity(new Dot(handler, 48*16, 48*5));
        addEntity(new Dot(handler, 48*16, 48*6));
        addEntity(new Dot(handler, 48*16, 48*7));
        addEntity(new Dot(handler, 48*16, 48*8));
        addEntity(new Dot(handler, 48*16, 48*9));
        addEntity(new Dot(handler, 48*16, 48*10));
        addEntity(new Dot(handler, 48*16, 48*11));
        addEntity(new Dot(handler, 48*16, 48*12));
        addEntity(new Dot(handler, 48*6, 48*6));
        addEntity(new Dot(handler, 48*6, 48*7));
        addEntity(new Dot(handler, 48*6, 48*8));
        addEntity(new Dot(handler, 48*6, 48*5));

        addEntity(new Dot(handler, 48*7, 48*6));
        addEntity(new Dot(handler, 48*7, 48*7));
        addEntity(new Dot(handler, 48*7, 48*5));
        addEntity(new Dot(handler, 48*7, 48*8));

        addEntity(new Dot(handler, 48*8, 48*5));
        addEntity(new Dot(handler, 48*8, 48*6));
        addEntity(new Dot(handler, 48*8, 48*7));
        addEntity(new Dot(handler, 48*8, 48*8));

        addEntity(new Dot(handler, 48*9, 48*5));
        addEntity(new Dot(handler, 48*9, 48*6));
        addEntity(new Dot(handler, 48*9, 48*7));
        addEntity(new Dot(handler, 48*9, 48*8));

        addEntity(new Dot(handler, 48*10, 48*5));
        addEntity(new Dot(handler, 48*10, 48*6));
        addEntity(new Dot(handler, 48*10, 48*7));
        addEntity(new Dot(handler, 48*10, 48*8));

        addEntity(new Dot(handler, 48*11, 48*5));
        addEntity(new Dot(handler, 48*11, 48*6));
        addEntity(new Dot(handler, 48*11, 48*7));
        addEntity(new Dot(handler, 48*11, 48*8));

        addEntity(new RedGhost(handler, 48*7, 48*7));
        addEntity(new BlueGhost(handler, 48*9, 48*4));
        addEntity(new PinkGhost(handler, 48*7, 48*7));
        addEntity(new OrangeGhost(handler, 48*10, 48*9));



    }
    private void EntitiesLevel2() {

        addEntity(new Dot(handler, 48, 48));
        addEntity(new Dot(handler, 48, 48*2));
        addEntity(new Dot(handler, 48, 48*3));
        addEntity(new Dot(handler, 48, 48*4));
        addEntity(new Dot(handler, 48, 48*5));
        addEntity(new Dot(handler, 48, 48*6));
        addEntity(new Dot(handler, 48, 48*7));
        addEntity(new Dot(handler, 48, 48*8));
        addEntity(new Dot(handler, 48, 48*9));
        addEntity(new Dot(handler, 48, 48*10));
        addEntity(new Dot(handler, 48, 48*11));
        addEntity(new Dot(handler, 48, 48*12));

        addEntity(new Dot(handler, 48*2, 48));
        addEntity(new Dot(handler, 48*2, 48*3));
        addEntity(new Dot(handler, 48*2, 48*4));
        addEntity(new Dot(handler, 48*2, 48*6));
        addEntity(new Dot(handler, 48*2, 48*7));
        addEntity(new Dot(handler, 48*2, 48*9));
        addEntity(new Dot(handler, 48*2, 48*10));
        addEntity(new Dot(handler, 48*2, 48*11));
        addEntity(new Dot(handler, 48*2, 48*12));

        addEntity(new Dot(handler, 48*3, 48*1));
        addEntity(new Dot(handler, 48*3, 48*4));
        addEntity(new Dot(handler, 48*3, 48*9));
        addEntity(new Dot(handler, 48*3, 48*12));

        addEntity(new Dot(handler, 48*4, 48*1));
        addEntity(new Dot(handler, 48*4, 48*2));
        addEntity(new Dot(handler, 48*4, 48*3));
        addEntity(new Dot(handler, 48*4, 48*4));
        addEntity(new Dot(handler, 48*4, 48*5));
        addEntity(new Dot(handler, 48*4, 48*6));
        addEntity(new Dot(handler, 48*4, 48*7));
        addEntity(new Dot(handler, 48*4, 48*8));
        addEntity(new Dot(handler, 48*4, 48*9));
        addEntity(new Dot(handler, 48*4, 48*10));

        addEntity(new Dot(handler, 48*5, 48*1));
        addEntity(new Dot(handler, 48*5, 48*2));
        addEntity(new Dot(handler, 48*5, 48*3));
        addEntity(new Dot(handler, 48*5, 48*4));
        addEntity(new Dot(handler, 48*5, 48*5));
        addEntity(new Dot(handler, 48*5, 48*6));
        addEntity(new Dot(handler, 48*5, 48*7));
        addEntity(new Dot(handler, 48*5, 48*8));
        addEntity(new Dot(handler, 48*5, 48*9));
        addEntity(new Dot(handler, 48*5, 48*10));
        addEntity(new Dot(handler, 48*5, 48*11));
        addEntity(new Dot(handler, 48*5, 48*12));

        addEntity(new Dot(handler, 48*6, 48*1));
        addEntity(new Dot(handler, 48*6, 48*2));
        addEntity(new Dot(handler, 48*6, 48*3));
        addEntity(new Dot(handler, 48*6, 48*4));
        addEntity(new Dot(handler, 48*6, 48*5));
        addEntity(new Dot(handler, 48*6, 48*6));
        addEntity(new Dot(handler, 48*6, 48*7));
        addEntity(new Dot(handler, 48*6, 48*8));
        addEntity(new Dot(handler, 48*6, 48*9));
        addEntity(new Dot(handler, 48*6, 48*10));
        addEntity(new Dot(handler, 48*6, 48*11));
        addEntity(new Dot(handler, 48*6, 48*12));

        addEntity(new Dot(handler, 48*7, 48*1));
        addEntity(new Dot(handler, 48*7, 48*2));
        addEntity(new Dot(handler, 48*7, 48*4));
        addEntity(new Dot(handler, 48*7, 48*5));
        addEntity(new Dot(handler, 48*7, 48*6));
        addEntity(new Dot(handler, 48*7, 48*7));
        addEntity(new Dot(handler, 48*7, 48*8));
        addEntity(new Dot(handler, 48*7, 48*9));
        addEntity(new Dot(handler, 48*7, 48*11));
        addEntity(new Dot(handler, 48*7, 48*12));

        addEntity(new Dot(handler, 48*8, 48*1));
        addEntity(new Dot(handler, 48*8, 48*5));
        addEntity(new Dot(handler, 48*8, 48*6));
        addEntity(new Dot(handler, 48*8, 48*7));
        addEntity(new Dot(handler, 48*8, 48*8));
        addEntity(new Dot(handler, 48*8, 48*12));

        addEntity(new Dot(handler, 48*9, 48*1));
        addEntity(new Dot(handler, 48*9, 48*5));
        addEntity(new Dot(handler, 48*9, 48*6));
        addEntity(new Dot(handler, 48*9, 48*7));
        addEntity(new Dot(handler, 48*9, 48*8));
        addEntity(new Dot(handler, 48*9, 48*12));

        addEntity(new Dot(handler, 48*10, 48*1));
        addEntity(new Dot(handler, 48*10, 48*2));
        addEntity(new Dot(handler, 48*10, 48*4));
        addEntity(new Dot(handler, 48*10, 48*5));
        addEntity(new Dot(handler, 48*10, 48*6));
        addEntity(new Dot(handler, 48*10, 48*7));
        addEntity(new Dot(handler, 48*10, 48*8));
        addEntity(new Dot(handler, 48*10, 48*9));
        addEntity(new Dot(handler, 48*10, 48*11));
        addEntity(new Dot(handler, 48*10, 48*12));

        addEntity(new Dot(handler, 48*11, 48*1));
        addEntity(new Dot(handler, 48*11, 48*2));
        addEntity(new Dot(handler, 48*11, 48*3));
        addEntity(new Dot(handler, 48*11, 48*4));
        addEntity(new Dot(handler, 48*11, 48*5));
        addEntity(new Dot(handler, 48*11, 48*6));
        addEntity(new Dot(handler, 48*11, 48*7));
        addEntity(new Dot(handler, 48*11, 48*8));
        addEntity(new Dot(handler, 48*11, 48*9));
        addEntity(new Dot(handler, 48*11, 48*10));
        addEntity(new Dot(handler, 48*11, 48*11));
        addEntity(new Dot(handler, 48*11, 48*12));

        addEntity(new Dot(handler, 48*12, 48*1));
        addEntity(new Dot(handler, 48*12, 48*2));
        addEntity(new Dot(handler, 48*12, 48*3));
        addEntity(new Dot(handler, 48*12, 48*4));
        addEntity(new Dot(handler, 48*12, 48*5));
        addEntity(new Dot(handler, 48*12, 48*6));
        addEntity(new Dot(handler, 48*12, 48*7));
        addEntity(new Dot(handler, 48*12, 48*8));
        addEntity(new Dot(handler, 48*12, 48*9));
        addEntity(new Dot(handler, 48*12, 48*10));
        addEntity(new Dot(handler, 48*12, 48*11));
        addEntity(new Dot(handler, 48*12, 48*12));

        addEntity(new Dot(handler, 48*13, 48*1));
        addEntity(new Dot(handler, 48*13, 48*2));
        addEntity(new Dot(handler, 48*13, 48*3));
        addEntity(new Dot(handler, 48*13, 48*4));
        addEntity(new Dot(handler, 48*13, 48*5));
        addEntity(new Dot(handler, 48*13, 48*6));
        addEntity(new Dot(handler, 48*13, 48*7));
        addEntity(new Dot(handler, 48*13, 48*8));
        addEntity(new Dot(handler, 48*13, 48*9));
        addEntity(new Dot(handler, 48*13, 48*10));
        addEntity(new Dot(handler, 48*13, 48*12));

        addEntity(new Dot(handler, 48*14, 48*1));
        addEntity(new Dot(handler, 48*14, 48*4));
        addEntity(new Dot(handler, 48*14, 48*9));
        addEntity(new Dot(handler, 48*14, 48*12));

        addEntity(new Dot(handler, 48*15, 48*1));
        addEntity(new Dot(handler, 48*15, 48*3));
        addEntity(new Dot(handler, 48*15, 48*4));
        addEntity(new Dot(handler, 48*15, 48*6));
        addEntity(new Dot(handler, 48*15, 48*7));
        addEntity(new Dot(handler, 48*15, 48*9));
        addEntity(new Dot(handler, 48*15, 48*10));
        addEntity(new Dot(handler, 48*15, 48*11));
        addEntity(new Dot(handler, 48*15, 48*12));

        addEntity(new Dot(handler, 48*16, 48*1));
        addEntity(new Dot(handler, 48*16, 48*2));
        addEntity(new Dot(handler, 48*16, 48*3));
        addEntity(new Dot(handler, 48*16, 48*4));
        addEntity(new Dot(handler, 48*16, 48*5));
        addEntity(new Dot(handler, 48*16, 48*6));
        addEntity(new Dot(handler, 48*16, 48*7));
        addEntity(new Dot(handler, 48*16, 48*8));
        addEntity(new Dot(handler, 48*16, 48*9));
        addEntity(new Dot(handler, 48*16, 48*10));
        addEntity(new Dot(handler, 48*16, 48*11));
        addEntity(new Dot(handler, 48*16, 48*12));

        addEntity(new RedGhost(handler, 48*7, 48*7));
        addEntity(new BlueGhost(handler, 48*12, 48*4));
        addEntity(new PinkGhost(handler, 48*7, 48*7));
        addEntity(new OrangeGhost(handler, 48*10, 48*9));




    }

    public void Update() throws InvalidFileException {
        Iterator<Entity> it=entities.iterator();
       while(it.hasNext()){
            Entity e = it.next();
            e.Update();
            if(!e.isActive()) {
                it.remove();
            }


        }


    }

    public void Draw(Graphics g){
        for(Entity e : entities){
            e.Draw(g);
        }

    }

    public void addEntity(Entity e){
        entities.add(e);
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }


}
