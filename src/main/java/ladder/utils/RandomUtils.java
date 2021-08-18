package ladder.utils;

import java.util.Random;

public class RandomUtils {

    private static final Random random = new Random();

    private RandomUtils() {
    }

    public static boolean generate() {
        return random.nextBoolean();
    }
}
