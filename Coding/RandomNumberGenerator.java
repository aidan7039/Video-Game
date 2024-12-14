package Coding;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer
        int randomNumber = random.nextInt();

        // Generate a random integer between 0 (inclusive) and 10 (exclusive)
        int randomNumberBetween0And10 = random.nextInt(10);

        // Generate a random integer between 5 (inclusive) and 15 (exclusive)
        int randomNumberBetween5And15 = random.nextInt(10) + 5;

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();

        // Print the generated numbers
        System.out.println("Random Integer: " + randomNumber);
        System.out.println("Random Integer between 0 and 10: " + randomNumberBetween0And10);
        System.out.println("Random Integer between 5 and 15: " + randomNumberBetween5And15);
        System.out.println("Random Double: " + randomDouble);

        System.out.println();
    }
}
