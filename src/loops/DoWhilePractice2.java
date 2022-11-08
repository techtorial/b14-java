package loops;
import java.util.Scanner;
public class DoWhilePractice2 {
    public static void main(String[] args) {
        // by using DO-WHILE loop solve following question
        // ask user to provide 2 integer numbers and find the sum of numbers in the given range
        // input 5 and 10 --> 6 + 7  + 8 + 9 = 30
        //print the sum
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter two integer numbers to find sum of numbers in the range");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;
        // 0 - 5 => 1 + 2 + 3 + 4 =10
        do {
            num1++;
            sum = sum + num1;

        }while( num1 < num2-1 );

        System.out.println("sum after loop "+ sum);

    }
}
