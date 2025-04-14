package Coding;
import java.util.Random;
public class COmbat {
    Random random = new Random();
public int Combat(int a, int b, int c, int d) {
    int atkroll = a + random.nextInt(20) + 1;
    int shortSword = b + random.nextInt(6) + 1;
    int Scimitar = c + random.nextInt(6) + 1;
    int damage = d - shortSword;
    if (atkroll >= 11) {
        System.out.println("The Goblin has " + damage + " health");
    }
    return damage;
}

}
