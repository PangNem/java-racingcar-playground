package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {

    @ParameterizedTest
    @DisplayName("null 혹은 빈값 전달 시 에러")
    @NullAndEmptySource
    void value_null(String input) {
        assertThatThrownBy(() -> {
            new Name(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("5글자 초과 혹은 빈값 전달 시 에러 발생")
    @ValueSource(strings = {"pangnem"})
    void check_invalid_name(String input) {
        assertThatThrownBy(() -> {
            new Name(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("name 객체 생성 테스트")
    void create_name_test() {
        String carName = "pobi";
        Name name = new Name(carName);

        assertThat(name).isEqualTo(new Name(carName));
    }
}
