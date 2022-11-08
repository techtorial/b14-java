package arrayPractice;

import java.util.Arrays;

public class BinarySearchPractice {

    public static void main(String[] args) {


        int[] numbers = { 12, 8, 3, 5, 6, 7,10, 15};
        // before sort
        System.out.println(Arrays.toString(numbers));// [12, 8, 3, 5, 6, 7, 10, 15]

        Arrays.sort(numbers);
        // After sort
        System.out.println(Arrays.toString(numbers)); // [3, 5, 6, 7, 8, 10, 12, 15]

        System.out.println(  Arrays.binarySearch(numbers, 3) );

        System.out.println(  Arrays.binarySearch(numbers, 10) );

        System.out.println(  Arrays.binarySearch(numbers, 4) );
        System.out.println(  Arrays.binarySearch(numbers, 9) );

        int a = Arrays.binarySearch(numbers, 4);

        System.out.println(a);


    }
}
