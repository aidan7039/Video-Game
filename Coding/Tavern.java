package Coding;
import java.util.Scanner;
public class Tavern {
    public static void Run11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a beer?");
        String Yes = "yes";
        String No = "no";
        String userAnswer;
        while(true) {
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(Yes)) {
                System.out.println("That will be 1 gold piece please");
            }if (userAnswer.equalsIgnoreCase(No)){
                System.out.println("You have been kicked out of the town");
            }
        }
    }
}
