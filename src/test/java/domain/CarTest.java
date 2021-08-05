package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("카 객체 생성 성공")
    void create_car_success() {
        String carName = "pobi";
        Car car = new Car(carName);

        assertThat(car.isMatchName(carName)).isTrue();
        assertThat(car.isMatchPosition(0)).isTrue();
    }
}
