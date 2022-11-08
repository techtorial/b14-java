package loops;

import java.util.*;

public class CoinGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String yesNo;
        do {

            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL");
            String userGuess = scanner.nextLine();

            int flip = random.nextInt(2);

            String result = flip == 0 ? "HEAD" : "TAIL";

            if (userGuess.equalsIgnoreCase(result)) {

                System.out.println("You are lucky, it is your day today.");
            } else {
                System.out.println("Sorry, that was not the correct choice!");
            }

            System.out.println("Do you want to play again? yes/no");
            yesNo = scanner.nextLine();
        } while (yesNo.equalsIgnoreCase("yes"));

        System.out.println("Its Ok, SEE you NEXT time!");

    }
}
