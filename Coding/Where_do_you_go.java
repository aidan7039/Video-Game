package Coding;
import java.util.Scanner;
public class Where_do_you_go {
Create_Character cc = new Create_Character();
    public static void Run4() {
    //public static void main(String[] args) {
        String strait = "North";
        String right = "East";
        String left = "West";
        String look_around = "look around";
        String userAnswer;
        System.out.println("What direction do you want to go in");
        Scanner can = new Scanner(System.in);
        while(true) {
            userAnswer = can.nextLine();
            if (userAnswer.equalsIgnoreCase(strait)) {
                MainController.handleAction("CombatTest");
                System.out.println("You enter the town");
                System.out.println("You see many stores");
                MainController.handleAction("Stores");
            }
            if (userAnswer.equalsIgnoreCase(right)) {
                System.out.println("Your are heading towards a cliff");
                System.out.println("Do you want to keep going?");
                MainController.handleAction("CombatTest");
            }
            if (userAnswer.equalsIgnoreCase(left)) {
                System.out.println("You are in a river");
                System.out.println("Do you want to try to swim");
            }
            if (userAnswer.equalsIgnoreCase(look_around)) {
                System.out.println("To your right there you see that you are at the top of a cliff");
                System.out.println("To your left you see that you are next to a giant river");
                System.out.println("Strait ahead of you there is a town");
                System.out.println("");
                System.out.println("");
            }
        }
    }
}
