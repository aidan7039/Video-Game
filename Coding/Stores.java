package Coding;
import java.util.Scanner;
public class Stores {
    public static void Run8() {
        String blacksmith = "blacksmith";
        String general_store = "general store";
        String tavern = "tavern";
        String userAnswer;
        System.out.println("You see three stores in the town the blacksmith, the general store, and the tavern");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(blacksmith)) {
                System.out.println("what do you want to buy here?");
                MainController.handleAction("Blacksmith");
            } else if (userAnswer.equalsIgnoreCase(general_store)) {
                System.out.println("Do you want to look at whats here?");
                MainController.handleAction("General_store");
            } else if (userAnswer.equalsIgnoreCase(tavern)) {
                MainController.handleAction("Tavern");
            } else if (userAnswer.equalsIgnoreCase("leave")) {
                System.out.println("You leave the town");
                MainController.handleAction("Leave_town");
            } else {
                System.out.println("Invalid store. Please try again.");
            }
        }
    }
}
