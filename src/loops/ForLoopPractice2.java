package loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {


        for ( int a=3  ;    a > 0  ;    a-- ){

            System.out.println("FOR LOOP");

        }

        // find the sum of numbers between 10 and 15
        int sum = 0;
        for ( int a = 10    ;  a <=15   ;  a ++    ){

            sum += a;
           // System.out.println(sum);
        }
        System.out.println(sum);


        // count down to 0 from 20
        for  ( int d = 20   ; d >=0    ; d--    ){

            System.out.println(d);

        }

    }
}
