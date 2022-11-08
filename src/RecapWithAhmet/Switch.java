package RecapWithAhmet;

import java.util.Scanner;

public class Switch {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-there is not directly switch questions.BUt it is good to use in AUTOMATION.(PROFESSIONAL)

        QUESTION:Ahmet, in what condition would you use switch ?

         -->Whenever you have LIMITED options then use switch.(IT IS GOING TO LOOK MORE PROF AND COOL)
     */
    public static void main(String[] args) {
        System.out.println("Please provide a number");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();

        switch (choice){

            case 1:
                System.out.println("IT department");
                break;
            case 2:
                System.out.println("Health Department");
                break;
            case 3:
                System.out.println("Accounting Department");
                break;
            default:
                System.out.println("NO department");
                break;
        }

    }
}
