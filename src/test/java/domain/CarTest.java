package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차 이름이 5글자를 초과할 경우 에러를 발생시킨다")
    void throwWhenNameBiggerThan5() {
        String carName = "pangnem";

        assertThatThrownBy(() ->
            new Car(carName)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 이름을 지정하여 생성한다")
    void createCarWithName() {
        String carName = "pobi";

        Car car = new Car(carName);

        assertThat(car.isNameMatch(carName)).isTrue();
        assertThat(car.isPositionMatch(0)).isTrue();
    }
}
