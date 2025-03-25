package Coding;
import java.util.Scanner;

public class Untitled1 {
    static Coding.Dice dice = new Dice();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 3 + dice.d10;
        int gbhealth = 1;
        int DexModifier = 2;
        int AC = 13;
        int goblinAC = 12;
        dice.d6gbscimitar = dice.d6gbscimitar + 2;
        dice.d6gbscimitar2 = dice.d6gbscimitar2 + 2;

        System.out.println("Your maximum health is " + health + ".");
        while (gbhealth > 0) {
            System.out.println("You've been spotted by a goblin they're about to attack you!");
            int goblinrl = dice.d20gb;
            if (goblinrl == 20) {
                System.out.println("The goblin landed a critical hit! You take " + (dice.d6gbscimitar * 2) + " damage.");
                int gbcritdmg = dice.d6gbscimitar * 2;
                System.out.println("Your health is now " + (health - gbcritdmg) + ".");
                int newhealth = health - gbcritdmg;
                if (newhealth <= 0) {
                    System.out.println("You are dead. May the gods bless you in the afterlife");
                    System.exit(0);
                } else {
                    System.out.println("It is now your turn.");
                }
            } else {
                if (goblinrl >= AC) {
                    System.out.println("You've been hit! You take " + dice.d6gbscimitar + " damage.");
                    System.out.println("Your health is now " + (health - dice.d6gbscimitar) + ".");
                    int newhealth = health - dice.d6gbscimitar;
                    if (newhealth <= 0) {
                        System.out.println("You are dead. May the gods bless you in the afterlife");
                        System.exit(0);
                    } else {
                        System.out.println("It is now your turn.");
                    }
                } else {
                    System.out.println("The goblin missed, it is now your turn.");
                }
            }

            System.out.println("What would you like to do?");
            System.out.println("1. Attack");
            System.out.println("2. Cast a spell");
            System.out.println("3. Dodge");
            System.out.println("4. Run Away");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Select which weapon you would like to use.");
                System.out.println("1. Shortsword");
                int wpnchc = scanner.nextInt();
                if (wpnchc == 1) {
                    System.out.println("You attack the goblin with a shortsword.");
                    int playerrl = dice.d20;
                    if (playerrl == 20) {
                        System.out.println("You've landed a critical hit!");
                        System.out.println("You deal " + (dice.shortsword * 2) + " damage to the goblin.");
                        gbhealth = gbhealth - (dice.shortsword * 2);
                        if (gbhealth <= 0) {
                            System.out.println("You have defeated the goblin.");
                        }
                    } else {
                        if (playerrl >= 12) {
                            System.out.println("You hit the goblin.");
                            System.out.println("You deal " + dice.shortsword + " damage to the goblin.");
                            gbhealth = gbhealth - dice.shortsword;
                            if (gbhealth <= 0) {
                                System.out.println("You have defeated the goblin.");
                            }
                        } else {
                            System.out.println("You miss the goblin.");
                            System.out.println("It is now the goblin's turn.");
                        }
                    }
                }
            }
            // Handle other choices (2, 3, 4) similarly...
        }
    }
}