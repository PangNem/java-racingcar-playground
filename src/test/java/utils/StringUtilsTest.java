package utils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    @DisplayName("차 이름을 전달하면 쉼표로 구분해 리스트로 전달한다")
    void split() {
        String carNames = "pobi,pang,nem";
        List<String> expectedCarNames = Arrays.asList("pobi", "pang", "nem");

        List<String> actual = StringUtils.split(carNames);

        assertThat(actual).isEqualTo(expectedCarNames);
    }
}
