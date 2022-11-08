package switchPractice;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 5");

        int number = scanner.nextInt();

        switch (number){

            default:
                System.out.println("Invalid number for days");break;

            case 1:
                System.out.println("This is Monday");
                break;

            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;



        }

    }

}
