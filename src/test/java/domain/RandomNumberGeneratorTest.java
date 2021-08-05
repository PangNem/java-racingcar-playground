package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {

    @Test
    @DisplayName("랜덤 숫자 생성")
    void generator() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        int actual = randomNumberGenerator.generate();

        assertThat(actual).isBetween(0, 9);
    }
}
