package loops;

import java.util.Scanner;

public class WhilePractice7 {
    public static void main(String[] args) {
        /*
         get two integer numbers from user
         -make sure user is giving second number greater than the first one

         find and show sum/total of the numbers between those two numbers

         ex:   10  and  15  --> 10 + 11 + 12 + 13 + 14 + 15 => "sum is 75"

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first integer value");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second integer value which should be greater than first number you entered");
        int number2 = scanner.nextInt();
        int total = 0;

        while (number1 <= number2) {

            System.out.print(number1 + " + ");


            total = total + number1;


            number1++;


        }
        System.out.println("Total is: " + total);


    }
}
