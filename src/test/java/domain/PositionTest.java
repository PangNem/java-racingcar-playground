package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void position() {
        Position position = new Position();

        assertThat(position).isEqualTo(new Position());
    }
}
