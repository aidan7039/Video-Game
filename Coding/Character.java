package Coding;
import java.util.Random;
public class Character {

        Random random = new Random();

        String name;
        int strength;
        int dexterity;
        int constitution;
        int intelligence;
        int wisdom;
        int charisma;
        int AC;
        int HP;
        int speed;
        String weapon;

        public Character(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int AC, int HP, int speed, String weapon){
            this.name = name;
            this.strength = strength;
            this.dexterity = dexterity;
            this.constitution = constitution;
            this.intelligence =  intelligence;
            this.wisdom = wisdom;
            this.charisma = charisma;
            this.AC = AC;
            this. HP = HP;
            this.speed = speed;
            this.weapon = weapon;
        }

        public void listStats(){
            System.out.println("Name:" + name);
            System.out.println("Strength:" + strength);
            System.out.println("Dexterity:" + dexterity);
            System.out.println("Constitution:" + constitution);
            System.out.println("Intelligence:" + intelligence);
            System.out.println("Wisdom:" + wisdom);
            System.out.println("Charisma:" + charisma);
            System.out.println("AC:" + AC);
            System.out.println("HP:" + HP);
            System.out.println("Speed:" + speed);
            System.out.println("Weapon:" + weapon);
        }

    public void attack() {
            int d20 = random.nextInt(20) + 1;
        if(weapon == "shortsword") {
            int shortsword = random.nextInt(6) + 1;
            System.out.println("Attack Roll:" + d20);
            System.out.println("Damage Roll" + shortsword);
        } if (weapon == "scimitar"){
            int scimitar = random.nextInt(6) + 1;
            System.out.println("Attack Roll" + d20);
            System.out.println("Damage Roll" + scimitar + 2);
        }
    }

    public void rollInitiative(){
            int rollIni = random.nextInt(20) + 1;
            System.out.println(rollIni);
    }

    public static void main(String[] args) {

            Character Kleebur = new Character("Kleebur",14,16,14,18,12,10,14,23,30, "shortsword");

        Kleebur.listStats();
    }
}
