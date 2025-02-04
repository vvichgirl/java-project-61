package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULE = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATIONS = {"-", "+", "*"};

    public static int calc(int numberOne, String mathOperation, int numberTwo) {
        return switch (mathOperation) {
            case "-" -> numberOne - numberTwo;
            case "+" -> numberOne + numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> throw new RuntimeException("Unknown mathOperation" + mathOperation);
        };
    }

    public static void run() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];

        for (var round = 0; round < Engine.COUNT_ROUND; round++) {
            var numberOne = Utils.getNumber(MAX_NUMBER);
            var numberTwo = Utils.getNumber(MAX_NUMBER);
            var maxCountOperations = OPERATIONS.length - 1;
            var mathOperation = OPERATIONS[Utils.getNumber(maxCountOperations)];
            var question = numberOne + " " + mathOperation + " " + numberTwo;
            var correctAnswer = calc(numberOne, mathOperation, numberTwo);
            gameData[round][0] = question;
            gameData[round][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame(RULE, gameData);
    }
}
