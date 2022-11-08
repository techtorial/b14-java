package scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {

        /*
        has 200 in the account
        gets 3 paychecks
        spends twice
        ??left over??
         */

        Scanner scanner = new Scanner(System.in);
        double balance = 200;

        System.out.println("Please enter your first paycheck amount");

        double firstCheck = scanner.nextDouble();
        balance  += firstCheck;

        System.out.println("Now the balance is "+balance);

        System.out.println("Please enter your second paycheck amount");

        double secondCheck = scanner.nextDouble();
        balance  = balance + secondCheck;
        System.out.println("Please enter your third paycheck amount");

        double thirdCheck = scanner.nextDouble();
        balance = balance + thirdCheck;

        System.out.println("please enter phone price");
        double phonePrice = scanner.nextDouble();
        balance = balance - phonePrice;

        System.out.println("please enter headphone price");
        double headPhonePrice = scanner.nextDouble();
        balance = balance - headPhonePrice;

        System.out.println("This is your final balance: "+ balance);

    }
}
