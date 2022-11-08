package loops;

public class BreakStatement3 {
    public static void main(String[] args) {

        for (int a = 0; a < 4; a++){

            System.out.println("a is --> "+a);
            System.out.println("----");

            for (int b=0; b < 10; b++ ){

                System.out.println("b is *** "+ b);
                break;
            }
        }
        System.out.println("+++++++++++++++++++++");

        for (int a = 0; a < 10; a++){

            System.out.println("a is --> "+a);
            System.out.println("----");

            for (int b=0; b < 10; b++ ){

                System.out.println("b is *** "+ b);

                if ( a > 2)break;

            }
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&");

        OUTER:
        for (int a = 0; a < 10; a++){

            System.out.println("a is --> "+a);
            System.out.println("----");

            INNER:
            for (int b=0; b < 10; b++ ){

                System.out.println("b is *** "+ b);

                if ( b > 2)break OUTER;

            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");

        for (int a = 0; a < 10; a++){

            System.out.println("a is --> "+a);
            System.out.println("----");

            for (int b=0; b < 10; b++ ){

                System.out.println("b is *** "+ b);

            }
            if ( a > 2) break;

        }





    }
}
