package ladder.domain.ladder;

import java.util.ArrayList;
import java.util.List;

public class RandomLineCreator implements LineCreator {

    @Override
    public Line create(int countOfPeople) {
        List<Point> points = new ArrayList<>();
        Point point = initFirst(points);
        point = initMiddle(countOfPeople, points, point);
        initLast(points, point);
        return Line.of(points);
    }

    private Point initMiddle(int countOfPeople, List<Point> points, Point point) {
        while (points.size() < countOfPeople - 1) {
            point = point.next();
            points.add(point);
        }
        return point;
    }

    private void initLast(List<Point> points, Point point) {
        point = point.last();
        points.add(point);
    }

    private Point initFirst(List<Point> points) {
        Point point = Point.first();
        points.add(point);
        return point;
    }
}
