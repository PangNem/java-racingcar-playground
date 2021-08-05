package domain;

public class RacingGame {

    private State state;

    public RacingGame() {
        this.state = State.NOT_START;
    }

    public void start() {
        this.state = State.START;
    }

    public boolean isStart() {
        return this.state == State.START;
    }

    public enum State {
        NOT_START, START, END
    }

}
