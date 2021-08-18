package ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import ladder.domain.ladder.Point;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void next() {
        Point point = Point.first(true);
        assertThat(point.next(false)).isEqualTo(Point.first(false));
    }

    @Test
    void next_InvalidTwoHorizontals() {
        Point point = Point.first(true);
        assertThatThrownBy(() -> point.next(true))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void last() {
        Point point = Point.first(true);
        assertThat(point.last()).isEqualTo(Point.first(false));
    }
}
