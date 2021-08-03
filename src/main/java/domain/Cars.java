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

    public List<Car> getWinnerCars() throws IllegalAccessException {
        int maxPosition = getMaxPosition();
        return cars.stream()
            .filter(car -> car.isMatchPosition(maxPosition))
            .collect(Collectors.toList());
    }

    public void move(int moveCount) {
        int startIndex = 0;
        for (int i = startIndex; i < moveCount; i++) {
            cars.forEach(Car::move);
        }
    }

    private int getMaxPosition() throws IllegalAccessException {
        return cars.stream()
            .mapToInt(Car::getPosition)
            .filter(position -> position != Car.START_POSITION)
            .max()
            .orElseThrow(() -> new IllegalAccessException("아직 경기가 시작되지 않았습니다."));
    }
}
