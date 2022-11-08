package arrayPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        double[] numbers = new double[10];

        numbers[0] = 2;
        numbers[2] = 3;
        numbers[1] = 7;
        numbers[3] = 9.8;
        numbers[7] = 23.1;
        numbers[9] = 10.5;

        System.out.println(Arrays.toString(numbers)); //[2.0, 7.0, 3.0, 9.8, 0.0, 0.0, 0.0, 23.1, 0.0, 10.5]

        //print out/reach out every single element one by one

        for ( int i = 0; i < numbers.length; i++ ){

            System.out.println(numbers[i]);
        }


        String str2 =   Arrays.toString(numbers);
        System.out.println(str2.charAt(0)); //



        String str3 = "5625y245";
        System.out.println(str3);

        String[] cookies = new String[5];

        cookies[0] = "chocolate";
        cookies[1] = "almond";
        cookies[3] = "oreo";
        cookies[4] = "bounty";

        System.out.println( Arrays.toString(cookies)); // [chocolate, almond, null, oreo, bounty]

        // print out every cookie one at a time by saying _>> "I like ..."
        // do not show null cookies if there is any
        for (int a = 0; a < cookies.length; a++){

            if ( cookies[a] != null)
            System.out.println( "I like "+ cookies[a] );
        }


    }
}
