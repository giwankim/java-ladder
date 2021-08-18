package ladder.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import ladder.domain.ladder.Line;
import ladder.domain.ladder.Point;
import org.junit.jupiter.api.Test;

class LineTest {

    @Test
    void of_Invalid() {
        List<Point> points = Arrays.asList(Point.first(true), Point.first(true));
        assertThatThrownBy(() -> Line.of(points))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
