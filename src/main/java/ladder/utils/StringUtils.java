package ladder.utils;

import java.util.Collections;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isEmptyOrNull(String string) {
        return string == null || string.isEmpty();
    }

    public static String repeat(String string, int count) {
        return String.join("", Collections.nCopies(count, string));
    }

}
