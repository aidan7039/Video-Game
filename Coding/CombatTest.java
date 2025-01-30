package Coding;
import java.util.Scanner;
public class CombatTest {
    static Coding.Dice dice = new Dice();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int health = 3 + dice.d10;
        int AC = 13;
        dice.d6gbscimitar = dice.d6gbscimitar + 2;

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
                } else {
                    System.out.println("It is now your turn");
                }
            } else {
                System.out.println("The goblin missed it is now your turn.");
            }
        }
    }
}