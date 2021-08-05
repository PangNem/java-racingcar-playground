package domain;

import java.util.Random;

public class RandomNumberGenerator {

    private static final int BOUND = 9;

    public int generate() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}
