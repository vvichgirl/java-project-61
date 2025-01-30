package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime implements GameGenerator {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public String[] getGameData() {
        var numberQuestion = Engine.getNumber(MAX_NUMBER);
        var correctAnswer = isPrime(numberQuestion) ? "yes" : "no";
        return new String[] {String.valueOf(numberQuestion), correctAnswer};
    }

    public String getRule() {
        return RULE;
    }

    public boolean isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
