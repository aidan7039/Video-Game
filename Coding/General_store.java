package Coding;
import java.util.Scanner;
public class General_store {
    public static void Run10() {
        System.out.println("Would you like a health potion?");
        String Yes = "yes";
        String No = "no";
        String userAnswer;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(Yes)) {
                System.out.println("that will be one gold piece");
            }
            if (userAnswer.equalsIgnoreCase(No)) {
                System.out.println("you were hanged by the townsfolk");
            }
        }
    }
}
