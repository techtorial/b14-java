package arrayPractice;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

        int[] numbers = new int[7];

        int num = 2;
        System.out.println(num);// 2
        System.out.println(numbers);// it will print hashcode/location of the array
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0, 0, 0] these are default values
        // since there is no data stored in the array yet

        numbers[0] = 3;
        numbers[4] = 24;
        numbers[1] = 5;
        numbers[2] = 9;

        System.out.println(Arrays.toString(numbers)); // [3, 5, 9, 0, 24, 0, 0]

        // show only specific element in specific index
        System.out.println(numbers[0]); // 3 which data on the o index
        System.out.println(numbers[4]);// 24

        // store 99 on the last index
        numbers[6] = 99;
        System.out.println(numbers[6]); // 99
        // store 100 on the last index without hardcoding the index number 6
        // reassignment

        numbers[numbers.length - 1] = 100;

        System.out.println(numbers[numbers.length - 1]);

        // length --> it will return size of array
        System.out.println(numbers.length); // 7

        String str = "test";
        str.length();

        System.out.println(Arrays.toString(numbers)); // [3, 5, 9, 0, 24, 0, 100]

        //reassignment for index 1
        numbers[1] = 55;
        System.out.println(Arrays.toString(numbers));// [3, 55, 9, 0, 24, 0, 100]
        // since the capacity is 7, can you put some data to further index?
        //   numbers[9]= 11; // ArrayIndexOutOfBoundsException
        // numbers[7]= 11;
        //  System.out.println( numbers[10]); // ArrayIndexOutOfBoundsException


    }

}
