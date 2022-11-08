package Primitives;

public class NumericPromotion {

    public static void main(String[] args) {

        byte b1 = 1;
        byte b2 = 2;

      // byte result = b1 + b2 ; // 3  compile time error. Smaller data types byte,
                                        // short automatically promoted to int any
                                        // time they're used with arithmetic operator

        int result = b1 + b2 ; // 3

        short sh1 = 3;

       // short result2 = sh1 + b2; // -->5 compile time error. Smaller data types byte,
                                               // short automatically promoted to int any
                                                // time they're used with arithmetic operator
        int result2 = sh1 + b2;


        System.out.println(result); // 3
        System.out.println(result2); // 5

        float fl1 = 4.5f , fl2 = 1.2f;

        float result3 = fl1 + fl2;

        double db1 = 2.3;

       // float result4 = db1 + fl1; compile time error. if two values have different data types,
        // java will automatically promote the one value to the larger of this two data types.

        double result4 = db1 + fl1;

        System.out.println(result4);
    }
}
