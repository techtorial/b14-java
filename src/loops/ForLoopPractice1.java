package loops;

public class ForLoopPractice1 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        // infinite For Loop
//        for (   ;    ;   ){
//
//
//            System.out.println("FOR LOOP");
//        }

        for (; num1 < num2; ) {

            System.out.println("First For loop, Update statement is in the for body/block");
            num1++;
        }
        System.out.println("After first LOOP");
       // num1 = 7;
        for (   num1 = 7 ; num1 < num2; num1++) {

            System.out.println("Second for loop, update statement is in parenthesis");
        }
        System.out.println("num1 is now >> "+num1);

        for ( int a=3  ;  a > 0  ; a-- ){

            System.out.println("FOR LOOP");

        }
    }
}
