package arrayPractice;

public class ForEachPractice {
    public static void main(String[] args) {


        int[] numbers = {15, 8, 3, 34, 7, 12, 100, 35, 8, 1, -9, 23};


        // print out number from the array by using for-each loop

        for (int num : numbers) {

            System.out.println(num);
        }

        System.out.println("++++++++++++++++");
        /*
        print out number that are less than 10 by using for each loop
         */
        for (int num : numbers) { // 15, 8, 3, 34, 7, 12, 100, 35, 8, 1, -9, 23

            if (num < 10) {
                System.out.println(num);
            } else {
                System.out.println(num * 100);
            }
        }
        System.out.println("++++++++++++++++");
        /*
        // 15, 8, 3, 34, 7, 12, 100, 35, 8, 1, -9, 23
        find sum of numbers and show it --> use for each loop to solve the question
         */

        int sum = 0;
        for ( int number: numbers ){

            sum = sum + number;
            System.out.println("sum is in progress now >> "+sum);
        }

        System.out.println("final sum is : "+sum);


    }
}
