package Coding;

public class MainController {
    public static void handleAction(String action) {
        switch (action) {
            case "ChooseClass":
                Choosing_your_Class.Run1();
                break;
            case "ChooseRace":
                Choosing_your_Race.Run2();
                break;
            //case "Testing_Something":
                //Testing_Something.Run3();
                //break;
           case "Keybinds":

            default:
                    System.out.println("Unknown action");
                    break;
                }

        }
    }

