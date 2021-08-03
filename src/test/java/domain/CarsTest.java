package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
    void getWinnerCars() {
        int moveCount = 5;

        List<Car> winnerCars = cars.getWinnerCars(moveCount);

        assertThat(winnerCars.size() > 0).isTrue();
    }

    @Test
    @DisplayName("Cars 객체 생성")
    void carCreated() {
        assertThat(cars.getSize()).isEqualTo(3);
    }
}
