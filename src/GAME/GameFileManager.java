package GAME;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GameFileManager {
    private static final String FILE_NAME = "gamestate.txt";
    private static final String LEADERBOARD_FILE_NAME = "leaderboard.txt";
    private static final int MAX_LEADERBOARD_SCORES = 5;

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
            if (data[0] < 1 || data[0] > 4 || data[1] < 0) {
                throw new NumberFormatException("Invalid saved level or lives");
            }
        } catch (IOException | NumberFormatException | NullPointerException e) {
            System.err.println("Error loading game state or file not found. Starting new game. " + e.getMessage());
            
            data[0] = 1; 
            data[1] = 5; 
            data[2] = 0; 
        }
        return data;
    }

    public void saveLeaderboardScore(int score) {
        List<Integer> scores = loadLeaderboardScores();
        scores.add(score);
        Collections.sort(scores, Collections.reverseOrder());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LEADERBOARD_FILE_NAME))) {
            int limit = Math.min(MAX_LEADERBOARD_SCORES, scores.size());
            for (int i = 0; i < limit; i++) {
                writer.write(String.valueOf(scores.get(i)));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving leaderboard: " + e.getMessage());
        }
    }

    public List<Integer> loadLeaderboardScores() {
        List<Integer> scores = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(LEADERBOARD_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    scores.add(Integer.parseInt(line.trim()));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid leaderboard score: " + line);
                }
            }
        } catch (IOException e) {
            return scores;
        }

        Collections.sort(scores, Collections.reverseOrder());
        if (scores.size() > MAX_LEADERBOARD_SCORES) {
            return new ArrayList<>(scores.subList(0, MAX_LEADERBOARD_SCORES));
        }
        return scores;
    }
}
