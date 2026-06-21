package GAME.Entities.Statics;

import GAME.Entities.Entity;
import GAME.Handler;

public abstract class StaticEntity extends Entity {
    public StaticEntity(Handler handler, double x, double y, int width, int height) {
        super(handler, x, y, width, height);
    }

}
