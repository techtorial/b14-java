package OOP.object;

import java.util.Scanner;

public class Practice3Test {
    public static void main(String[] args) {
        MethodPractice3 test = new MethodPractice3();

        test.evenOddFinder();

        System.out.println( test.evenOddFinder().equals("Odd")   ); //false

        String str = test.evenOddFinder();
        System.out.println(str);

        System.out.println(str.toUpperCase());

        System.out.println(  test.evenOddFinder2(9) );

        // let's get the number from user and pass it as a parameter to the method

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number to check even/odd");
        int number = scanner.nextInt();


        System.out.println(test.evenOddFinder2(number));

        // you want to get the number from user every time this evenOddFinder2 method is called

        System.out.println( test.evenOddFinder3());
    }
}
