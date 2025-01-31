package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        var countRound = Engine.getCountRound();
        String[][] gameData = new String[countRound][2];

        for (var round = 0; round < countRound; round++) {
            var numberQuestion = Engine.getNumber(MAX_NUMBER);
            var correctAnswer = isPrime(numberQuestion) ? "yes" : "no";
            gameData[round][0] = String.valueOf(numberQuestion);
            gameData[round][1] = correctAnswer;
        }

        Engine.runGame(RULE, gameData);
    }

    public static boolean isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
