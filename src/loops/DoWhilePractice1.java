package loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {

        // "*****" -->print for 5 times by using while loop

        int number = 0;

        while (number > 5) {

            System.out.println("*****"); // for 5 times

            number++;
        }

        System.out.println("===================");
        //++++++++ do while +++++++++++++
        // "*****" -->print for 5 times by using do while loop
        // local variable: any variable in a block is called local variable.Local variables are only accessible in that block
        int num = 0;
        do {
            // int num = 0; num is a local variable and cannot be used after this block
            System.out.println("*****");
            num++;

        } while (num > 5);
        System.out.println(num);

        //

        int a = 5, b = 10, c = 1;

        do {

            System.out.println(c + ". This is DO block");
            c++;
            b--;
        } while (a <= b);


    }
}
