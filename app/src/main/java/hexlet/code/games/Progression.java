package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MAX_STEP = 25;

    public static void run() {
        var countRound = Engine.getCountRound();
        String[][] gameData = new String[countRound][2];

        for (var round = 0; round < countRound; round++) {
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
            gameData[round][0] = question;
            gameData[round][1] = String.valueOf(correctAnswer);
        }

        Engine.runGame(RULE, gameData);
    }
}
