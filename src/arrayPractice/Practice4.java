package arrayPractice;

public class Practice4 {
    public static void main(String[] args) {
        /*
        [3, 6, 23, 1, 5, 55, 2, 8] --> find the biggest number
         */
        int[] numbers = {3, 6, 23, 1, 5, 55, 200, 8,1,1,3,24,-500};
       // System.out.println(numbers.length);

        int max = numbers[0];
        int min = numbers[0];
        for ( int i =0; i< numbers.length; i++){

            if ( max < numbers[i]){

                max =numbers[i];
            }
            if ( min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        // find the smallest number

    }
}
