package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    @DisplayName("음수 값 전달 시 에러 발생")
    void invalid_position() {
        assertThatThrownBy(() -> {
            new Position(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("포지션 객체 생성 테스트")
    void position() {
        Position position = new Position();

        assertThat(position).isEqualTo(new Position());
    }
}
