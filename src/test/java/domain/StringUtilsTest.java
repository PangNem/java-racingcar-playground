package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    @DisplayName("문자열을 전달하면 쉼표(,)로 구분해 배열로 전달한다")
    void splitToArray() {
        String[] actual = StringUtils.splitToArray("111,222,333");

        assertThat(actual).isEqualTo(Stream.of("111", "222", "333").toArray(String[]::new));
    }
}
