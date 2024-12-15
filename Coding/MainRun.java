package Coding;

public class MainRun {
    static boolean isRunning;

        public static void main(String[] args) {
            // Use the controller to call other classes
            MainController.handleAction("ChooseClass");
            System.out.println("");
            MainController.handleAction("ChooseRace");
        }
    }


