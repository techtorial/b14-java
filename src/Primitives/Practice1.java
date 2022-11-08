package Primitives;

public class Practice1 {

    public static void main(String[] args){

        // byte, short, int, long, float, double, char, boolean

        byte b1 = 127;
        System.out.println(b1);
        byte b2 = -128;
        System.out.println(b2);

        short sh1 = 1;
        System.out.println(sh1);

        System.out.println( b1 + b2 + sh1);
        int i1 = 23;
        // you can use underscore to separate digits for more readability
        long l1 = 10_000_000_000L;

        float f1 = 2.3F; // you need to put letter 'f' or 'F' when you create float data type

        System.out.println(f1); // 2.3

        double d1 = 3.4;
        double d2 = 3.4d;

        System.out.println(d1); // 3.4
        System.out.println(d2); // 3.4

        double d3 = 10; // 10.0
        int i2 = 10;
        System.out.println(d3); // 10.0
        System.out.println(i2); // 10

        float f2 = 5;
        System.out.println(f2);//
        float f3 = 5.1f;

        System.out.println(    Byte.MAX_VALUE   ); // 127
        System.out.println(    Byte.MIN_VALUE    ); // -128

        // show max and min values for int
        System.out.println( Integer.MAX_VALUE  );
        System.out.println( Integer.MIN_VALUE);








    }
}
