package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression implements GameGenerator {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MAX_STEP = 25;

    public int gcd(int numberOne, int numberTwo) {
        if (numberTwo > 0) {
            return gcd(numberTwo, numberOne % numberTwo);
        }
        return numberOne;
    }

    public String[] getGameData() {
        var progressionStartNumber = Engine.getNumber(MAX_NUMBER);
        var progressionLength = Engine.getNumber(MAX_LENGTH, MIN_LENGTH);
        var progressionStep = Engine.getNumber(MAX_STEP);
        var skipElement = Engine.getNumber(progressionLength - 1);
        String[] progressionElements = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progressionElements[i] = String.valueOf(progressionStartNumber + progressionStep * i);
        }
        var correctAnswer = progressionElements[skipElement];
        progressionElements[skipElement] = "..";
        var question = String.join(" ", progressionElements);
        return new String[] {question, correctAnswer};
    }

    public String getRule() {
        return RULE;
    }
}
