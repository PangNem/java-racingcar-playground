import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("//와 \n 문자 사이 커스텀 구분자 지정")
    void 커스텀_구분자() {
        int actual = calculator.splitAndSum("//;\n1;2;3");

        assertThat(actual).isEqualTo(6);
    }

    @Test
    @DisplayName("음수를 전달할 경우 예외 발생")
    void 음수_예외() {
        assertThatThrownBy(() -> {
            calculator.splitAndSum("-1,2,3");
        }).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("쉼표로 구분된 값을 전달할 경우 각 숫자의 합을 반환한다")
    void 구분자_쉼표() {
        int actual = calculator.splitAndSum("1,2,3");

        assertThat(actual).isEqualTo(6);
    }

    @Test
    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    void 숫자_하나_문자열() {
        int actual = calculator.splitAndSum("3");

        assertThat(actual).isEqualTo(3);
    }

    @Test
    @DisplayName("null 혹은 빈값을 넣을 경우 0을 반환한다")
    void null_혹은_빈값() {
        int actual = calculator.splitAndSum(null);
        assertThat(actual).isEqualTo(0);

        actual = calculator.splitAndSum("");
        assertThat(actual).isEqualTo(0);
    }
}
