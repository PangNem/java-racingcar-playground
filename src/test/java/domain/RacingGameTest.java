package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

    @Test
    @DisplayName("레이싱 게임을 시작한다.")
    void start() {
        RacingGame racingGame = new RacingGame();
        assertThat(racingGame.isStart()).isFalse();

        racingGame.start();
        assertThat(racingGame.isStart()).isTrue();
    }
}
