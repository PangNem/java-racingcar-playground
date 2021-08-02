package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차 이름을 지정하여 생성한다")
    void car() {
        String carName = "pobi";

        Car car = new Car(carName);

        assertThat(car.isNameMatch(carName)).isTrue();
        assertThat(car.isPositionMatch(0)).isTrue();
    }
}
