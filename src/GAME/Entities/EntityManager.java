package GAME.Entities;

import GAME.Handler;
import GAME.InvalidFileException;
import GAME.Map;
import GAME.Entities.MovingCreatures.BlueGhost;
import GAME.Entities.MovingCreatures.OrangeGhost;
import GAME.Entities.MovingCreatures.PinkGhost;
import GAME.Entities.MovingCreatures.Player;
import GAME.Entities.MovingCreatures.RedGhost;
import GAME.Entities.Statics.Dot;
import GAME.Tiles.Tile;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public final class EntityManager {
    private static final int BACKGROUND_TILE_ID = 15;

    private static final int[][][] GHOST_POSITIONS = {
            {{7, 7}, {9, 4}, {7, 7}, {10, 9}},
            {{7, 7}, {12, 4}, {7, 7}, {10, 9}},
            {{1, 11}, {9, 4}, {15, 9}, {15, 10}},
            {{1, 8}, {9, 4}, {5, 1}, {15, 8}}
    };

    private Handler handler;
    private final Player player;
    private ArrayList<Entity> entities;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();

        loadDotsFromMap();
        loadGhostsForCurrentLevel();
        addEntity(player);
    }

    private void loadDotsFromMap() {
        Map map = handler.getMap();
        int playerTileX = (int) (player.getX() / Tile.getTileWidth());
        int playerTileY = (int) (player.getY() / Tile.getTileHeight());

        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                Tile tile = map.getTile(x, y);
                boolean isPlayerStart = x == playerTileX && y == playerTileY;

                if (tile.getId() == BACKGROUND_TILE_ID && !isPlayerStart) {
                    addEntity(new Dot(handler, x * Tile.getTileWidth(), y * Tile.getTileHeight()));
                }
            }
        }
    }

    private void loadGhostsForCurrentLevel() {
        int levelIndex = handler.getGame().getLevel() - 1;
        if (levelIndex < 0 || levelIndex >= GHOST_POSITIONS.length) {
            return;
        }

        int[][] ghostPositions = GHOST_POSITIONS[levelIndex];

        addEntity(new RedGhost(handler, toPixelX(ghostPositions[0][0]), toPixelY(ghostPositions[0][1])));
        addEntity(new BlueGhost(handler, toPixelX(ghostPositions[1][0]), toPixelY(ghostPositions[1][1])));
        addEntity(new PinkGhost(handler, toPixelX(ghostPositions[2][0]), toPixelY(ghostPositions[2][1])));
        addEntity(new OrangeGhost(handler, toPixelX(ghostPositions[3][0]), toPixelY(ghostPositions[3][1])));
    }

    private int toPixelX(int tileX) {
        return tileX * Tile.getTileWidth();
    }

    private int toPixelY(int tileY) {
        return tileY * Tile.getTileHeight();
    }

    public void Update() throws InvalidFileException {
        Iterator<Entity> it = entities.iterator();
        while (it.hasNext()) {
            Entity e = it.next();
            e.Update();
            if (!e.isActive()) {
                it.remove();
            }
        }
    }

    public void Draw(Graphics g) {
        for (Entity e : entities) {
            e.Draw(g);
        }
    }

    public void addEntity(Entity e) {
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

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
}
