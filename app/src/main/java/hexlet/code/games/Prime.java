package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void run() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];

        for (var round = 0; round < Engine.COUNT_ROUND; round++) {
            var numberQuestion = Utils.getNumber(MAX_NUMBER, MIN_NUMBER);
            var correctAnswer = isPrime(numberQuestion) ? "yes" : "no";
            gameData[round][0] = String.valueOf(numberQuestion);
            gameData[round][1] = correctAnswer;
        }

        Engine.runGame(RULE, gameData);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
