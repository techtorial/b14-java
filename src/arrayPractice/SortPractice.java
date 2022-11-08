package arrayPractice;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {


        int[] numbers = {15, 8, 3, 34, 7, 12, 100, 35, 8, 1, -9, 23};

//        int[] numbers = new int[10];
//
//        numbers[1] = -9;
//        numbers[5] = 25;
        // printing before sort
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        // printing AFTER sort
        System.out.println(Arrays.toString(numbers));

        // find the largest number form given array
        System.out.println(numbers[numbers.length - 1]);
        // find the smallest number form given array
        System.out.println(numbers[0]);

        System.out.println(numbers[5]);

        String[] donuts = {"vanilla","Strawberry","chocolate","nutella","Cherry"}; // NullPointerException
        // printing before sort
        System.out.println(Arrays.toString(donuts));

        Arrays.sort(donuts);
        // printing AFTER sort
        System.out.println(Arrays.toString(donuts));

        // make every donut as uppercase and store them into another donut array and print, if the donut's name longer than 7 letters
        String[] newDonuts = new String[donuts.length];
        for (int i=0; i< donuts.length; i++){

            newDonuts[i] = donuts[i].toUpperCase();//"vanilla","Strawberry","chocolate","nutella","Cherry" ==> to UpperCase

            if (newDonuts[i].length() > 7){

                System.out.println( newDonuts[i] );
            }
        }
        System.out.println(Arrays.toString(newDonuts));


    }
}
