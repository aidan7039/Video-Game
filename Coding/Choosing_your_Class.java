package Coding;

import java.awt.SystemTray;
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
            System.out.println("You chose Barbarian, you fight with rage and brute force to defeat your enemies.");
            System.out.println(" Your hit die is 1d12, you are proficient with light armor, medium armor, shields, simple weapons, and martial weapons");
            System.out.println("Choose some starting equipment");
            System.out.println("1. A greataxe");
            System.out.println("2. Any martial weapon");
            int barbeqp = scanner.nextInt();
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
            }
        }



    }
}
