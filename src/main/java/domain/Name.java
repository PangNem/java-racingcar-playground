package domain;

import java.util.Objects;

public class Name {

    private static final int MAX_LENGTH = 5;

    private final String name;

    public Name(String name) {
        checkInvalidName(name);
        this.name = name;
    }

    private void checkInvalidName(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("최대 차 이름 글자를 초과하였습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
