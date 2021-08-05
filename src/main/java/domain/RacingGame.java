package domain;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private List<Car> cars;
    private State state;

    public RacingGame() {
        this.state = State.NOT_START;
    }

    public RacingGame(List<Car> cars) {
        this.cars = cars;
        this.state = State.NOT_START;
    }

    public void start() {
        this.state = State.START;
    }

    public boolean isStart() {
        return this.state == State.START;
    }

    public List<String> getWinners() {
        int maxPosition = getMaxPosition();
        return cars.stream()
            .filter(car -> car.isWinner(maxPosition))
            .map(Car::getName)
            .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return cars.stream()
            .mapToInt(Car::getPosition)
            .max()
            .orElse(0);
    }

    public enum State {
        NOT_START, START, END
    }

}
