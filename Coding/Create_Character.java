package Coding;

import java.util.Scanner;

public class Create_Character {
    public static Class basicStats = new Class();
    public static Coding.Dice dice = new Dice();
    public static Where_do_you_go direct = new Where_do_you_go();
    public static Scanner hello = new Scanner(System.in);
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please choose your race");
        System.out.println("1. Human");
        System.out.println("2. Elf");
        System.out.println("3. Dwarf");
        System.out.println("4. Halfling");
        System.out.println("5. Dragonborn");
        int species = hello.nextInt();
        if (species == 2) {
            int s = dice.d61 + dice.d62 + dice.d63;
            int d = dice.d64 + dice.d65 + dice.d66 + 2;
            int c = dice.d67 + dice.d68 + dice.d69;
            int i = dice.d610 + dice.d611 + dice.d612;
            int w = dice.d613 + dice.d614 + dice.d615 + 1;
            int C = dice.d616 + dice.d617 + dice.d618;
            System.out.println("You chose Elf, your stats are " + s + " Str, " + d + " Dex, " + c + " Con, " + w + " Wis, " + i + " Int " + C + " Cha");
        }
        if (species == 1) {
            int s = dice.d61 + dice.d62 + dice.d63 + 1;
            int d = dice.d64 + dice.d65 + dice.d66 + 1;
            int c = dice.d67 + dice.d68 + dice.d69 + 1;
            int i = dice.d610 + dice.d611 + dice.d612 + 1;
            int w = dice.d613 + dice.d614 + dice.d615 + 1;
            int C = dice.d616 + dice.d617 + dice.d618 + 1;
            System.out.println("You chose Human, your stats are " + s + " Str, " + d + " Dex, " + c + " Con, " + w + " Wis, " + i + " Int " + C + " Cha");
        }
        if (species == 3) {
            int s = dice.d61 + dice.d62 + dice.d63 + 2;
            int d = dice.d64 + dice.d65 + dice.d66;
            int c = dice.d67 + dice.d68 + dice.d69;
            int i = dice.d610 + dice.d611 + dice.d612;
            int w = dice.d613 + dice.d614 + dice.d615 + 1;
            int C = dice.d616 + dice.d617 + dice.d618;
            System.out.println("You chose Dwarf, your stats are " + s + " Str, " + d + " Dex, " + c + " Con, " + w + " Wis, " + i + " Int " + C + " Cha");
        }
        if (species == 4) {
            int s = dice.d61 + dice.d62 + dice.d63;
            int d = dice.d64 + dice.d65 + dice.d66 + 2;
            int c = dice.d67 + dice.d68 + dice.d69;
            int i = dice.d610 + dice.d611 + dice.d612;
            int w = dice.d613 + dice.d614 + dice.d615;
            int C = dice.d616 + dice.d617 + dice.d618 + 1;
            System.out.println("You chose Halfling, your stats are " + s + " Str, " + d + " Dex, " + c + " Con, " + w + " Wis, " + i + " Int " + C + " Cha");
        }
        if (species > 5) {
            System.out.println("you are an ant");
            int s = basicStats.Str - 10;
            int d = basicStats.Dex - 9;
            int c = basicStats.Con - 10;
            int i = basicStats.Int - 10;
            int w = basicStats.Wis - 10;
            int C = basicStats.Cha - 10;
            System.out.println("You chose Ant, your stats are " + s + " Str, " + d + " Dex, " + c + " Con, " + w + " Wis, " + i + " Int " + C + " Cha");
        }
        if (species == 5) {
            int s = dice.d61 + dice.d62 + dice.d63 + 2;
            int d = dice.d64 + dice.d65 + dice.d66;
            int c = dice.d67 + dice.d68 + dice.d69;
            int i = dice.d610 + dice.d611 + dice.d612;
            int w = dice.d613 + dice.d614 + dice.d615;
            int C = dice.d616 + dice.d617 + dice.d618 + 1;
            System.out.println("You chose Dragonborn, your stats are " + s + " Str, " + d + " Dex, " + c + " Con, " + w + " Wis, " + i + " Int " + C + " Cha");
        }

        // Choosing class
        System.out.println("Please choose your class");
        System.out.println("1. Barbarian");
        System.out.println("2. Cleric");
        System.out.println("3. Druid");
        System.out.println("4. Fighter");
        System.out.println("5. Ranger");
        System.out.println("6. Rogue");
        System.out.println("7. Wizard");
        int Class = scanner.nextInt();

