package Primitives;

public class TruthTable2 {

    public static void main(String[] args) {
        /*
        age 7 or  up
        height of 42" or up
        with parent
         */
        int kidAge = 4, ageLimit = 7, kidHeight = 40, heightLimit = 42;
        boolean parentWants = false, parentReq = true;

        //kidAge >= ageLimit
        //kidHeight >= heightLimit
        //parentWants == parentReq

        Boolean canRide = kidAge >= ageLimit || kidHeight >= heightLimit || parentWants == parentReq;

        System.out.println(canRide);
        System.out.println("===================");
        // B+2 ==3*C || !TRUE && C<B/3

        int b = 3, c = 10;

        boolean result = b + 2 == 3 * c || !true && c < b / 3;

        System.out.println(result); // true/false


    }

}
