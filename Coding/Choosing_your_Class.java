package Coding;

import java.util.Scanner;
public class Choosing_your_Class {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your class");
        System.out.println("1. Barbarian");
        System.out.println("2. Cleric");
        System.out.println("3. Druid");
        System.out.println("4. Fighter");
        System.out.println("5. Ranger");
        System.out.println("6. Rogue");
        System.out.println("7. Wizard");
        int Class = scanner.nextInt();

        if (Class == 1) {
            //the barbarian will get +2 Str and +1 Con
            System.out.println("You chose Barbarian, you fight with rage and brute force to defeat your enemies.");
            System.out.println("Your hit die is 1d12, you are proficient with light armor, medium armor, shields, simple weapons, and martial weapons");
            System.out.println("Choose some starting equipment");
            System.out.println("1. A greataxe");
            System.out.println("2. Any martial weapon");
            int barbeqp = scanner.nextInt();
            if (barbeqp == 1) {
                System.out.println("A greataxe, eh? Some say it is the Barbarian's best friend.");
            }
            if (barbeqp == 2){
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
            }
            if (barbeqp2 == 2) {
                System.out.println("Choose any simple weapon");
                System.out.println("1. Club");
                System.out.println("2. Dagger");
                System.out.println("3. Quarterstaff");
                System.out.println("4. Sickle");
                //finish making 10 simple weapons (there's a link to all of the simple weapons in Discord
            }

            System.out.println("Here take this explorer's pack and these four javelins, you'll need them on your adventure");
        }
        if (Class == 2) {
            System.out.println("You chose cleric, you use the power of the gods to carry out their will.");
            System.out.println("Your hit die is 1d8, you are proficient with light armor, medium armor, shields, and simple weapons.");
            System.out.println("Choose some starting equipment");
            System.out.println("1. A mace");
            System.out.println("2. A warhammer");
            int clrceqp1 = scanner.nextInt();
            if (clrceqp1 == 1) {
                System.out.println("A mace is a good weapon for a cleric, it's strong blow is a representation of the wrath of the gods.");
            }
            if (clrceqp1 == 2) {
                System.out.println("A warhammer is a great weapon for a cleric, it's tried and true and delivers devastating blows.");
            }

        }
        if (Class == 4) {
            System.out.println("You chose fighter, you are a specialist in all forms of melee combat.");
            System.out.println("Your hit die is 1d10, you are proficient with all armor and shields as well as all simple and martial weapons.");
            System.out.println("Choose some starting equipment");
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
                }

            }
            if (fiter == 2) {
                System.out.println("choose a martial weapon");
                System.out.println("1. Longstaff and dueling daggers");
                System.out.println("2. Ball & Chain and Scythe Cleaver");
                System.out.println("3. Billhook and Dueling Shield");
                System.out.println("6. Heavy Glaive and Spartian Spear");
                System.out.println("7. Katana and Medium Sword");
                int fite = scanner.nextInt();
                if (fite > 0) {
                    System.out.println("That is a great choice it will allow you to deal more damage");
                }

            }


        }


    scanner.close();

    }
}
