package domain;

public class Car {

    private static final int MOVEABLE_VALUE = 4;

    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
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
            this.position.increse();
        }
    }

    protected int getRandomInt() {
        NumberGenerator numberGenerator = new NumberGenerator();
        return numberGenerator.createRandomNumber();
    }
}
