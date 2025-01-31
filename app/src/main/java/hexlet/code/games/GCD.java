package hexlet.code.games;

import hexlet.code.Engine;

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
        var countRound = Engine.getCountRound();
        String[][] gameData = new String[countRound][2];

        for (var round = 0; round < countRound; round++) {
            var numberOne = Engine.getNumber(MAX_NUMBER);
            var numberTwo = Engine.getNumber(MAX_NUMBER);
            var question = numberOne + " " + numberTwo;
            var correctAnswer = gcd(numberOne, numberTwo);
            gameData[round][0] = question;
            gameData[round][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame(RULE, gameData);
    }
}
