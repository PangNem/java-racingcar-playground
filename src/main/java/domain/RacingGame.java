package domain;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final TryCount tryCount;
    private State state;

    public RacingGame(List<Car> cars) {
        this(cars, 0);
    }

    public RacingGame(List<Car> cars, int tryCount) {
        this.cars = new Cars(cars);
        this.tryCount = new TryCount(tryCount);
        this.state = State.NOT_START;
    }

    public void start() {
        this.state = State.START;
    }

    public boolean isStart() {
        return this.state == State.START;
    }

    public void race() throws IllegalAccessException {
        checkGameStarted();
        cars.move();
    }

    public void checkGameEnd(int raceCount) {
        if (tryCount.equals(new TryCount(raceCount))) {
            this.state = State.END;
        }
    }

    public boolean isEnd() {
        return this.state == State.END;
    }

    private void checkGameStarted() throws IllegalAccessException {
        if (state == State.NOT_START) {
            throw new IllegalAccessException("아직 게임이 시작되지 않았습니다.");
        }
    }

    public List<String> getWinners() {
        return cars.getWinnerCarsName();
    }

    public enum State {
        NOT_START, START, END
    }

}
