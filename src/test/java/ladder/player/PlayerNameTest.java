package ladder.player;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import ladder.domain.player.PlayerName;
import org.junit.jupiter.api.Test;

class PlayerNameTest {

    @Test
    void invalid_of() {
        assertThatThrownBy(() -> PlayerName.of("pororo"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void length() {
        PlayerName gazua = PlayerName.of("gazua");
        assertThat(gazua.length()).isEqualTo(5);
    }
}
