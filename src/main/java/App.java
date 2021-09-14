import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App {
    public static boolean check () {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        return input.toLowerCase(Locale.ROOT).equals("y");
    }

    public static void main(String[] args) {
        System.out.print("Is the car silent when you turn the key? ");
        if (check()) {
            System.out.print("Are the battery terminals corroded? ");
            if (check()) {
                System.out.println("Clean terminals and try starting again.");
                return;
            }
            System.out.println("Replace cables and try again.");
            return;
        }
        System.out.print("Does the car make a slicking noise? ");
        if (check()) {
            System.out.println("Replace the battery.");
            return;
        }
        System.out.print("Does the car crank up but fail to start? ");
        if (check()) {
            System.out.println("Check the spark plug connections.");
            return;
        }
        System.out.print("Does the engine start up and then die? ");
        if (check()) {
            System.out.print("Does your car have fuel injection? ");
            if (check()) {
                System.out.println("Get it in for service.");
                return;
            }
            System.out.println("Check to ensure the choke is opening and closing.");
            return;
        }
        System.out.println("This should not be possible.");
        return;
    }
}
