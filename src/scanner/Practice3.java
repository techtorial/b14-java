package scanner;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("please enter a sentence");

        String sentence = input.nextLine();

        System.out.println(">> your sentence is >> "+sentence);

        // we will get only first word from entered string

        System.out.println("please enter another sentence");

        String sentence2 = input.next();

        System.out.println("your new sentence is: "+sentence2);

        input.nextLine();
        System.out.println("what is the zipcode");

        int zipcode = input.nextInt();
        System.out.println("you entered "+zipcode);

    }
}
