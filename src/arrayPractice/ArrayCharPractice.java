package arrayPractice;

import java.util.Arrays;

public class ArrayCharPractice {
    public static void main(String[] args) {

        //{'A', '2', '%', '2', 'd', '?', '5'}
        // print out only digits from given array(use for each loop)

        char[] array = {'A', '2', '%', '2', 'd', '?', '5'};

        char[] digits = new char[array.length];
        int i=0;
        for( char ch  : array  ){

            if ( ch >= '0' && ch <= '9'){

                System.out.println(ch);

                digits[i] = ch;
                   i++;
            }
         
        }
        System.out.println(Arrays.toString(digits));

        for ( int x: digits){
            System.out.println( x * 100);
        }


        int a = 't';
        System.out.println(a); // decimal number

    }
}
