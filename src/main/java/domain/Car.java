package domain;

public class Car {

    private final Name name;
    private Position position;

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

    public Position move() {
        if (getRandomInt() > 4) {
            this.position.increse();
        }
        return this.position;
    }

    protected int getRandomInt() {
        NumberGenerator numberGenerator = new NumberGenerator();
        return numberGenerator.createRandomNumber();
    }
}
