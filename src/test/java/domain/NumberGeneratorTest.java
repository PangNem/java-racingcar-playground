package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberGeneratorTest {

    @Test
    @DisplayName("1~10 랜덤한 숫자를 생성한다")
    void createRandomNumber() {
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> randomNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int actual = numberGenerator.createRandomNumber();

        assertThat(randomNumbers.contains(actual)).isTrue();
    }
}
