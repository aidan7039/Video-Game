package Coding;
import java.util.Scanner;
public class CombatTest {
    static Coding.Dice dice = new Dice();
    public static void Run5() {
    //public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int health = 3 + dice.d10;
        //int gbhealth = 0 + (dice.d6*2);
        int gbhealth = 1;
        int DexModifier = 2;
        int AC = 13;
        int goblinAC = 12;
        dice.d6gbscimitar = dice.d6gbscimitar + 2;
        dice.d6gbscimitar2 = dice.d6gbscimitar2 + 2;

        //This whole encounter is made assuming that the player is a fighter
        System.out.println("Your maximum health is " + health + ".");
        System.out.println("You've been spotted by a goblin they're about to attack you!");
        int goblinrl = dice.d20gb;
        if (goblinrl == 20) {
            System.out.println("The goblin landed a critical hit! You take " + (dice.d6gbscimitar * 2) + " damage.");
            int gbcritdmg = dice.d6gbscimitar * 2;
            System.out.println("Your health is now " + (health - gbcritdmg + "."));
            int newhealth = health - dice.d6gbscimitar;
            if (newhealth <= 0) {
                System.out.println("You are dead. May the gods bless you in the afterlife");
                System.exit(0);
            } else {
                System.out.println("It is now your turn.");
            }

        } else {
            if (goblinrl >= AC) {
                System.out.println("You've been hit! You take " + (dice.d6gbscimitar) + " damage.");
                System.out.println("Your health is now " + (health - dice.d6gbscimitar + "."));
                int newhealth = health - dice.d6gbscimitar;
                if (newhealth <= 0) {
                    System.out.println("You are dead. May the gods bless you in the afterlife");
                    System.exit(0);
                } else {
                    System.out.println("It is now your turn");
                }
            } else {
                System.out.println("The goblin missed, it is now your turn.");
            }
        }
        int newhealth = health - dice.d6gbscimitar;
        System.out.println("What would you like to do?");
        System.out.println("1. Attack");
        System.out.println("2. Cast a spell");
        System.out.println("3. Dodge");
        System.out.println("4. Run Away");
        int choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("Select which weapon you would like to use.");
            System.out.println("1. Shortsword");
            System.out.println("2. Longsword");
            System.out.println("3. Dagger");
            System.out.println("4. Shortbow");
            int wpnchc = scanner.nextInt();
            if (wpnchc == 1){
            System.out.println("You attack the goblin with a shortsword.");
            int playerrl = dice.d20;
            if (dice.d20 >= 12){
                System.out.println("You hit the goblin.");
                System.out.println("You deal " + dice.shortsword + " damage to the goblin.");
                gbhealth = gbhealth-dice.shortsword;
                if (gbhealth <= 0){
                    System.out.println("You have defeated the goblin.");
                }
            } else {
                System.out.println("You miss the goblin.");
            }
            }
        }
        if (choice == 2){
            System.out.println("You are not able to cast spells. Your intelligence is too low.");
            System.out.println("What would you like to do?");
            System.out.println("1. Attack");
            System.out.println("2. Dodge");
            System.out.println("3. Run Away");
            int choiceagn = scanner.nextInt();
            if (choiceagn == 1){
                //attack
                System.out.println("Select which weapon you would like to use.");
                System.out.println("1. Shortsword");
                System.out.println("2. Longsword");
                System.out.println("3. Dagger");
                System.out.println("4. Shortbow");
                int wpnchc = scanner.nextInt();
                if (wpnchc == 1){

                }
            }
            if (choiceagn == 2){
                //dodge
                System.out.println("You have made it more difficult for the opponent to hit you.");
                System.out.println("It is now the goblin's turn.");
                System.out.println("The goblin attacks you.");
                int goblinrl2 = dice.d20gb2/2;
                if (goblinrl2 == 20) {
                    System.out.println("The goblin landed a critical hit! You take " + (dice.d6gbscimitar3 * 2) + " damage.");
                    int gbcritdmg2 = dice.d6gbscimitar3 * 2;
                    System.out.println("Your health is now " + (newhealth - gbcritdmg2 + "."));
                    int newhealth2 = newhealth - dice.d6gbscimitar3;
                    if (newhealth2 <= 0) {
                        System.out.println("You are dead. May the gods bless you in the afterlife");
                        System.exit(0);
                    } else {
                        System.out.println("It is now your turn.");
                    }

                } else {
                    if (goblinrl >= AC) {
                        System.out.println("You've been hit! You take " + (dice.d6gbscimitar3) + " damage.");
                        System.out.println("Your health is now " + (newhealth - dice.d6gbscimitar3 + "."));
                        int newhealth2 = newhealth - dice.d6gbscimitar3;
                        if (newhealth2 <= 0) {
                            System.out.println("You are dead. May the gods bless you in the afterlife");
                            System.exit(0);
                        } else {
                            System.out.println("It is now your turn");
                        }
                    } else {
                        System.out.println("The goblin missed, it is now your turn.");
                    }
                }
            }
            if (choiceagn == 3){
                //run away
                int gboa2 = dice.gbopportunity;
                if (gboa2 >= (8 + DexModifier)){
                    System.out.println("You've been hit while trying to escape");
                    System.out.println("You take " + (dice.d6gbscimitar2) + " damage.");
                    int opportunityhealth2 = newhealth-dice.d6gbscimitar2;
                    System.out.println("Your health is now " + opportunityhealth2 + ".");
                    if (health <= 0){
                        System.out.println("You are dead. May the gods bless you in the afterlife");
                        System.exit(0);
                    } else{
                        System.out.println("It is now the goblin's turn.");
                    }
                } else {
                    System.out.println("You successfully escaped.");
                }
            }
        }
        if (choice == 3){
            System.out.println("You have made it more difficult for the opponent to hit you.");
            System.out.println("It is now the goblin's turn.");
            System.out.println("The goblin attacks you.");
            int goblinrl2 = dice.d20gb2/2;
            if (goblinrl2 == 20) {
                System.out.println("The goblin landed a critical hit! You take " + (dice.d6gbscimitar3 * 2) + " damage.");
                int gbcritdmg2 = dice.d6gbscimitar3 * 2;
                System.out.println("Your health is now " + (newhealth - gbcritdmg2 + "."));
                int newhealth2 = newhealth - dice.d6gbscimitar3;
                if (newhealth2 <= 0) {
                    System.out.println("You are dead. May the gods bless you in the afterlife");
                    System.exit(0);
                } else {
                    System.out.println("It is now your turn.");
                }

            } else {
                if (goblinrl >= AC) {
                    System.out.println("You've been hit! You take " + (dice.d6gbscimitar3) + " damage.");
                    System.out.println("Your health is now " + (newhealth - dice.d6gbscimitar3 + "."));
                    int newhealth2 = newhealth - dice.d6gbscimitar3;
                    if (newhealth2 <= 0) {
                        System.out.println("You are dead. May the gods bless you in the afterlife");
                        System.exit(0);
                    } else {
                        System.out.println("It is now your turn");
                    }
                } else {
                    System.out.println("The goblin missed, it is now your turn.");
                }
            }

        }
        if (choice == 4){
            int gboa = dice.gbopportunity;
            if (gboa >= (8 + DexModifier)){
                System.out.println("You've been hit while trying to escape");
                System.out.println("You take " + (dice.d6gbscimitar2) + " damage.");
                int opportunityhealth = newhealth-dice.d6gbscimitar2;
                System.out.println("Your health is now " + opportunityhealth + ".");
                if (health <= 0){
                    System.out.println("You are dead. May the gods bless you in the afterlife");
                    System.exit(0);
                } else{
                    System.out.println("It is now the goblin's turn.");
                }
            } else {
                System.out.println("You successfully escaped.");
            }
        }
    }
}