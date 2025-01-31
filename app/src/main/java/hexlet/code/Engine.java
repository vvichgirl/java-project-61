package hexlet.code;

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

    public static int getCountRound() {
        return COUNT_ROUND;
    }

    public static int getNumber(int maxNumber) {
        Random random = new Random();
        int numRandom = random.nextInt(maxNumber);
        return numRandom;
    }

    public static int getNumber(int maxNumber, int minNumber) {
        Random random = new Random();
        int numRandom = random.nextInt(maxNumber - minNumber) + minNumber;
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

    public static void runGame(String rule, String[][] gameData) {
        greeting();
        System.out.println(rule);

        for (var currentRound = 0; currentRound < COUNT_ROUND; currentRound++) {
            String question = gameData[currentRound][0];
            String correctAnswer = gameData[currentRound][1];

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
