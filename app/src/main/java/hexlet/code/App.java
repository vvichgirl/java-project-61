package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        var userChoice = scanner.nextInt();

        switch (userChoice) {
            case 0:
                break;
            case 1:
                Greet.greeting();
                break;
            case 2:
                Even.game();
                break;
            default:
                System.out.println("Wrong command");
                break;
        }

        scanner.close();
    }
}
