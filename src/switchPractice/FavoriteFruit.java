package switchPractice;

import java.util.Scanner;

public class FavoriteFruit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite fruit?");

        String fruit = scanner.nextLine().toLowerCase();
// strawberry, apple, kiwi, banana, orange, grape
        switch (fruit) {

            case "strawberry":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "apple":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "kiwi":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "banana":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "orange":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;
            case "grape":
                System.out.println("we have your favorite " + fruit + " in our store");
                break;

            default:
                System.out.println("we are sorry, we do not have your favorite " +fruit+ " in the store");

        }

    }
}
