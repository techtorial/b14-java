package scanner;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        /*
        BMI: body mass index
        BMI = weight-kg- / (height-m- * height-m-)  18 - 24 FIT

        get weight and height of person by using scanner
        calculate BMI for that person
        show the BMI/result to the person
         */

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Please enter your weight in kg");

        double weight = scanner.nextDouble();

        System.out.println("Please enter your height is meters");

        double height = scanner.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("Your BMI is: "+BMI);
        System.out.println("If your BMI is between 18 - 24, you are considered as FIT");


    }
}
