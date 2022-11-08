package Primitives;

public class UnaryOperators {

    public static void main(String[] args) {

        int cost = 12;
        System.out.println(cost);

        ++cost; // 13
        System.out.println(cost);

        --cost; // 12

        System.out.println(cost);
        //==============

        System.out.println("===========");

        System.out.println( ++cost  );

        System.out.println("===========");

        System.out.println( cost++ );

        System.out.println("****");
        System.out.println(cost);


        System.out.println("------------");
        int number = 4;

        --number;
        System.out.println(number); // 3

        number--;
        System.out.println(number); // 2

        System.out.println(--number); // 1

        System.out.println(number--); // shows 1 , but the number is 0
        int product  = 5 * number;
        System.out.println(product);

        ++product;
        System.out.println();

    }

}
