package domain;

import domain.stratgies.RandomMoveStrategy;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private final List<Car> cars;

    private State state;
    private int tryCount;

    public RacingGame(List<Car> cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
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

    public void race(int raceCount) {
        for (Car car : cars) {
            car.move(new RandomMoveStrategy());
        }
    }

    public void checkGameEnd(int raceCount) {
        if (raceCount >= tryCount) {
            this.state = State.END;
        }
    }

    public boolean isEnd() {
        return this.state == State.END;
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
