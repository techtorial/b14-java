package scanner;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        String name = "John";
        System.out.println(name);


        Scanner input  = new Scanner(System.in);

        System.out.println("Please enter your last name");

        String lastName = input.nextLine();

        System.out.println(lastName);
        lastName = lastName.toUpperCase();

        System.out.println(name +" "+ lastName);

        //take age of John
        // John your age is ...

        System.out.println("Please enter your age");

        int ageOfJohn = input.nextInt();

        System.out.println( "John your age is: "+ageOfJohn  );


    }
}
