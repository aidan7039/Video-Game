package Coding;
import java.util.Scanner;
public class Leave_town {
    public static void Run12() {
    //public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You leave the town");
        System.out.println("You are now in the wilderness");
        System.out.println("Do you wish to keep going?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("you find a path leading to a cave");
            System.out.println("you can smell rotting flesh");
            System.out.println("Do you want to go in?");
            System.out.println("You have been killed by a goblin");
            System.exit(0);
        } else if (userAnswer.equalsIgnoreCase("no")) {
            System.out.println("do you wish to go and wander in a different direction?");
            String Useranswer = scanner.nextLine();
            if (Useranswer.equalsIgnoreCase("yes")) {
                System.out.println("what direction do you want to go in");
                String UserAnswer = scanner.nextLine();
                if (UserAnswer.equalsIgnoreCase("north")) {
                    System.out.println("you head towards a clearing that you see in the distance");
                    System.out.println("when you get into the clearing the trees close behind you and you find");
                    System.out.println("yourself traped");
                    System.exit(0);
                } else if (UserAnswer.equalsIgnoreCase("South")) {
                    MainController.handleAction("Stores");
                    System.exit(0);
                } else if (UserAnswer.equalsIgnoreCase("West")) {
                } else if (UserAnswer.equalsIgnoreCase("look around")) {
                    System.out.println("To the East you see a path that leads to into the wilderness");
                    System.out.println("To the North you see a forest");
                    System.out.println("To the South you see the village that you left");
                    System.out.println("To the West you see the mountains");
                    MainController.handleAction("Leave_town");
                }
            } else {
                MainController.handleAction("Leave_town");
            }
        } else {
            System.out.println("you are attacked by a group of wolves");
            System.out.println("you have died");
            System.exit(0);
        }scanner.close();
    }
}