package ifStatement;

public class NestedIf1 {
    public static void main(String[] args) {


        boolean myPassport = false;
        boolean myVisa = false;


        if (myPassport == true){

            System.out.println("Passport is good , now we are checking visa");

            if (myVisa == true){

                System.out.println("Visa is Good you can travel now");

            }else {

                System.out.println("You need to have visa to travel");

            }

        }else {

            System.out.println("You need to have Passport FIST");
        }


    }
}
