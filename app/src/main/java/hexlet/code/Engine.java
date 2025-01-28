package hexlet.code;

import hexlet.code.games.GameGenerator;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String userName;
    private static final int COUNT_ROUND = 3;
    private static final String CORRECT_ANSWER_MESSAGE = "Correct!";

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static int getNumber(int maxNumber) {
        Random random = new Random();
        int numRandom = random.nextInt(maxNumber) + 1;
        return numRandom;
    }

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

    public static boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equals(correctAnswer);
    }

    public static void runGame(GameGenerator game) {
        greeting();
        System.out.println(game.getRule());

        for (var currentRound = 1; currentRound <= COUNT_ROUND; currentRound++) {
            String[] gameData = game.getGameData();
            String question = gameData[0];
            String correctAnswer = gameData[1];

            System.out.println("Question: " + question);

            var userAnswer = getAnswer();
            var isCorrectAnswer = checkAnswer(userAnswer, correctAnswer);

            if (isCorrectAnswer) {
                System.out.println(CORRECT_ANSWER_MESSAGE);
            } else {
                var wrongAnswerMessage = "'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.";
                System.out.println(wrongAnswerMessage);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        return;
    }
}
