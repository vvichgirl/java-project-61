package hexlet.code;

import hexlet.code.games.GameGenerator;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        var userChoice = scanner.nextInt();

        switch (userChoice) {
            case 0:
                break;
            case 1:
                Engine.greeting();
                break;
            case 2:
                GameGenerator even = new Even();
                Engine.runGame(even);
                break;
            case 3:
                GameGenerator calc = new Calc();
                Engine.runGame(calc);
                break;
            default:
                System.out.println("Wrong command");
                break;
        }

        scanner.close();
    }
}
