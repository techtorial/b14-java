package ifStatement;

import java.util.Scanner;

public class ElseIfPractice2 {
    public static void main(String[] args) {
        /*
        get a number from user and check
        if the number is greater than zero tell user that his number is positive
        if the number is less than zero tell user that his number is negative
        or check if it is zero, and let user know
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your number");

        int number = scanner.nextInt();

        if ( number > 0 ){
            System.out.println("number is positive");
        } else  if (number < 0 ) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }


    }
}
