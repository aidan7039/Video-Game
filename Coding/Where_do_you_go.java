package Coding;
import java.util.Scanner;
public class Where_do_you_go {

    public static void Run4() {
    //public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        String strait = "straight";
        String right = "right";
        String left = "left";
        String look_around = "look around";
        String userAnswer;
        System.out.println("what direction do you want to go in");
        while(true) {
            System.out.println("");
            userAnswer = can.nextLine();
            System.out.println("");
            if (userAnswer.equalsIgnoreCase(strait)) {
                MainController.handleAction("CombatTest");
                System.out.println("you enter the town");
            }
            if (userAnswer.equalsIgnoreCase(right)) {
                System.out.println("your are heading towards a cliff");
                System.out.println("do you want to keep going?");
                MainController.handleAction("CombatTest");
            }
            if (userAnswer.equalsIgnoreCase(left)) {
                System.out.println("you are in a river");
                System.out.println("do you want to try to swim");
            }
            if (userAnswer.equalsIgnoreCase(look_around)) {
                System.out.println("to your right there you see that you are at the top of a cliff");
                System.out.println("to your left you see that you are next to a giant river");
                System.out.println("strait ahead of you there is a town");
                System.out.println("");
                System.out.println("");
            }
        can.close();
        }
    }
}
