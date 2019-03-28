package ladder.domain.ladder;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class LineTest {
    @Test
    public void 가로가_겹치지_않는_정상의_경우() {
        // given
        List<Point> points = Arrays.asList(Point.NOT_CROSS, Point.NOT_CROSS, Point.CROSS);

        // when
        // then
        new Line(points);
    }

    @Test
    public void 가로가_겹치는_경우_IllegalArgumentException() {
        // given
        List<Point> points = Arrays.asList(Point.NOT_CROSS, Point.CROSS, Point.CROSS);

        // when
        // then
        assertThatIllegalArgumentException().isThrownBy(() -> new Line(points));
    }
}