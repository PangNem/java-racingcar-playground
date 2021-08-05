package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

    RacingGame racingGame;

    @BeforeEach
    void setUp() {

        List<Car> cars = Arrays.asList(
            new Car("pobi", 2),
            new Car("pang", 2),
            new Car("nem", 3)
        );
        racingGame = new RacingGame(cars);
    }

    @Test
    @DisplayName("우승자를 목록을 구한다")
    void getWinners() {
        List<String> winners = racingGame.getWinners();

        assertThat(winners).isEqualTo(Arrays.asList("nem"));
    }

    @Test
    @DisplayName("레이싱 게임을 시작한다")
    void start() {
        assertThat(racingGame.isStart()).isFalse();

        racingGame.start();
        assertThat(racingGame.isStart()).isTrue();
    }
}
