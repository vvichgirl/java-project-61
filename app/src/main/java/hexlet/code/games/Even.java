package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];

        for (var round = 0; round < Engine.COUNT_ROUND; round++) {
            var numberQuestion = Utils.getNumber(MAX_NUMBER);
            var correctAnswer = isEven(numberQuestion) ? "yes" : "no";
            gameData[round][0] = String.valueOf(numberQuestion);
            gameData[round][1] = correctAnswer;
        }

        Engine.runGame(RULE, gameData);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
