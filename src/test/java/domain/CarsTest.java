package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars();

        cars.add(new Car("car1"));
        cars.add(new Car("car2"));
        cars.add(new Car("car3"));
    }

    @Test
    void getWinnerCars() throws IllegalAccessException {
        assertThatThrownBy(() -> {
            cars.getWinnerCars();
        }).isInstanceOf(IllegalAccessException.class);

        cars.move();

        List<Car> winnerCars = cars.getWinnerCars();
        assertThat(winnerCars.size() > 0).isTrue();
    }

    @Test
    @DisplayName("Cars 객체 생성")
    void carCreated() {
        assertThat(cars.getSize()).isEqualTo(3);
    }
}
