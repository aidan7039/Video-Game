package Coding;
import java.lang.Integer;

public class Testing_Something {
    int x = 1;
    static Coding.Dice dice = new Dice();
    static Coding.Class basicStats = new Class();
    static Coding.test1 gdh = new test1();
    Testing_Something test = new Testing_Something();
    Choosing_your_Class cyc = new Choosing_your_Class();
    //public static void Run3() {
    public static void main(String[] args) {

        //System.out.println(basicStats.a);
        int health = 3 + dice.d10;
        int AC = 13;
        int t1 = dice.d61 + dice.d62 + dice.d63;
        int t2 = dice.d64 + dice.d65 + dice.d66;
        int t3 = dice.d67 + dice.d68 + dice.d69;
        int t4 = dice.d610 + dice.d611 + dice.d612;
        int t5 = dice.d613 + dice.d614 + dice.d615;
        int t6 = dice.d616 + dice.d617 + dice.d618;
        /*System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        int overallrole = t1 + t2 + t3 + t4 + t5 + t6;
        System.out.println("Overall role " + overallrole + ".");*/

        //the below line shows that we can use Strings from other classes
        //System.out.println(gdh.story);

        //THE BELOW CODE IS AN EXAMPLE OF WHAT A COMBAT ENCOUNTER MIGHT LOOK LIKE
        dice.d6gbscimitar = dice.d6gbscimitar + 2;

            System.out.println("Your maximum health is " + health + ".");
            System.out.println("You've been spotted by a goblin they're about to attack you!");
            int goblinrl = dice.d20gb;
            if (goblinrl >= AC) {
                System.out.println("You've been hit! You take " + (dice.d6gbscimitar) + " damage.");
                System.out.println("Your health is now " + (health - dice.d6gbscimitar + "."));
                if (health <= 0){
                    System.out.println("You are dead. May the gods bless you in the afterlife");
                }
            } else {
                System.out.println("The goblin missed it is your turn to attack.");
            }

    }
}