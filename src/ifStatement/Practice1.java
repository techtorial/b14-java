package ifStatement;

public class Practice1 {

    public static void main(String[] args) {


        int number1 = 5;
        int number2 = 10;

        System.out.println("**************");

        if( number1  == number2  ){
            System.out.println("This is inside of first IF block");
        }


        if(  number1 < number2 ){

            System.out.println("This is SECOND if Block");
        }
        System.out.println("+++++++++++++++++++++");

        number2++;

        String color = "red";

        if ( color.equals("red") ){

            System.out.println("This is my favorite color");
        }

        System.out.println("$$$$$$$$$$$$$$$$$$");

        if( !color.equals("red")  ){

            System.out.println("this could be any other color");
        }

        number2++;
        System.out.println(++number2+" ==================");

        if ( !color.equals("blue")){

            System.out.println("My favorite is actually Blue");

            int x = number2 + number1;
            x *= x;// x = x * x;
            System.out.println("final x is "+x);
        }

    }
}
