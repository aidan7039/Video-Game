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

        public Character(String name, String CClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int AC, int HP, int speed, String weapon){
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
        

    public int atkShortsword(int a){
        int result = a + random.nextInt(6) + 1;
        return result;
    }

    public int atkScimitar(int a){
        int result = a + random.nextInt(6) + 1;
        return result;
    }

    public int rollInitiative(int a){
            int rollIni = a + random.nextInt(20) + 1;
            return rollIni;
    }

    public int atkRoll(int a){
        int result = a + random.nextInt(20) + 1;
        return result;
    }

    public static void main(String[] args) {

            Character Kleebur = new Character("Kleebur","wizard",14,16,14,18,12,10,14,12,30, "shortsword");
            Character Goblin = new Character("Goblin","fighter",8,14,10,10,8,8,11,7,30,"scimitar");
            COmbat combat = new COmbat();
        Kleebur.listStats();
        //below is a very basic example of combat with the new character classes
        int Ghealth = combat.Combat(7);
        if (Ghealth > 0) {
            int Ghealth2 = combat.Combat(Ghealth);
            if (Ghealth2 <= 0) {
                System.out.println("you have killed the goblin");
            } else {
                int Ghealth3 = combat.Combat(Ghealth2);
                if (Ghealth3 <= 0) {
                    System.out.println("you have killed the goblin");
                }
            }
        } else {
            System.out.println("You have killed the goblin");
        }
        /*int atkrl = Kleebur.atkRoll(0);
        int atkrl2 = Goblin.atkRoll(0);
        System.out.println("Kleebur rolled a " + atkrl);
        System.out.println("Goblin rolled a " + atkrl2);
        if(atkrl >= Goblin.AC){
            int shrtswrd = Kleebur.atkShortsword(0);
            System.out.println("Kleebur hit the goblin and dealt " + (shrtswrd) + " damage");
            System.out.println("The Goblin's HP is now " + (Goblin.HP-shrtswrd));
        }
        if (atkrl2 >= Kleebur.AC){
            int scimitar = Goblin.atkScimitar(0);
            System.out.println("Goblin hit Kleebur and dealt " + (scimitar) + " damage");
            System.out.println("Kleebur's HP is now " + (Kleebur.HP-scimitar));*/
        }
    }

