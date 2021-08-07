package domain;

import domain.stratgies.RandomMoveStrategy;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> getWinnerCarsName() {
        int maxPosition = getMaxPosition();
        return cars.stream()
            .filter(car -> car.isWinner(maxPosition))
            .map(Car::getName)
            .collect(Collectors.toList());
    }

    public void move() {
        for (Car car : cars) {
            car.move(new RandomMoveStrategy());
        }
    }

    private int getMaxPosition() {
        return cars.stream()
            .mapToInt(Car::getPosition)
            .max()
            .orElse(0);
    }
}
