package Coding;

import java.util.Scanner;
public class Chosing_your_Race {


    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("enter your selected Species");
        System.out.println("1. Human");
        System.out.println("2. Elf");
        System.out.println("3. Dwarf");
        System.out.println("4. Halfling");
        int species = hello.nextInt();
        if (species == 2) {
            System.out.println("You chose elf your stats are 1 Str, 1 Dex, 1 Con, 1 Wis, 1 Int, 1 Cha");
        }if (species == 1) {
            System.out.println("You chose Human your stats are 1 Str, 1 Dex, 1 Con, 1 Wis, 1 Int, 1 Cha");
        }if (species == 3) {
            System.out.println("You chose Dwarf your stats are 1 Str, 1 Dex, 1 Con, 1 Wis, 1 Int, 1 Cha");
        }if (species == 4) {
            System.out.println("You chose Halfling your stats are 1 Str, 1 Dex, 1 Con, 1 Wis, 1 Int, 1 Cha");
        }if (species > 4) {
            System.out.println("you are a ant");
            System.out.println("its stats are 0 Str, 1 Dex, 0 Con, 0 Wis, 0 Int, 0 Cha");
        }
    }

}