package loops;

public class WhilePractice1 {
    public static void main(String[] args) {

        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");
        System.out.println("Let's do it");

        System.out.println("==================");
        // print out this sentence 10 times
        int count = 0;

        while (count < 10) {

            System.out.println("Let's do it");

            // update the condition
            ++count;

        }

        System.out.println(count);

       while ( count > 0 ){
           System.out.println("It is Tuesday night");

           count--;

       }
        System.out.println(count);

        // 1. I did it
        // 2. I did it
        // 3. I did it
        //  ...
        // 15. I did it
        int number = 1;
        while ( number < 16 ){

            System.out.println(  number +  ". I did it");
            number++;

        }


    }
}
