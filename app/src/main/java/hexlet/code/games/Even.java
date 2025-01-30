package hexlet.code.games;

import hexlet.code.Engine;

public final class Even implements GameGenerator {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public String[] getGameData() {
        var numberQuestion = Engine.getNumber(MAX_NUMBER);
        var correctAnswer = isEven(numberQuestion) ? "yes" : "no";
        return new String[] {String.valueOf(numberQuestion), correctAnswer};
    }

    public String getRule() {
        return RULE;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
