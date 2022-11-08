package loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        ask user to give an integer number
        find and print out divisors of the given number
        --> 6 Divisors of --> 1, 2, 3, 6
        --> 10 Divisors of 10 --> 1, 2, 5, 10
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an positive integer value");
        int number = scanner.nextInt();
        int num = 1;

        while (num <= number) {

            if (number % num == 0) {
                System.out.println(num);
            }
            num++;
        }

    }
}
