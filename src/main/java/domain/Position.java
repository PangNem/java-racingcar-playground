package domain;

public class Position {

    private int position;

    public Position(int position) {
        this.position = position;
    }

    public boolean isPositionMatch(int position) {
        return this.position == position;
    }

    public void increse() {
        this.position++;
    }
}
