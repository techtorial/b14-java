package loops;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {



        int m = 5, k =10;


        for (  m=0, k =20    ;  m < 10  &&  k > 5   ;  m++, k--  ){

            System.out.println("m is >> "+m);
            System.out.println("k is >> "+k);

        }

        System.out.println("===============");


        for ( int x = 5, y = x +1, z = 10   ; x <= z ; y++, z-- ){


            System.out.println("y is: "+y);

        }
        System.out.println("===============");

        //when you create multiple variables in for loop they have to be same data type
//        for ( int a =1, char l = 'w'  ;  a< 10  ; a++ ){
//
//            System.out.println("Hi");
//        }
//

        for (String str = "test";  str.equals("test"); str = str.toUpperCase() ){


            System.out.println("String example");

        }
    }
}
