package Coding;
import java.util.Random;
public class COmbat {
    Random random = new Random();
public int Combat( int enemyHealth) {
    int atkroll = random.nextInt(20) + 1;
    int shortSword = random.nextInt(6) + 1;
    int Scimitar = random.nextInt(6) + 1;
    int damage = enemyHealth - shortSword;
    if (atkroll >= 11) {
        System.out.println("The Goblin has " + damage + " health");
    }
    return damage;
}

}
