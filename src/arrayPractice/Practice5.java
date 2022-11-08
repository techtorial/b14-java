package arrayPractice;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {

        int[] zipcodes = {11,12,13,14,22,23,24};

        /*
        find out even zipcodes and print them
        -store odd zipcodes in another array named as oddZipcodes
         */
        int[] oddZipcodes = new int[zipcodes.length];
        for (int i= 0; i < zipcodes.length; i++){

            if (zipcodes[i] % 2 ==0){
                System.out.println(zipcodes[i]+" << even zipcode");
            }else {

                oddZipcodes[i] = zipcodes[i];

            }
        }
        System.out.println(Arrays.toString(oddZipcodes));


    }
}
