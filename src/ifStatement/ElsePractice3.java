package ifStatement;

import java.util.Scanner;

public class ElsePractice3 {
    public static void main(String[] args) {
        /*
        ask user to give an integer value
        -find out if given number is 'odd' number or 'even' number

        even number--> any number divisible by 2
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");

        int number = input.nextInt();

        if (number % 2 == 0) {

            System.out.println("your number is Even number >> " + number);
            System.out.println("-----");

        }else {

            System.out.println("Your number is an ODD number .. " + number);
            System.out.println("+++++++++++");

            System.out.println("!!!!!!!!!!!!!!!");
        }



    }
}
