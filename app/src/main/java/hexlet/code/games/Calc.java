package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String RULE = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATIONS = {"-", "+", "*"};

    public static int calc(int numberOne, String mathOperation, int numberTwo) {
        return switch (mathOperation) {
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> numberOne + numberTwo;
        };
    }

    public static void run() {
        var countRound = Engine.getCountRound();
        String[][] gameData = new String[countRound][2];

        for (var round = 0; round < countRound; round++) {
            var numberOne = Engine.getNumber(MAX_NUMBER);
            var numberTwo = Engine.getNumber(MAX_NUMBER);
            var maxCountOperations = OPERATIONS.length - 1;
            var mathOperation = OPERATIONS[Engine.getNumber(maxCountOperations)];
            var question = numberOne + " " + mathOperation + " " + numberTwo;
            var correctAnswer = calc(numberOne, mathOperation, numberTwo);
            gameData[round][0] = question;
            gameData[round][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame(RULE, gameData);
    }
}
