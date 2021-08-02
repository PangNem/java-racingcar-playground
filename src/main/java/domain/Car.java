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

    public boolean isNameMatch(String carName) {
        return name.equals(carName);
    }

    public boolean isPositionMatch(int position) {
        return this.position == position;
    }
}
