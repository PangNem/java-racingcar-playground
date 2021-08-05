package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import domain.stratgies.MoveStrategy;
import domain.stratgies.NonMoveStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("특정 충족 시 차가 이동한다.")
    void move() {
        String carName = "pobi";
        Car car = new Car(carName);

        car.move(new NonMoveStrategy());
        assertThat(car.isMatchPosition(0)).isTrue();

        car.move(new MoveStrategy());
        assertThat(car.isMatchPosition(1)).isTrue();

        car.move(() -> 7);
        assertThat(car.isMatchPosition(2)).isTrue();
    }

    @Test
    @DisplayName("카 객체 생성 성공")
    void create_car_success() {
        String carName = "pobi";
        Car car = new Car(carName);

        assertThat(car.isMatchName(carName)).isTrue();
        assertThat(car.isMatchPosition(0)).isTrue();
    }
}
