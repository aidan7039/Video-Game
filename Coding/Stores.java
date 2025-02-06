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
            }
            if (userAnswer.equalsIgnoreCase(general_store)) {
                System.out.println("Do you want to look at whats here?");
                MainController.handleAction("General_store");
            }
            if (userAnswer.equalsIgnoreCase(tavern)) {
                System.out.println("do you want a drink?");
                MainController.handleAction("Tavern");
            }
        }
    }
}
