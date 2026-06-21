package GAME;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GameFileManager {
    private static final String FILE_NAME = "gamestate.txt";

    public void saveGame(int level, int lives, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(level + "\n");
            writer.write(lives + "\n");
            writer.write(score + "\n");
        } catch (IOException e) {
            System.err.println("Error saving game state: " + e.getMessage());
        }
    }

    public int[] loadGame() {
        int[] data = new int[3]; 
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            data[0] = Integer.parseInt(reader.readLine()); 
            data[1] = Integer.parseInt(reader.readLine()); 
            data[2] = Integer.parseInt(reader.readLine()); 
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading game state or file not found. Starting new game. " + e.getMessage());
            
            data[0] = 1; 
            data[1] = 5; 
            data[2] = 0; 
        }
        return data;
    }
}