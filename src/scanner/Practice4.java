package scanner;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("please enter your city name");

       // char firstLetter = input.next().toUpperCase().charAt(0);

        char firstLetter = input.next().charAt(0);


        System.out.println("first letter of your city is "+ firstLetter);

        //please modify the first char from lower case to upper case
        String x = "" + firstLetter;
        x = x.toUpperCase();
        System.out.println(x);


    }
}
