package GAME;

import GAME.Entities.MovingCreatures.Player;
import GAME.Entities.EntityManager; 
import GAME.Tiles.Tile;

import java.awt.*;

public class Map {
    private int width, height;
    private int initialPlayerX, initialPlayerY;

    private Grid<Tile> gameTiles;

    private final EntityManager entityManager;

    public Map(Handler handler, String path) throws InvalidFileException {

        entityManager = new EntityManager(handler, new Player(handler, 100, 100));

        loadMap(path);

        entityManager.getPlayer().setx(initialPlayerX);
        entityManager.getPlayer().sety(initialPlayerY);
    }

    private void loadMap(String path) throws InvalidFileException {
        String file = ReadMap.loadFile(path);
        String[] element = file.split("\\s+");

        width = ReadMap.ToInt(element[0]);
        height = ReadMap.ToInt(element[1]);

        initialPlayerX = ReadMap.ToInt(element[2]);
        initialPlayerY = ReadMap.ToInt(element[3]);

        gameTiles = new Grid<>(height, width);

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                int arrayIndex = (j * width) + i + 4;
                if (arrayIndex < element.length) {
                    int tileId = ReadMap.ToInt(element[arrayIndex]);
                    Tile t = Tile.getTileById(tileId);
                    if (t == null) {
                        System.err.println("Warning: Unknown Tile ID " + tileId + " at grid position (" + i + ", " + j + "). Using default block tile.");
                        t = Tile.getBlock();
                    }
                    gameTiles.setCell(j, i, t);
                } else {
                    System.err.println("Error: Not enough tile data in map file for grid position (" + i + ", " + j + ").");
                    gameTiles.setCell(j, i, Tile.getBlock());
                }
            }
        }
    }

    public void Update() throws InvalidFileException {
        entityManager.Update();
    }

    public Tile getTile(int x, int y) {
        if (gameTiles != null) {
            return gameTiles.getCell(y, x);
        }
        return Tile.getBlock();
    }

    public void Draw(Graphics g) {
        if (gameTiles != null) {
            for (int j = 0; j < height; j++) {
                for (int i = 0; i < width; i++) {
                    Tile t = gameTiles.getCell(j, i);
                    if (t != null) {
                        t.Draw(g, i * Tile.getTileWidth(), j * Tile.getTileHeight());
                    }
                }
            }
        }
        entityManager.Draw(g);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }


}