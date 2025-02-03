package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;
    private static final String CORRECT_ANSWER_MESSAGE = "Correct!";

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

    public static void runGame(String rule, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        for (var currentRound = 0; currentRound < COUNT_ROUND; currentRound++) {
            String question = gameData[currentRound][0];
            String correctAnswer = gameData[currentRound][1];

            System.out.println("Question: " + question);

            var userAnswer = getAnswer();
            var isCorrectAnswer = userAnswer.equals(correctAnswer);

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
