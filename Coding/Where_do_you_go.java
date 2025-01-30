package Coding;
import java.util.Scanner;
public class Where_do_you_go {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strait = "strait";
        String right = "right";
        String left = "left";
        String look_around = "look around";
        String userAnswer;
        while(true) {
            System.out.println("what direction do you want to go in");
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(strait)) {
                System.out.println("hello there");
            }
            if (userAnswer.equalsIgnoreCase(right)) {
                System.out.println("your are heading towards a cliff");
                System.out.println("do you want to keep going?");
            }
        scanner.close();
    }
}
}
