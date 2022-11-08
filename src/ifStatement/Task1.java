package ifStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        ask user to give first letter of the day
        when letter is m --> "It should be monday"
                        t --> "It should be Tuesday or Thursday"
                        ....
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first letter of the Day");

        String firstLetter = scanner.nextLine();

        if (firstLetter.equalsIgnoreCase("m")){
            System.out.println("It should be monday");
        }
        if (firstLetter.equalsIgnoreCase("T")){
            System.out.println("It should be Tuesday or Thursday");
        }
        //========================

        if (firstLetter.startsWith("f")   || firstLetter.startsWith("F")){
            System.out.println("It should be Friday");
        }

        ///+++++++++++++++++++++++++++++
        System.out.println("Please enter first letter of the Day");

        char letter = scanner.nextLine().charAt(0);

        if (letter == 'w' || letter =='W'){
            System.out.println("It should be Wednesday");
        }

        int number=1234;
        if(number==1234)
            System.out.println("Number i" +
                    "" +
                    "s equals to 1" +
                    "" +
                    "234");
        System.out.println("Number is not equals to 1234");


    }
}
