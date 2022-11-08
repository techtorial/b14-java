package loops;

public class ForLoopCharPractice {
    public static void main(String[] args) {


        /*
        print out lowercase alphabet
        a, b, c, ..., z
         */

        for ( char ch = 'a'  ; ch <= 'z'  ; ch++  ){



            if ( ch == 'z'){

                System.out.print(ch);

            }else {

                System.out.print(ch+", ");

            }

        }




    }
}
