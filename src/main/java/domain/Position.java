package domain;

import java.util.Objects;

public class Position {

    private final int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        checkInvalidNumber(position);
        this.position = position;
    }

    private void checkInvalidNumber(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("포지션은 음수 값이 허용되지 않습니다.");
        }
    }

    public Position increase() {
        return new Position(this.position + 1);
    }

    public int get() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
