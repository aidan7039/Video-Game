package Coding;
import java.util.Scanner;
public class Tavern {
    public static void Run11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a beer?");
        while (true) {
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("That will be 1 gold piece please");
            }else if (userAnswer.equalsIgnoreCase("no")){
                System.out.println("You have been kicked out of the town");
                MainController.handleAction("Leave_town");
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            } scanner.close();
        }
    }
}
