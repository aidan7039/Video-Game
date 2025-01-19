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
        System.out.println(dice.d20);

        //the below line shows that we can use Strings from other classes
        System.out.println(gdh.story);

    }
}