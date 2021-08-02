package domain;

public class Name {

    private final String name;

    public Name(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("최대 자동차 이름을 초과하였습니다.");
        }
        this.name = name;
    }

    public boolean isNameMatch(String name) {
        return this.name.equals(name);
    }
}
