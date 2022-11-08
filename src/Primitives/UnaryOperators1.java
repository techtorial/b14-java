package Primitives;

public class UnaryOperators1 {

    public static void main(String[] args) {

        int a, b = 7, c = 10;

        a = ++b + c++;
        System.out.println(" a is >> " + a); //18

        int result = a * 2 + ++c; //36 + ++c

        System.out.println("c is now " + c);

        System.out.println("result is >> " + result); //37, 38, 48, 47, 49, 50, 45

        System.out.println(++c + c++); // 27, 26, 34, 24, 25

        System.out.println(c);

        System.out.println("b is now " + b);

        int result2 = b++ + b++ - --b;

        System.out.println(result2);
    }
}
