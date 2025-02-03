package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getNumber(int maxNumber) {
        Random random = new Random();
        int numRandom = random.nextInt(maxNumber);
        return numRandom;
    }

    public static int getNumber(int maxNumber, int minNumber) {
        Random random = new Random();
        int numRandom = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        return numRandom;
    }
}
