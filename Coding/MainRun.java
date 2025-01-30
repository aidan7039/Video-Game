package Coding;

public class MainRun {
    static boolean isRunning;

        public static void main(String[] args) {
            // Use the controller to call other classes
            MainController.handleAction("ChooseClass");
            System.out.println("");
            MainController.handleAction("ChooseRace");
            System.out.println("");
            //MainController.handleAction("Create_Character");
            //System.out.println("");
            //MainController.handleAction("Where_do_you_go");
            //System.out.println("");
        }
    }


