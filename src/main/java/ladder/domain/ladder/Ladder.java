package ladder.domain.ladder;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {

    List<Line> lines;

    private Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public Ladder of(List<Line> lines) {
        return new Ladder(lines);
    }

    public static Ladder of(int height, int countOfPeople) {
        List<Line> lines = IntStream.range(0, height)
                .mapToObj(i -> Line.of(countOfPeople))
                .collect(Collectors.toList());
        return new Ladder(lines);
    }

    public List<Line> getLines() {
        return Collections.unmodifiableList(lines);
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "lines=" + lines +
                '}';
    }
}
