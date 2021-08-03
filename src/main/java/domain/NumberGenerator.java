package domain;

public class NumberGenerator {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    public int createRandomNumber() {
        return (int) ((Math.random() * MAX_NUMBER) + MIN_NUMBER);
    }
}
