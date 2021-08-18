package ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static final String COMMA_DELIMITER_REGEX = "\\s*,\\s*";
    public static final String NEWLINE = System.lineSeparator();
    public static final String NAMES_PROMPT = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String HEIGHT_PROMPT = NEWLINE + "최대 사다리 높이는 몇 개인가요?";

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static List<String> playerNames() {
        System.out.println(NAMES_PROMPT);
        String text = scanner.nextLine();
        return Arrays.asList(text.split(COMMA_DELIMITER_REGEX));
    }

    public static int ladderHeight() {
        System.out.println(HEIGHT_PROMPT);
        return Integer.parseInt(scanner.nextLine());
    }
}
