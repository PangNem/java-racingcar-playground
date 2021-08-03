package domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int MOVEABLE_VALUE = 4;

    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(START_POSITION);
    }

    public boolean isMatchName(String name) {
        return this.name.isNameMatch(name);
    }

    public boolean isMatchPosition(int position) {
        return this.position.isPositionMatch(position);
    }

    public void print() {
        System.out.printf("name: %s, position: %s", this.name, this.position);
    }

    public void move() {
        if (getRandomInt() > MOVEABLE_VALUE) {
            this.position.increase();
        }
    }

    protected int getRandomInt() {
        NumberGenerator numberGenerator = new NumberGenerator();
        return numberGenerator.createRandomNumber();
    }

    public int getPosition() {
        return this.position.getPosition();
    }
}

class Name {

    private final String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("최대 자동차 이름을 초과하였습니다.");
        }
    }

    public boolean isNameMatch(String name) {
        return this.name.equals(name);
    }
}

class Position {

    private int position;

    public Position(int position) {
        this.position = position;
    }

    public boolean isPositionMatch(int position) {
        return this.position == position;
    }

    public void increase() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}
