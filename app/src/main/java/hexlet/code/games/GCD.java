package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements GameGenerator {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public int gcd(int numberOne, int numberTwo) {
        if (numberTwo > 0) {
            return gcd(numberTwo, numberOne % numberTwo);
        }
        return numberOne;
    }

    public String[] getGameData() {
        var numberOne = Engine.getNumber(MAX_NUMBER);
        var numberTwo = Engine.getNumber(MAX_NUMBER);
        var question = numberOne + " " + numberTwo;
        var correctAnswer = gcd(numberOne, numberTwo);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public String getRule() {
        return RULE;
    }
}
