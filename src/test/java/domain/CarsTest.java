package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    Cars cars;

    @BeforeEach
    void setUp() {
        List<Car> carList = Arrays.asList(
            new Car("pobi", 2),
            new Car("pang", 3),
            new Car("nem", 3)
        );
        cars = new Cars(carList);
    }

    @Test
    @DisplayName("우승한 자동차 이름 목록을 받는다")
    void getWinnerCarsName() {
        assertThat(cars.getWinnerCarsName()).isEqualTo(Arrays.asList("pang", "nem"));
    }
}
