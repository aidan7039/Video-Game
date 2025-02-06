package Coding;
import java.util.Scanner;
public class Blacksmith {
    public static void Run9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are many fine wears here");
        String longSword = "longsword";
        String bow = "bow";
        String userAnswer;
        while(true) {
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(longSword)) {
                System.out.println("That will be 30 gold");
            }
            if (userAnswer.equalsIgnoreCase(bow)) {
                System.out.println("That will be 2 gold");
            }
        }
    }
}
