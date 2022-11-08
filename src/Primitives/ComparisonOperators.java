package Primitives;

public class ComparisonOperators {

    public static void main(String[] args) {

        int num1 = 5, num2 = 6;

        System.out.println(num1 == num2); // false

        boolean b1 = num1 == num2; // b1 -> false

        System.out.println(b1 == (num1 == num2)); // true

        System.out.println("------!=-------");

        System.out.println(num1 != 5); //

        boolean b2 = num2 != num1;
        System.out.println(b2);
        System.out.println("------>--greater than-----");

        boolean b3 = num1 > --num2;

        System.out.println(b3);// false
        System.out.println(!b3);// true

        System.out.println(  num1 > num2   ); // false
        System.out.println("------ >= --greater than or equal-----");


        System.out.println(  num1 >= num2   ); // true

        num1--;
        System.out.println( num1 >= num2--);
        System.out.println(num1 >= num2);

        System.out.println("------ < -- less than -----");

        num1  = 2; num2 = 8;
        System.out.println(  num2  < ++num1 );

        System.out.println("------ <= -- less than or equal -----");

        System.out.println( num2 <= num1);















    }
}
