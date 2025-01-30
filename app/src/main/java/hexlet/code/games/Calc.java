package hexlet.code.games;

import hexlet.code.Engine;

public final class Calc implements GameGenerator {
    private static final String RULE = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATIONS = {"-", "+", "*"};

    public int calc(int numberOne, String mathOperation, int numberTwo) {
        return switch (mathOperation) {
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> numberOne + numberTwo;
        };
    }

    public String[] getGameData() {
        var numberOne = Engine.getNumber(MAX_NUMBER);
        var numberTwo = Engine.getNumber(MAX_NUMBER);
        var maxCountOperations = OPERATIONS.length - 1;
        var mathOperation = OPERATIONS[Engine.getNumber(maxCountOperations)];
        var question = numberOne + " " + mathOperation + " " + numberTwo;
        var correctAnswer = calc(numberOne, mathOperation, numberTwo);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public String getRule() {
        return RULE;
    }
}
