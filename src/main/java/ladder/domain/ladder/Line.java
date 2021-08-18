package ladder.domain.ladder;

import java.util.Collections;
import java.util.List;

public class Line {

    private final List<Point> points;

    private Line(List<Point> points) {
        verify(points);
        this.points = points;
    }

    public static Line of(List<Point> points) {
        return new Line(points);
    }

    public static Line of(int countOfPerson) {
        LineCreator lineCreator = new RandomLineCreator();
        return lineCreator.create(countOfPerson);
    }

    private void verify(List<Point> points) {
        for (int i = 1; i < points.size(); i++) {
            verifyAt(points, i);
        }
    }

    private void verifyAt(List<Point> points, int i) {
        if (isConsecutive(points, i)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isConsecutive(List<Point> points, int i) {
        return points.get(i - 1).isRight() && points.get(i).isRight();
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + points +
                '}';
    }
}
