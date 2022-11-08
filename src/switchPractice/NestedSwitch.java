package switchPractice;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        /*
        IT --> alex / david
    HR --> sara / ana / jessi
    ADMIN
    RECEPTION
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose from following options:\n1 - IT\n2 - HR  \n3 - ADMIN \n4 - RECEPTION");
        int hour = 10;
        int department = scanner.nextInt();

        switch (department) {
            case 1:
                System.out.println("Who do you want to speak with? \nAlex \nDavid");
                scanner.nextLine();
                String name = scanner.nextLine().toUpperCase();
                switch (name) {
                    case "ALEX":
                        System.out.println("What time is it now? ");

                        if (hour >= 8 && hour <= 12) {
                            System.out.println("You are speaking with " + name);
                        }else {
                            System.out.println("Alex is not in the office");
                        }
                        break;
                    case "DAVID":
                        System.out.println("You are speaking with " + name);
                        break;
                    default:
                        System.out.println("There is no such person in IT");
                        break;
                }
                break;
            // HR --> sara / ana / jessi
            case 2:
                System.out.println("Who do you want to speak with? \nSara \nAna \nJessi");
                scanner.nextLine();
                String name1 = scanner.nextLine().toUpperCase();
                switch (name1) {
                    case "SARA":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "ANA":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "JESSI":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("There is no such person in HR");
                        break;
                }
                break;

            default:
                System.out.println("There is no Department for your selection");
                break;

        }


    }
}
