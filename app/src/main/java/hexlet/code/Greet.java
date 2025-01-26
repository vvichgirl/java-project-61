package hexlet.code;

import java.util.Scanner;

class Greet {
    private static String userName;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getName() {
        return userName;
    }
}
