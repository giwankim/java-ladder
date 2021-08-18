package ladder.domain.ladder;

import static ladder.utils.RandomUtils.generate;

import java.util.Objects;

public class Point {

    private final boolean right;

    private Point(boolean right) {
        this.right = right;
    }

    public static Point first(boolean right) {
        return new Point(right);
    }

    public static Point first() {
        return new Point(generate());
    }

    public Point next(boolean right) {
        if (this.right && right) {
            throw new IllegalArgumentException();
        }
        return new Point(right);
    }

    public Point next() {
        if (this.right) {
            return new Point(false);
        }
        return new Point(generate());
    }

    public Point last() {
        return new Point(false);
    }

    public boolean isRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return right == point.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(right);
    }

    @Override
    public String toString() {
        return "Point{" +
                "right=" + right +
                '}';
    }
}
