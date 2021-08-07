package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    @DisplayName("5글자 초과 혹은 빈값 전달 시 에러 발생")
    void check_invliad_name() {
        assertThatThrownBy(() -> {
            new Name("pangnem");
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            new Name("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("name 객체 생성 테스트")
    void create_name_test() {
        Name name = new Name("pobi");

        assertThat(name).isEqualTo(new Name("pobi"));
    }
}
