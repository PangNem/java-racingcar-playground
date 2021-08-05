package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomStrategyTest {

    @Test
    @DisplayName("랜덤 숫자 생성")
    void generator() {
        RandomStrategy randomNumberGenerator = new RandomStrategy();

        int actual = randomNumberGenerator.getNumber();

        assertThat(actual).isBetween(0, 9);
    }
}
