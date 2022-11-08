package Primitives;

public class RemainderPractice1 {

    public static void main(String[] args) {

        int number1 = 11, number2 = 5;

        int remainder = number1 % number2;

        System.out.println(remainder); // remainder --> 1

        System.out.println(  number1 / number2 ); // division --> 2

        int number3 = 17, number4 = 3;
        // find remainder for division of number3 by number4 and show the result

        System.out.println( number3 % number4 );

        int remainder2 = number3 % number4;
        System.out.println(remainder2);


        int number = 12;

        System.out.println( number % 10); // --> 2

        int number5 = 123;
        System.out.println(number5  % 10 ); // 3

        System.out.println( 19 % 10); // 9
    }

}
