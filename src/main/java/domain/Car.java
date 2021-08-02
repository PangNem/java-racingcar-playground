package domain;

public class Car {

    private final Name name;
    private final Position position;

    public Car(String name) {

        this.name = new Name(name);
        this.position = new Position(0);
    }

    public boolean isNameMatch(String name) {
        return this.name.isNameMatch(name);
    }

    public boolean isPositionMatch(int position) {
        return this.position.isPositionMatch(position);
    }
}
