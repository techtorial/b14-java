package loops;
public class TimesTable {
    public static void main(String[] args) {
        /*
        create multiplication table for numbers from 1 to 10 inclusive
        3 * 1 = 3
        3 * 2 = 6
        ...
        4 * 1 = 4
        4 * 2 = 8
        ...
        5 * 1 = 5
        ....
         */

        for (int num1 = 1; num1<=10; num1++){

            for (int num2 = 1; num2 <=10; num2++){

                System.out.println(num1 + " * "+ num2 +" = "+ num1* num2);
            }
            System.out.println("+++++++++++++++++");
        }



    }
}
