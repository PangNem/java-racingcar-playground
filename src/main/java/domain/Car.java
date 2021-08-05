package domain;

public class Car {

    private final Name name;
    private final Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public boolean isMatchName(String name) {
        return this.name.equals(new Name(name));
    }

    public boolean isMatchPosition(int position) {
        return this.position.equals(new Position(position));
    }
}
