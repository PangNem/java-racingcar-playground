package stratgies;

import java.util.Random;

public class RandomMoveStrategy implements MovingStrategy {

    private static final int BOUND = 9;

    @Override
    public int getNumber() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}
