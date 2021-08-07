package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

    Position position;

    @BeforeEach
    void setUp() {
        position = new Position(3);
    }

    @Test
    @DisplayName("포지션 값 가져오기")
    void get() {
        assertThat(position.get()).isEqualTo(3);
    }

    @Test
    @DisplayName("포지션 값 증가")
    void increase() {
        assertThat(position.increase()).isEqualTo(new Position(4));
    }

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
        assertThat(position).isEqualTo(new Position(3));
    }
}
