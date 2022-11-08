package loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {

        /*
        Ask user to give a positive integer number
        for the given number
        create a multiplication table
        userEntry --> 3
                        3 * 1 = 3
                        3 * 2 = 6
                        3 * 3 = 9
                        ...
                        3 * 10 =30
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an positive integer value");
        int number = scanner.nextInt();
        int number2 = 1;
        //int result = number * number2;

       while (number2 < 11){

           System.out.println( number +" * " +  number2 +" = "+  number * number2);
            number2++;
       }

    }
}
