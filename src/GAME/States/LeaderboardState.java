package GAME.States;

import GAME.XGraphics.Assets;
import GAME.Handler;
import GAME.InvalidFileException;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public final class LeaderboardState extends State {

    private final Rectangle backButton;

    public LeaderboardState(Handler handler) {
        super(handler);
        backButton = new Rectangle(312, 560, 240, 55);
    }

    @Override
    public void Update() throws InvalidFileException {
        if (getHandler().getMouse().pressed_left() &&
                backButton.contains(getHandler().getMouse().getX(), getHandler().getMouse().getY())) {
            State.setState(getHandler().getGame().getMenuState());
        }
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.getStartMenu(), 0, 0, getHandler().getGame().getWidth(), getHandler().getGame().getHeight(), null);

        g.setColor(Color.YELLOW);
        g.setFont(new Font("Sergiue", Font.BOLD, 54));
        g.drawString("Leaderboard", 255, 135);

        List<Integer> scores = getHandler().getGameFileManager().loadLeaderboardScores();
        g.setFont(new Font("Sergiue", Font.BOLD, 34));
        g.setColor(Color.WHITE);

        if (scores.isEmpty()) {
            g.drawString("No scores yet", 330, 260);
        } else {
            for (int i = 0; i < scores.size(); i++) {
                g.drawString((i + 1) + ". " + scores.get(i), 360, 235 + i * 55);
            }
        }

        g.setColor(Color.BLACK);
        g.fillRect(backButton.x, backButton.y, backButton.width, backButton.height);
        g.setColor(Color.YELLOW);
        g.drawRect(backButton.x, backButton.y, backButton.width, backButton.height);
        g.setFont(new Font("Sergiue", Font.BOLD, 32));
        g.drawString("Back", backButton.x + 82, backButton.y + 38);
    }
}