        // Handle class selection
        handleClassSelection(Class);

        hello.close();
        scanner.close();
    }

    public static void handleClassSelection(int Class) {
        switch (Class) {
            case 1:
                handleBarbarian();
                break;
            case 2:
                handleCleric();
                break;
            case 3:
                handleDruid();
                break;
            case 4:
                handleFighter();
                break;
            case 5:
                handleRanger();
                break;
            case 6:
                handleRogue();
                break;
            case 7:
                handleWizard();
                break;
            default:
                System.out.println("Invalid class selection.");
                break;
        }
    }

    public static void handleBarbarian() {
        System.out.println("You chose Barbarian, you fight with rage and brute force to defeat your enemies.");
        System.out.println("Your hit die is 1d12, you are proficient with light armor, medium armor, shields, simple weapons, and martial weapons");
        System.out.println("Choose some starting equipment");
        System.out.println("1. A greataxe");
        System.out.println("2. Any martial weapon");
        int barbeqp = scanner.nextInt();
        if (barbeqp == 1) {
            System.out.println("A greataxe, eh? Some say it is the Barbarian's best friend.");
        } else if (barbeqp == 2) {
            System.out.println("Choose any martial weapon");
            System.out.println("1. Longstaff");
            System.out.println("2. Ball & Chain");
            System.out.println("3. Billhook");
            System.out.println("4. Dueling Daggers");
            System.out.println("5. Dueling Shield");
            System.out.println("6. Heavy Glaive");
            System.out.println("7. Katana");
            System.out.println("8. Scythe Cleaver");
            System.out.println("9. Medium Sword");
            System.out.println("10. Spartan Spear");
            int barbmart = scanner.nextInt();
            if (barbmart > 0) {
                System.out.println("Good choice, a barbarian is able to wield almost any weapon with ease. You have chosen wisely.");
            }
        }

        System.out.println("Choose between two handaxes and any simple weapon");
        System.out.println("1. Two handaxes");
        System.out.println("2. Any simple weapon");
        int barbeqp2 = scanner.nextInt();
        if (barbeqp2 == 1) {
            System.out.println("Two handaxes will make for a powerful flurry of attacks that will leave your foes frozen where they stand.");
        } else if (barbeqp2 == 2) {
            System.out.println("Choose any simple weapon");
            System.out.println("1. Club");
            System.out.println("2. Dagger");
            System.out.println("3. Quarterstaff");
            System.out.println("4. Sickle");
            System.out.println("5. Mace");
            System.out.println("6. Spear");
            System.out.println("7. Light Hammer");
            System.out.println("8. Hand Axe");
            System.out.println("9. Great Club");
            System.out.println("10. Javelin");
        }

        System.out.println("Here take this explorer's pack and these four javelins, you'll need them on your adventure.");
        MainController.handleAction("RUN2");
    }

    public static void handleCleric() {
        System.out.println("You chose cleric, you use the power of the gods to carry out their will.");
        System.out.println("Your hit die is 1d8, you are proficient with light armor, medium armor, shields, and simple weapons.");
        System.out.println("Choose some starting equipment");
        System.out.println("1. A mace");
        System.out.println("2. A warhammer");
        int clrceqp1 = scanner.nextInt();
        if (clrceqp1 == 1) {
            System.out.println("A mace is a good weapon for a cleric, it's strong blow is a representation of the wrath of the gods.");
        } else if (clrceqp1 == 2) {
            System.out.println("A warhammer is a great weapon for a cleric, it's tried and true and delivers devastating blows.");
        }
        System.out.println("Choose some basic armor");
        System.out.println("1. scale mail");
        System.out.println("2. leather armor");
        System.out.println("3. chain mail");
        int clrcarm = scanner.nextInt();

        if (clrcarm == 1) {
            System.out.println("Scale mail is a good armor to start out with it provides good defense and allows ease of movement as well.");
        } else if (clrcarm == 2) {
            System.out.println("Leather armor is light, easy to use, and effective against low level enemies, a solid pick for those in need of a little bit of extra defense.");
        } else if (clrcarm == 3) {
            System.out.println("Chain mail is tough and strong, it's highly effective against slashing attacks. It's also light and versatile making it a great choice for most situations.");
        }

        System.out.println("Would you like either a crossbow and 20 bolts or any simple weapon?");
        System.out.println("1. Crossbow and 20 bolts");
        System.out.println("2. Any Simple Weapon");
        int clrccosw = scanner.nextInt();

        if (clrccosw == 1) {
            System.out.println("The crossbow is an effective and hard hitting weapon, it provides good damage from far away. A good choice for a quick, silent kill.");
        } else if (clrccosw == 2) {
            System.out.println("Choose any simple weapon");
            System.out.println("1. Club");
            System.out.println("2. Dagger");
            System.out.println("3. Quarterstaff");
            System.out.println("4. Sickle");
            System.out.println("5. Mace");
            System.out.println("6. Spear");
            System.out.println("7. Light Hammer");
            System.out.println("8. Hand Axe");
            System.out.println("9. Great Club");
            System.out.println("10. Javelin");
            int clrceqp2 = scanner.nextInt();
            if (clrceqp2 > 0) {
                System.out.println("You made a good choice, this will surely help you on your adventure.");
            }
        }
        System.out.println("It's important that you take some basic supplies on your journey.");
        System.out.println("Choose either a priest's pack or an explorer's pack");
        System.out.println("1. Priest's pack");
        System.out.println("2. Explorer's pack");
        int clrcpk = scanner.nextInt();

        if (clrcpk == 1) {
            System.out.println("A priest's pack is full of everything you need to communicate, question, and serve the gods, it houses all of the quintessential cleric items.");
        } else if (clrcpk == 2) {
            System.out.println("An explorer's pack is perfect for travelers, it has all of the basics needed to survive and thrive away from home.");
        }
        System.out.println("Lastly here's a shield and a holy symbol to complete your cleric equipment.");
        MainController.handleAction("RUN2");
    }

    public static void handleDruid() {
        System.out.println("You chose Druid, you are a master of nature and a friend of beasts");
        System.out.println("You are proficient in light and medium armors as well as shields");
        System.out.println("You are also proficient in a number of fine weapons.");
        System.out.println("These include clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, and spears.");
        System.out.println("chose your starting equipment");
        System.out.println("1. A wooden shield");
        System.out.println("2. a simple melee weapon");
        int drud = scanner.nextInt();
        if (drud == 1) {
            System.out.println("I believe this shield will prove a great asset to you");
            System.out.println("Now you must chose a weapon");
            System.out.println("1. scimitar");
            System.out.println("2. a simple melee weapon");
            int drudw = scanner.nextInt();
            if (drudw == 1) {
                System.out.println("A scimitar is a nice weapon to help you on your journey");
                MainController.handleAction("RUN2");
            } else if (drudw == 2) {
                System.out.println("now chose a simple melee weapon");
                System.out.println("1. Club");
                System.out.println("2. Dagger");
                System.out.println("3. Quarterstaff");
                System.out.println("4. Sickle");
                System.out.println("5. Mace");
                System.out.println("6. Spear");
                System.out.println("7. Light Hammer");
                System.out.println("8. Hand Axe");
                System.out.println("9. Great Club");
                System.out.println("10. Javelin");
                int drudwe = scanner.nextInt();
                if (drudwe > 0) {
                    System.out.println("That was an excellent choice a weapon to defend oneself is always needed.");
                    MainController.handleAction("RUN2");
                }
            }
        } else if (drud == 2) {
            System.out.println("now you must chose a simple melee weapon");
            System.out.println("1. Club");
            System.out.println("2. Dagger");
            System.out.println("3. Quarterstaff");
            System.out.println("4. Sickle");
            System.out.println("5. Mace");
            System.out.println("6. Spear");
            System.out.println("7. Light Hammer");
            System.out.println("8. Hand Axe");
            System.out.println("9. Great Club");
            System.out.println("10. Javelin");
            int druder = scanner.nextInt();
            if (druder > 0) {
                System.out.println("you can also use this weapon to defend yourself or attack enemies");
                System.out.println("Now you must chose a weapon");
                System.out.println("1. scimitar");
                System.out.println("2. a simple melee weapon");
                int druders = scanner.nextInt();
                if (druders == 1) {
                    System.out.println("A scimitar is a nice weapon to help you on your journey");
                    MainController.handleAction("RUN2");
                } else if (druders == 2) {
                    System.out.println("now chose a simple melee weapon");
                    System.out.println("1. Club");
                    System.out.println("2. Dagger");
                    System.out.println("3. Quarterstaff");
                    System.out.println("4. Sickle");
                    System.out.println("5. Mace");
                    System.out.println("6. Spear");
                    System.out.println("7. Light Hammer");
                    System.out.println("8. Hand Axe");
                    System.out.println("9. Great Club");
                    System.out.println("10. Javelin");
                    int drudwes = scanner.nextInt();
                    if (drudwes > 0) {
                        System.out.println("That was an excellent choice a weapon to defend oneself is always needed.");
                        MainController.handleAction("RUN2");
                    }
                }
            }
        }
    }

    public static void handleFighter() {
        System.out.println("You chose fighter, you are a specialist in all forms of melee combat.");
        System.out.println("Your hit die is 1d10, you are proficient with all armor and shields as well as all simple and martial weapons.");
        System.out.println("Choose some starting equipment");
        System.out.println("1. chain mail");
        System.out.println("2. Leather armor, a longbow, and 20 arrows");
        int fiters = scanner.nextInt();
        if (fiters == 1) {
            System.out.println("Chain mail will provide you with great protection but a disadvantage in stealth");
            System.out.println("1. A martial weapon and a shield");
            System.out.println("2. Two martial weapons");
            int fiter = scanner.nextInt();
            if (fiter == 1) {
                System.out.println("choose a martial weapon");
                System.out.println("1. Longstaff");
                System.out.println("2. Ball & Chain");
                System.out.println("3. Billhook");
                System.out.println("4. Dueling Daggers");
                System.out.println("5. Dueling Shield");
                System.out.println("6. Heavy Glaive");
                System.out.println("7. Katana");
                System.out.println("8. Scythe Cleaver");
                System.out.println("9. Medium Sword");
                System.out.println("10. Spartan Spear");
                int fit = scanner.nextInt();
                if (fit > 0) {
                    System.out.println("Good choice, a fighter is able to wield any martial weapon with great skill and a shield is a great choice for defence.");
                    MainController.handleAction("RUN2");
                }

            } else if (fiter == 2) {
                System.out.println("choose a martial weapon");
                System.out.println("1. Longstaff and dueling daggers");
                System.out.println("2. Ball & Chain and Scythe Cleaver");
                System.out.println("3. Billhook and Dueling Shield");
                System.out.println("6. Heavy Glaive and Spartian Spear");
                System.out.println("7. Katana and Medium Sword");
                int fite = scanner.nextInt();
                if (fite > 0) {
                    System.out.println("That is a great choice two weapons will allow you to deal more damage than if you had one");
                    MainController.handleAction("RUN2");
                }

            }
        }
        if (fiters == 2) {
            System.out.println("Leather armor and a bow and arrow these will provide you with more maneuverability but less armor than chain mail");
            //Mark I added the line directly below this comment because it just out of the blue provided you with choices with no prompt I don't think you intended for it to be that way so I added a prompt
            System.out.println("Now choose either a martial weapons and a shield or two martial weapons");
            System.out.println("1. A martial weapon and a shield");
            System.out.println("2. Two martial weapons");
            int fitern = scanner.nextInt();
            if (fitern == 1) {
                System.out.println("choose a martial weapon");
                System.out.println("1. Longstaff");
                System.out.println("2. Ball & Chain");
                System.out.println("3. Billhook");
                System.out.println("4. Dueling Daggers");
                System.out.println("5. Dueling Shield");
                System.out.println("6. Heavy Glaive");
                System.out.println("7. Katana");
                System.out.println("8. Scythe Cleaver");
                System.out.println("9. Medium Sword");
                System.out.println("10. Spartan Spear");
                int fits = scanner.nextInt();
                if (fits > 0) {
                    System.out.println("Good choice, a fighter is able to wield any martial weapon with great skill and a shield is a great choice for defence.");
                    MainController.handleAction("RUN2");
                }

            } else if (fitern == 2) {
                System.out.println("choose a martial weapon");
                System.out.println("1. Longstaff and dueling daggers");
                System.out.println("2. Ball & Chain and Scythe Cleaver");
                System.out.println("3. Billhook and Dueling Shield");
                System.out.println("6. Heavy Glaive and Spartian Spear");
                System.out.println("7. Katana and Medium Sword");
                int fitee = scanner.nextInt();
                if (fitee > 0) {
                    System.out.println("That is a great choice two weapons will allow you to deal more damage than  if you had one");
                    MainController.handleAction("RUN2");
                }

            }
        }

    }

    public static void handleRanger() {
        System.out.println("You chose Ranger, you will often use your bow and arrow to defeat opponents");
        System.out.println("Your hit die is a 1d10");
        System.out.println("You are proficient with light and medium armors");
        System.out.println("You are also proficient with simple and martial weapons");
        System.out.println("now it is time to chose your starting equipment");
        System.out.println("1. Scale Mail");
        System.out.println("2. Leather Armor");
        int range = scanner.nextInt();
        if (range == 1) {
            System.out.println("That Scale Mail will provide excellent protection but will provide you with a disadvantage to stealth");
            System.out.println("Now you must choose your weapon");
            System.out.println("1. two shortswords");
            System.out.println("2. two simple melee weapons");
            int rangemw = scanner.nextInt();
            if (rangemw == 1) {
                System.out.println("You like duel wielding I see, good luck");
                System.out.println("Now you must chose a pack");
                System.out.println("1. Dungeoneer's Pack");
                System.out.println("2. Explorer's Pack");
                int rangep = scanner.nextInt();
                if (rangep == 1) {
                    System.out.println("This contains all of the equipment that you need to traverse dungeons");
                    MainController.handleAction("RUN2");
                }
                if (rangep == 2) {
                    System.out.println("This contains all of the equipment that you would need to explore the world");
                    MainController.handleAction("RUN2");
                }
            }
            if (rangemw == 2) {
                System.out.println("You like duel wielding I see, now you must chose your weapons");
                System.out.println("1. Club");
                System.out.println("2. Dagger");
                System.out.println("3. Quarterstaff");
                System.out.println("4. Sickle");
                System.out.println("5. Mace");
                System.out.println("6. Spear");
                System.out.println("7. Light Hammer");
                System.out.println("8. Hand Axe");
                System.out.println("9. Great Club");
                System.out.println("10. Javelin");
                int rangeww = scanner.nextInt();
                if (rangeww > 0) {
                    System.out.println("that is a great choice two of those will definitely help you in the future");
                    System.out.println("Now you must chose a pack");
                    System.out.println("1. Dungeoneer's Pack");
                    System.out.println("2. Explorer's Pack");
                    int rangepp = scanner.nextInt();
                    if (rangepp == 1) {
                        System.out.println("This contains all of the equipment that you need to traverse dungeons");
                        MainController.handleAction("RUN2");
                    }
                    if (rangepp == 2) {
                        System.out.println("This contains all of the equipment that you would need to explore the world");
                        MainController.handleAction("RUN2");
                    }
                }
            }
        }
        if (range == 2) {
            System.out.println("Leather Armor will help you through your journey through this world");
            System.out.println("Now you must chose your weapon");
            System.out.println("1. two shortswords");
            System.out.println("2. two simple melee weapons");
            int rangemww = scanner.nextInt();
            if (rangemww == 1) {
                System.out.println("You like duel weilding I see, good luck");
                System.out.println("Now you must chose a pack");
                System.out.println("1. Dungeoneer's Pack");
                System.out.println("2. Explorer's Pack");
                int rangepw = scanner.nextInt();
                if (rangepw == 1) {
                    System.out.println("This contains all of the equipment that you need to traverse dungeons");
                    MainController.handleAction("RUN2");
                }
                if (rangepw == 2) {
                    System.out.println("This contains all of the equipment that you would need to explore the world");
                    MainController.handleAction("RUN2");
                }
            }
            if (rangemww == 2) {
                System.out.println("You like duel weilding I see, now you must chose your weapons");
                System.out.println("1. Club");
                System.out.println("2. Dagger");
                System.out.println("3. Quarterstaff");
                System.out.println("4. Sickle");
                System.out.println("5. Mace");
                System.out.println("6. Spear");
                System.out.println("7. Light Hammer");
                System.out.println("8. Hand Axe");
                System.out.println("9. Great Club");
                System.out.println("10. Javelin");
                int rangewww = scanner.nextInt();
                if (rangewww > 0) {
                    System.out.println("that is a great choice two of those will definatly help you in the future");
                    System.out.println("Now you must chose a pack");
                    System.out.println("1. Dungeoneer's Pack");
                    System.out.println("2. Explorer's Pack");
                    int rangeppp = scanner.nextInt();
                    if (rangeppp == 1) {
                        System.out.println("This contains all of the equipment that you need to traverse dungeons");
                        MainController.handleAction("RUN2");
                    }
                    if (rangeppp == 2) {
                        System.out.println("This contains all of the equipment that you would need to explore the world");
                        MainController.handleAction("RUN2");
                    }
                }
            }
        }
    }

    public static void handleRogue() {
        System.out.println("You chose Rogue, you specalize in stealth");
        System.out.println("Your Hit die is a 1d8, you are proficient in simple weapons, Hand Crossbows, Longswords, Rapiers, and Shortswords");
        System.out.println("now you need to chose your starting equipment");
        System.out.println("1. Rapier");
        System.out.println("2. Shortsword");
        int rog = scanner.nextInt();
        if (rog == 1) {
            System.out.println("This will help you when you try stabing someone in the head");
            System.out.println("Now you need to chose your second weapon");
            System.out.println("1. Shortbow and 20 arrows");
            System.out.println("2. Shortsword");
            int roge = scanner.nextInt();
            if (roge == 1) {
                System.out.println("this will help you all ack enemies from a distance");
                System.out.println("Now you need to choose your pack");
                System.out.println("1. Burglar's pack");
                System.out.println("2. Dungeoneer's pack");
                System.out.println("3. Explorer's pack");
                int roger = scanner.nextInt();
                if (roger == 1) {
                    System.out.println("This will help you rob people");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (roger == 2) {
                    System.out.println("May this help you on whatever dungeon explorations you go on");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (roger == 3) {
                    System.out.println("May this help you on all of you future explorations");
                    System.out.println("You will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
            }
            if (roge == 2) {
                System.out.println("this will help you defend yourself and you can even duel weild");
                System.out.println("Now you need to choose your pack");
                System.out.println("1. Burglar's pack");
                System.out.println("2. Dungeoneer's pack");
                System.out.println("3. Explorer's pack");
                int rogerr = scanner.nextInt();
                if (rogerr == 1) {
                    System.out.println("This will help you rob people");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (rogerr == 2) {
                    System.out.println("May this help you on whatever dungeon explorations you go on");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (rogerr == 3) {
                    System.out.println("May this help you on all of you future explorations");
                    System.out.println("You will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
            }
        }
        if (rog == 2) {
            System.out.println("May this Shortsword be a faithfull weapon on your journey");
            System.out.println("Now you need to chose your second weapon");
            System.out.println("1. Shortbow and 20 arrows");
            System.out.println("2. Shortsword");
            int rogeo = scanner.nextInt();
            if (rogeo == 1) {
                System.out.println("this will help you all ack enemies from a distance");
                System.out.println("Now you need to choose your pack");
                System.out.println("1. Burglar's pack");
                System.out.println("2. Dungeoneer's pack");
                System.out.println("3. Explorer's pack");
                int rogero = scanner.nextInt();
                if (rogero == 1) {
                    System.out.println("This will help you rob people");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (rogero == 2) {
                    System.out.println("May this help you on whatever dungeon explorations you go on");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (rogero == 3) {
                    System.out.println("May this help you on all of you future explorations");
                    System.out.println("You will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
            }
            if (rogeo == 2) {
                System.out.println("this will help you defend yourself and you can even duel weild");
                System.out.println("Now you need to choose your pack");
                System.out.println("1. Burglar's pack");
                System.out.println("2. Dungeoneer's pack");
                System.out.println("3. Explorer's pack");
                int rogerro = scanner.nextInt();
                if (rogerro == 1) {
                    System.out.println("This will help you rob people");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (rogerro == 2) {
                    System.out.println("May this help you on whatever dungeon explorations you go on");
                    System.out.println("you will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
                if (rogerro == 3) {
                    System.out.println("May this help you on all of you future explorations");
                    System.out.println("You will also get leather armor, two daggers, and thieves' tools");
                    MainController.handleAction("RUN2");
                }
            }
        }
    }

    public static void handleWizard() {
        System.out.println("You chose Wizard, You use intelligence and wisdom instead of strength in battle");
        System.out.println("Your hit die is one 1d6, you are proficient with daggers, darts, slings, quarter staffs, and light crossbows ");
        System.out.println("As a Wizard sadly you can not wear any armor whatsoever so be careful");
        System.out.println("Choose some starting equipment");
        System.out.println("1. Quarter staff, component pouch, and a spellbook");
        System.out.println("2. Dagger, arcane focus, and a spellbook");
        int wizequip = scanner.nextInt();

        if (wizequip > 0) {
            System.out.println("Interesting choice I'm excited to see how your adventure goes");
            MainController.handleAction("RUN2");
        }
    }
}
