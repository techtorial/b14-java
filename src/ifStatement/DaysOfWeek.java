package ifStatement;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        /*
        Use scanner to get a number between 1 and 7

        1 - > print "Monday"
        2 - > print "Tuesday"
        3 - > print "Wednesday"
            .....
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");

        int number = input.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wednesday");
        }
        if (number == 4) {
            System.out.println("Thursday");
        }
        if (number == 5) {
            System.out.println("Friday");
        }
        if (number == 6) {
            System.out.println("Saturday");
        }
        if (number == 7) {
            System.out.println("Sunday");
        }
        //
        if (number < 1 || number > 7) {
            System.out.println("Invalid entry");
        }

    }
}
