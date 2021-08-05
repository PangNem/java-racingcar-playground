package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    @DisplayName("name 객체 생성 테스트")
    void create_name_test() {
        Name name = new Name("pobi");

        assertThat(name).isEqualTo(new Name("pobi"));
    }
}
