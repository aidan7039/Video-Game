package Coding;
import java.util.Scanner;
public class Leave_town {
    public static void Run12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You leave the town");
        System.out.println("You are now in the wilderness");
        System.out.println("Do you wish to keep going?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("you find a path leading to a cave");
            System.out.println("you can smell rotting flesh");
            System.out.println("Do you want to go in?");
        } else if (userAnswer.equalsIgnoreCase("no")) {
            System.out.println("do you wish to go and wander in a different direction?");
            String Useranswer = scanner.nextLine();
            if (Useranswer.equalsIgnoreCase("yes")) {
                System.out.println("what direction do you want to go in");
            }   
        } else {
            System.out.println("you are attacked by a group of wolves");
            System.out.println("you have died");
        }
        MainController.handleAction("Where_do_you_go");
    }
}
