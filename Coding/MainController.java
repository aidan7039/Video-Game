package Coding;

public class MainController {
    /**
     * @param action
     */
    public static void handleAction(String action) {
        switch (action) {
            case "ChooseClass":
                Choosing_your_Class.Run1();
                break;
            case "ChooseRace":
                Choosing_your_Race.Run2();
                break;
            //case "Create_Character":
                //Create_Character.Run4();
                //break;
            //case "Where_do_you_go":
                //Where_do_you_go.Run5();
                //break;
           case "Keybinds":

            default:
                    System.out.println("Unknown action");
                    break;
                }

        }
    }

