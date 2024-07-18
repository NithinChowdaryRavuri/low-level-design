package snakeandladdergame;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final int BOARD_SIZE = 100;
    private final List<Jump> snakes;
    private final List<Jump> ladders;

    public Board() {
        snakes = new ArrayList<>();
        ladders = new ArrayList<>();
        initializeSnakesAndLadders();
    }

    private void initializeSnakesAndLadders() {
        // Initialize snakes
        snakes.add(new Jump(16, 6));
        snakes.add(new Jump(48, 26));
        snakes.add(new Jump(64, 60));
        snakes.add(new Jump(93, 73));

        // Initialize ladders
        ladders.add(new Jump(1, 38));
        ladders.add(new Jump(4, 14));
        ladders.add(new Jump(9, 31));
        ladders.add(new Jump(21, 42));
        ladders.add(new Jump(28, 84));
        ladders.add(new Jump(51, 67));
        ladders.add(new Jump(80, 99));
    }

    public int getBoardSize() {
        return BOARD_SIZE;
    }

    public int getNewPositionAfterSnakeOrLadder(int position) {
        for (Jump snake : snakes) {
            if (snake.getStart() == position) {
                return snake.getEnd();
            }
        }

        for (Jump ladder : ladders) {
            if (ladder.getStart() == position) {
                return ladder.getEnd();
            }
        }

        return position;
    }
}
