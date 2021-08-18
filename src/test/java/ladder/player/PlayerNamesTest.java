package ladder.player;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import ladder.domain.player.PlayerNames;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerNamesTest {

    private PlayerNames playerNames;

    @BeforeEach
    void setUp() {
        playerNames = PlayerNames.of(Arrays.asList("pobi", "honux", "crong", "jk"));
    }

    @Test
    void size() {
        assertThat(playerNames.size()).isEqualTo(4);
    }

    @Test
    void maxNameLength() {
        assertThat(playerNames.maxNameLength()).isEqualTo(5);
    }
}
