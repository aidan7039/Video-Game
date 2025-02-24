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
            case "Where_do_you_go":
                Where_do_you_go.Run4();
                break;
            case "CombatTest":
                CombatTest.Run5();
                break;
            //case "Create_Character":
                //Create_Character.Run3();
                //break;
            case "RUN2":
                RUN2.Run6();
                break;
            case "Intoduction":
                Intoduction.Run7();
                break;
            case "Stores":
                Stores.Run8();
                break;
            case "Blacksmith":
                Blacksmith.Run9();
                break;
            case "General_store":
                General_store.Run10();
                break;
            case "Tavern":
                Tavern.Run11();
                break;
            case "Leave_town":
                Leave_town.Run12();
                break;
           case "Keybinds":

            default:
                    System.out.println("Unknown action");
                    break;
                }

        }
    }

