package string;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        TASK: Ask user to enter a String value which should have space at the beginning or end
	- Replace all letter 'a's with single '*' and letter 'e's with double '**',
	- change all string value to UPPERCASE
	- Find index of First '*'
	- Multiply that value by 10 and
	- Print out the result
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter string value which should have some leading or ending spaces");

        String str = scanner.nextLine();

        System.out.println(str.replace('a', '1')
                .replace("e", "**")
                .toUpperCase()
                .indexOf("*") * 10);

        int number = str.replace('a', '1')
                .replace("e", "**")
                .toUpperCase()
                .indexOf("*")*10;
        System.out.println(number);

        String a = "hello";
        // System.out.println(a.substring(0, 7));

    }
}
