package loops;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random(); // created Random object

        int number = random.nextInt( 2);

        System.out.println(number);

    }
}
