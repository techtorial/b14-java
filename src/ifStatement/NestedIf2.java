package ifStatement;
import java.util.Scanner;
public class NestedIf2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city name");

        String city = input.nextLine();

        if ( city.equalsIgnoreCase("chicago")){

            System.out.println("Please enter your school name");
            String schoolName = input.nextLine();

            if ( schoolName.equalsIgnoreCase("techtorial") ){

                System.out.println("You are Lucky");
            }else{

                System.out.println("Please visit US");
            }

        }else{

            System.out.println("come to chicago and ask for techtorial");
        }



    }
}
