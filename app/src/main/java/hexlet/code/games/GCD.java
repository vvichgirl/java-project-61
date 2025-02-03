package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public static int gcd(int numberOne, int numberTwo) {
        if (numberTwo > 0) {
            return gcd(numberTwo, numberOne % numberTwo);
        }
        return numberOne;
    }

    public static void run() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];

        for (var round = 0; round < Engine.COUNT_ROUND; round++) {
            var numberOne = Utils.getNumber(MAX_NUMBER);
            var numberTwo = Utils.getNumber(MAX_NUMBER);
            var question = numberOne + " " + numberTwo;
            var correctAnswer = gcd(numberOne, numberTwo);
            gameData[round][0] = question;
            gameData[round][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame(RULE, gameData);
    }
}
