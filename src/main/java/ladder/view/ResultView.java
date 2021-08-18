package ladder.view;

import java.util.List;
import java.util.stream.Collectors;
import ladder.domain.ladder.Ladder;
import ladder.domain.ladder.Line;
import ladder.domain.ladder.Point;
import ladder.domain.player.PlayerName;
import ladder.domain.player.PlayerNames;
import ladder.utils.StringUtils;

public class ResultView {

    public static final String NEWLINE = System.lineSeparator();
    public static final String HEADER = NEWLINE + "실행결과" + NEWLINE;
    public static final String COLUMN = "|";
    public static final int PADDING = 1;
    public static final String SPACE = " ";
    public static final String HORIZONTAL = "-";
    public static final String NAME_TEMPLATE = "%%-%ds";

    private ResultView() {
    }

    public static void printResult(Ladder ladder, PlayerNames names) {
        System.out.println(HEADER);
        printNames(names);
        printLadder(ladder, names.maxNameLength());
    }

    private static void printNames(PlayerNames playerNames) {
        int width = playerNames.maxNameLength() + PADDING;
        List<String> names = playerNames.getNames()
                .stream()
                .map(name -> nameToString(name, width))
                .collect(Collectors.toList());
        String nameHeader = String.join("", names);
        System.out.println(nameHeader);
    }

    private static String nameToString(PlayerName name, int width) {
        String template = String.format(NAME_TEMPLATE, width);
        return String.format(template, name.value());
    }

    private static void printLadder(Ladder ladder, int width) {
        ladder.getLines()
                .forEach(line -> printLine(line, width));
    }

    public static void printLine(Line line, int width) {
        List<String> tokens = line.getPoints()
                .stream()
                .map(point -> pointToString(point, width))
                .collect(Collectors.toList());
        String row = COLUMN + String.join(COLUMN, tokens);
        System.out.println(row);
    }

    public static String pointToString(Point point, int ladderWidth) {
        if (point.isRight()) {
            return StringUtils.repeat(HORIZONTAL, ladderWidth);
        }
        return StringUtils.repeat(SPACE, ladderWidth);
    }
}
