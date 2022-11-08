package Primitives;

public class RemainderPractice3 {

    public static void main(String[] args) {

        //find the product of digits form given number 215 --> 2 * 1 * 5 = 10
        int number = 209;

        int digit1, digit2, digit3;
        digit1 = number % 10;

        number = number /10;

        digit2 = number %10;

        number = number /10;

        digit3 = number %10;

        System.out.println( digit1 * digit2 *digit3);

    }
}
