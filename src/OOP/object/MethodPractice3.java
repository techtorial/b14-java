package OOP.object;

import java.util.Scanner;

public class MethodPractice3 {

    /*
    create a method that will find out if a number is even number or odd number

    return String

    if number is even --> return --> even

    if number is odd --> return  --> odd
     */

    public String evenOddFinder(){
        int number = 8;

        if (number%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

    }

    public  String evenOddFinder2(int num){

        if (num%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

    }
    public  String evenOddFinder3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number to check even/odd");
        int number = scanner.nextInt();
        if (number%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

    }




}
