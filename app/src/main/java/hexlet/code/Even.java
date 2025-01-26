package hexlet.code;

import java.util.Scanner;
import java.util.Random;

class Even {
    private static final int COUNT_ROUND = 3;
    private static final int MAX_NUMBER = 100;

    public static void game() {
        Greet.greeting();
        var userName = Greet.getName();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= COUNT_ROUND; i++) {
            Random random = new Random();
            int numRandom = random.nextInt(MAX_NUMBER) + 1;

            var correctAnswer = isEven(numRandom) ? "yes" : "no";
            System.out.println("Question: " + numRandom);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            var isCorrectAnswer = checkAnswer(userAnswer, correctAnswer);
            if (isCorrectAnswer) {
                System.out.println("Correct!");
            } else {
                var wrongMessage = "'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.";
                System.out.println(wrongMessage);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        return;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equals(correctAnswer);
    }
}
