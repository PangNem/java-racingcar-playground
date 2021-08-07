package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import stratgies.MoveStrategy;
import stratgies.NonMoveStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        String carName = "pobi";
        car = new Car(carName);
    }

    @Test
    @DisplayName("특정 조건 충족 시 차가 이동한다.")
    void move() {
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
        assertThat(car.isMatchName("pobi")).isTrue();
        assertThat(car.isMatchPosition(0)).isTrue();
    }
}
