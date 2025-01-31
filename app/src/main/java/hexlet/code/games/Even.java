package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        var countRound = Engine.getCountRound();
        String[][] gameData = new String[countRound][2];

        for (var round = 0; round < countRound; round++) {
            var numberQuestion = Engine.getNumber(MAX_NUMBER);
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
