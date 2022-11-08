package loops;

public class BreakStatement1 {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {


            System.out.println(++i);
            break;
          // System.out.println("afdga");

        }
        System.out.println("===============");


        for (int i = 0; i < 10; i++) {


            System.out.println(i);

            if (i == 6){ break;}
            System.out.println("wwg");
        }
        System.out.println("===============");


        for (int i = 0, k= 20; i < 10; i++ , k--) {


            System.out.println(i);

            if (i > 6 || k < 11) {break;}

            System.out.println("k is: "+k);
        }

        System.out.println();



    }
}
