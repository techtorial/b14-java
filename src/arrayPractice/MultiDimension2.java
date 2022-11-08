package arrayPractice;

import java.util.Arrays;

public class MultiDimension2 {

    public static void main(String[] args) {
        String[][] states = { {"NY", "NY","DE", "NJ"}, {"IL","WI","IN","OH","MI"}, {"CA","OR","WA"} };

        System.out.println(Arrays.deepToString(states));// [[NY, DE, NJ], [IL, WI, IN, OH, MI], [CA, OR, WA]]
        System.out.println( Arrays.toString(states));

        // print each state one at a time

        for (  String[] state : states){

            for ( String st : state){

                System.out.println(st);
            }
        }
        System.out.println("===============");

        System.out.println(states[0][0]);
        System.out.println("===============");

        for ( int i = 0; i < states.length; i++){

            for ( int j = 0; j < states[i].length; j++ ){

                System.out.println(states[i][j]);
            }
            System.out.println("******" +i);
        }
        System.out.println("===============");// { {"NY", "DE", "NJ"}, {"IL","WI","IN","OH","MI"}, {"CA","OR","WA"} };


        System.out.println(  Arrays.toString(states[0]));
        System.out.println("=======+++========");

        // print out each region all together
        for ( String[] st1 : states ){

            System.out.println( Arrays.toString(st1) );
           System.out.println(Arrays.deepToString(st1));
        }



    }
}
