package Coding;
import java.util.Scanner;

public class Where_do_you_go {
    Create_Character cc = new Create_Character();

    public static void Run4() {
        //public static void main(String[] args) {
        String userAnswer;
        Scanner can = new Scanner(System.in);

        System.out.println("What direction do you want to go in");
        while (true) {
            userAnswer = can.nextLine();
            switch (userAnswer.toLowerCase()) {
                case "north":
                    //MainController.handleAction("CombatTest");
                    System.out.println("You enter the town");
                    System.out.println("You see many stores");
                    MainController.handleAction("Stores");
                    break;
                case "east":
                    handleCliff(can);
                    break;
                case "west":
                    handleRiver(can);
                    break;
                case "look around":
                    System.out.println("To your right there you see that you are at the top of a cliff");
                    System.out.println("To your left you see that you are next to a giant river");
                    System.out.println("Strait ahead of you there is a town");
                    break;
                default:
                    System.out.println("Invalid direction. Please try again.");
                    break;
            }
        }
    }

    private static void handleCliff(Scanner can) {
        System.out.println("You are heading towards a cliff");
        System.out.println("Do you want to keep going? (yes/no)");
        while (true) {
            String userAnswers = can.nextLine();
            if (userAnswers.equalsIgnoreCase("yes")) {
                System.out.println("You have fallen off a cliff");
                System.out.println("You have died");
                break;
            } else if (userAnswers.equalsIgnoreCase("no")) {
                System.out.println("Which way do you want to go?");
                break;
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            }
        }
    }

    private static void handleRiver(Scanner can) {
        System.out.println("You are in a river");
        System.out.println("Do you want to try to swim? (yes/no)");
        while (true) {
            String userAnswers = can.nextLine();
            if (userAnswers.equalsIgnoreCase("yes")) {
                System.out.println("You try to swim and make it across safely.");
                break;
            } else if (userAnswers.equalsIgnoreCase("no")) {
                System.out.println("You decide not to swim and return to your starting point.");
                break;
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            }
        }
    }
}
