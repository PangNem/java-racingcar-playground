package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class TryCountTest {

    @Test
    void tryCount() {
        int tryCount = 5;
        TryCount actual = new TryCount(tryCount);

        assertThat(actual).isEqualTo(new TryCount(tryCount));
    }
}
