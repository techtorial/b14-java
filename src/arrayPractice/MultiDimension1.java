package arrayPractice;

import java.util.Arrays;

public class MultiDimension1 {
    public static void main(String[] args) {


        int[][] numbers = new int[4][5];

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.deepToString(numbers));

        numbers[0][0] = 20;
        numbers[0][1] = 18;
        numbers[0][2] = 12;
        numbers[0][3] = 11;
        System.out.println(Arrays.deepToString(numbers)); // [[20, 18, 12, 11, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        // give a value to third array's last index

        numbers[2][4] = 99;
        System.out.println(Arrays.deepToString(numbers));

        // on the second array, give a value to the last index (use length call)
        numbers[1][ numbers[1].length-1 ] = 222;
        System.out.println(Arrays.deepToString(numbers));

        // on the last arrays last index store value 1 (use length call for both array indexes)

        numbers[3][4] = 2;
        System.out.println(Arrays.deepToString(numbers));

        numbers[numbers.length-1]      [numbers[numbers.length-1].length-1]      =      1;

        System.out.println(Arrays.deepToString(numbers));

        // other version of creating multidimensional array

        int[][] number1 = { {2,3,4,5,66},   { 4,5,6,7,2,1,2,3,4},   {1,2,3} };

        System.out.println(  number1[0].length  ); // 5

        System.out.println(  number1[1].length  ); // 9

        System.out.println(Arrays.deepToString(number1));

        System.out.println(number1[0][4]);

        System.out.println(number1[0][number1[0].length-1]);
    }
}
