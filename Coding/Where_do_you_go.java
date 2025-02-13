package Coding;
import java.util.Scanner;

public class Where_do_you_go {
    Create_Character cc = new Create_Character();
    private static final String STRAIGHT = "North";
    private static final String RIGHT = "East";
    private static final String LEFT = "West";
    private static final String LOOK_AROUND = "look around";
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void Run4() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("What direction do you want to go in?");
            while (true) {
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase(STRAIGHT)) {
                    handleNorthDirection();
                } else if (userAnswer.equalsIgnoreCase(RIGHT)) {
                    handleEastDirection(scanner);
                } else if (userAnswer.equalsIgnoreCase(LEFT)) {
                    handleWestDirection(scanner);
                } else if (userAnswer.equalsIgnoreCase(LOOK_AROUND)) {
                    handleLookAround();
                } else {
                    System.out.println("Invalid direction. Please try again.");
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static void handleNorthDirection() {
        MainController.handleAction("CombatTest");
        System.out.println("You enter the town");
        System.out.println("You see many stores");
        MainController.handleAction("Stores");
    }

    private static void handleEastDirection(Scanner scanner) {
        System.out.println("You are heading towards a cliff");
        System.out.println("Do you want to keep going? (yes/no)");
        while (true) {
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(YES)) {
                System.out.println("You have fallen off a cliff");
                System.out.println("You have died");
                break;
            } else if (userAnswer.equalsIgnoreCase(NO)) {
                System.out.println("Which way do you want to go?");
                break;
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            }
        }
    }

    private static void handleWestDirection(Scanner scanner) {
        System.out.println("You are in a river");
        System.out.println("Do you want to try to swim? (yes/no)");
        while (true) {
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(YES)) {
                System.out.println("You start swimming across the river.");
                // Add more logic here if needed
                break;
            } else if (userAnswer.equalsIgnoreCase(NO)) {
                System.out.println("You decide not to swim.");
                break;
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            }
        }
    }

    private static void handleLookAround() {
        System.out.println("To your right, you see that you are at the top of a cliff.");
        System.out.println("To your left, you see that you are next to a giant river.");
        System.out.println("Straight ahead of you, there is a town.");
    }
}
