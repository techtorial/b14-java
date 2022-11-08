package arrayPractice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {

        int[] numbers = {15, 8, 3, 34, 7, 12, 100, 35, 8, 1, -9, 23};
        /*
        show each element from this array one by one
         */

        for (int i=0; i < numbers.length; i++){

            System.out.println( numbers[i]  );
        }
        /*
        store number/s which are greater than 10 into an array which is called >> "largerNumbers"
         */
        int[] largerNumbers = new int[numbers.length];

        for (int i = 0; i< numbers.length; i++){

            if (  numbers[i] > 10){

                largerNumbers[i] = numbers[i];
            }

        }
        System.out.println(Arrays.toString(largerNumbers));


    }
}
