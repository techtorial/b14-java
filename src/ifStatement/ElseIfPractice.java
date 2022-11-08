package ifStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {

        /*
        90 -100 --> Grade A
        80 -89  --> Grade B
        70 -79  --> Grade C
        60 - 69 --> Grade D
        0  - 59 --> Repeat
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your score form the test");

        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your letter grade is A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your letter grade is B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Your letter grade is C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your letter grade is D");
        }else if (score >=0 && score <=59){
            System.out.println("Failing");
        }else {
            System.out.println("Your entry is out of range");
        }
    }
}
