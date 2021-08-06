package domain;

import domain.stratgies.RandomMoveStrategy;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private final List<Car> cars;
    private final int tryCount;
    private State state;

    public RacingGame(List<Car> cars) {
        this(cars, 0);
    }

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

    public void race() throws IllegalAccessException {
        checkGameStarted();
        for (Car car : cars) {
            car.move(new RandomMoveStrategy());
        }
    }

    private void checkGameStarted() throws IllegalAccessException {
        if (state == State.NOT_START) {
            throw new IllegalAccessException("아직 게임이 시작되지 않았습니다.");
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
