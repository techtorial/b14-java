package ifStatement;

import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {
        /*
        when your payment is 100 or more you get 20% discount
        otherwise you get only 5% discount

        ask user how much he/she spend
        calculate final payment after discount and show it
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how much you spend?");
        double spending = scanner.nextDouble();

        if (spending >= 100) {

            //  spending * 0.80
            System.out.println("Your final payment after 20% discount is " + (spending - (spending * 0.20)));
        } else {

            System.out.println("Your final payment after 5% discount is:" + (spending - (spending * 0.05)));
        }
        System.out.println("Thank you for shopping");


    }
}
