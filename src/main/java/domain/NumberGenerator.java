package domain;

public class NumberGenerator {

    public int createRandomNumber() {
        return (int) ((Math.random() * 10) + 1);
    }
}
