package Coding;

import java.util.Scanner;

import Coding.keybinds.Keybinds;
import Coding.keybinds.Keybinds_For_Race_Choice;

public class Choosing_your_Race {
    //public static void main(String[] args) {
    public static int Section;
    public static void Run2() {
        Section = 3;
        Scanner hello = new Scanner(System.in);
        System.out.println("Please choose your race");
        System.out.println("1. Human");
        System.out.println("2. Elf");
        System.out.println("3. Dwarf");
        System.out.println("4. Halfling");
        System.out.println("5. Dragonborn");
        int species = hello.nextInt();
        if (species == 2) {
            System.out.println("You chose elf, your stats are 10 Str, 12 Dex, 10 Con, 10 Wis, 11 Int, 10 Cha");
            /*int estr = 10;
            int edex = 12;
            int econ = 10;
            int ewis = 10;
            int einl = 11;
            int echa = 10;*/
        }

        if (species == 1) {
            System.out.println("You chose Human, your stats are 11 Str, 11 Dex, 11 Con, 11 Wis, 11 Int, 11 Cha");
            /*int hstr = 11;
            int hdex = 11;
            int hcon = 11;
            int hwis = 11;
            int hinl = 11;
            int hcha = 11;*/
        }
        if (species == 3) {
            System.out.println("You chose Dwarf, your stats are 12 Str, 10 Dex, 10 Con, 11 Wis, 10 Int, 10 Cha");
        }if (species == 4) {
            System.out.println("You chose Halfling, your stats are 10 Str, 12 Dex, 11 Con, 10 Wis, 10 Int, 11 Cha");
        }if (species > 5) {
            System.out.println("you are an ant");
            System.out.println("its stats are 0 Str, 1 Dex, 0 Con, 0 Wis, 0 Int, 0 Cha");
        }if (species == 5) {
            System.out.println("You chose Dragonborn, your stats are 12 Str, 10 Dex, 10 Con, 10 Wis, 10 int, 11 Cha");
        }

    }
}
