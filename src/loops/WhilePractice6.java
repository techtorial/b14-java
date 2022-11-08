package loops;

import java.util.Scanner;

public class WhilePractice6 {

    public static void main(String[] args) {
        /*
        Ask user to give a String Value
        -print out every single character from the given string

        "watermelon" --> w - a - t - ...
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String str = scanner.nextLine();

        //"watermelon" --> str.charAt(0); --> w
        //                  str.charAt(1); -> a
        //                  str.charAt(2); -> t
        int index = 0;
        while (   index <= str.length()-1){
            System.out.print(  str.charAt(index) +" - " );

            index++;
        }
    }

}
