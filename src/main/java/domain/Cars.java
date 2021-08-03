package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public int getSize() {
        return cars.size();
    }

    public List<Car> getWinnerCars(int moveCount) {
        moveAll(moveCount);

        int maxPosition = getMaxPosition();
        return cars.stream()
            .filter(car -> car.isMatchPosition(maxPosition))
            .collect(Collectors.toList());
    }

    private void moveAll(int moveCount) {
        int startIndex = 0;
        for (int i = startIndex; i < moveCount; i++) {
            move();
        }
    }

    private void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    private int getMaxPosition() {
        return cars.stream()
            .mapToInt(Car::getPosition)
            .max()
            .orElse(0);
    }
}
