package loops;

public class WhilePractice3 {
    public static void main(String[] args) {
        // your age is 23 now
        // print out --> "my age is ..."
        // till your age gets to age of 29

        int age = 23;

        while (age < 30) {
            System.out.println("my age is " + age);
            age++;
        }

       /*
       starting from number 10
       count by 2
       and print numbers as 10, 12, 14, 16, 18, 20
        */

        int num1 = 10, num2 = 20;

        while (num1 <= num2) {

            System.out.println("My number is now --> " + num1);

            num1 += 2;
//            num1++;
//            num1++;
        }

    }
}
