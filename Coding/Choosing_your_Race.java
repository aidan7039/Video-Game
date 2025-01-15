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
            System.out.println("Being an elf you are light and nimble, you weigh 125 pounds. You are also quite tall standing at an impressive 6'0");
            //WE NEED A NAME FOR THE WORLD/UNIVERSE THAT THE STORY TAKES IN
            System.out.println("Due to your ancestry you are naturally gifted in the magic that penetrates and surrounds the world of _______");
            System.out.println("Being a descendant of the elder people of the Far Lands you can live to be very old");
            System.out.println("If I remember correctly you are 450 years old, around middle age for someone of your lineage");
        }

        if (species == 1) {
            System.out.println("You chose Human, your stats are 11 Str, 11 Dex, 11 Con, 11 Wis, 11 Int, 11 Cha");
            System.out.println("As a human you are moderate in almost every way, a jack of all trades but master of none.");
            System.out.println("You are able to traverse most terrain with ease, you weight 170 pounds and you stand tall at 5'10.");
            System.out.println("You live a shorter life compared to the others races and are 45 years old.");
        }
        if (species == 3) {
            System.out.println("You chose Dwarf, your stats are 12 Str, 10 Dex, 10 Con, 11 Wis, 10 Int, 10 Cha");
            System.out.println("Being a dwarf you are stock, stocky, and large, but they also have a great spirit and are a naturally talented melee fighter.");

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
