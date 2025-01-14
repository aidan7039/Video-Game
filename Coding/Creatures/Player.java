package Coding.Creatures;
import Coding.Creatures.Class;
public class Player {

    static Class basicStats = new Class();
    public static void main(String[] args) {
        System.out.println(basicStats.a);
        System.out.println(basicStats.Str);
        System.out.println(basicStats.Dex);
        System.out.println(basicStats.Con);
        System.out.println(basicStats.Int);
        System.out.println(basicStats.Wis);
        System.out.println(basicStats.Cha);
        int i = basicStats.Str + 2;
        System.out.println(i);
    }
}
