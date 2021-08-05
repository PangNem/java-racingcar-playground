package domain;

public class Car {

    private final String name;
    private final int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public boolean isMatchName(String name) {
        return this.name.equals(name);
    }

    public boolean isMatchPosition(int position) {
        return this.position == position;
    }
}
