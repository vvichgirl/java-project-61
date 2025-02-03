package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MAX_STEP = 25;

    public static void run() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];

        for (var round = 0; round < Engine.COUNT_ROUND; round++) {
            var progressionStartNumber = Utils.getNumber(MAX_NUMBER);
            var progressionLength = Utils.getNumber(MAX_LENGTH, MIN_LENGTH);
            var progressionStep = Utils.getNumber(MAX_STEP);
            var skipElement = Utils.getNumber(progressionLength - 1);
            String[] progressionElements = getProgression(progressionLength, progressionStartNumber, progressionStep);
            var correctAnswer = progressionElements[skipElement];
            progressionElements[skipElement] = "..";
            var question = String.join(" ", progressionElements);
            gameData[round][0] = question;
            gameData[round][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame(RULE, gameData);
    }

    public static String[] getProgression(int progressionLength, int progressionStartNumber, int progressionStep) {
        String[] progressionElements = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progressionElements[i] = String.valueOf(progressionStartNumber + progressionStep * i);
        }

        return progressionElements;
    }
}
