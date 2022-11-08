package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user how many colors they want to store in an array
        take those colors from user one by one
        and store into an array
        print stored colors all together to show back to user
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many colors do you want to store? Please enter a number");

        int size = scanner.nextInt();
        scanner = new Scanner(System.in);

        String[] colors = new String[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Please enter " + (i + 1) + ". color");
            colors[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(colors));


    }
}
