package loops;

import java.util.Scanner;

public class DoWhileStarTree {
    public static void main(String[] args) {
        /*
        ask user to give you an integer number
        create a star tree for the given number
        input --> 5
        *
        **
        ***
        ****
        *****
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter an integer number");
        int num1 = scanner.nextInt();
        String str = "*";
        do {
            num1--;
            System.out.println(str);
            str +="*";
          // str += str;


        } while (  num1 > 0  );


    }
}
