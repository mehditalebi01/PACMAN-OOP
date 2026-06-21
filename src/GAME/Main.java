package GAME;

public class Main {

    public static void main(String[] args){
        GameFileManager gameFileManager = new GameFileManager();

        Game game = new Game("Game", 864, 672, gameFileManager);
        game.StartGame();
        Sound.getBeginningSound().play();
    }
}