package ifStatement;

import java.util.Scanner;

public class NestedIf3 {
    public static void main(String[] args) {
        //java-selenium/cypress-API-SQL --> Congrats!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Do you know JAVA?");

        String java = scanner.nextLine();

        if (java.equalsIgnoreCase("yes")) {

            System.out.println("Do you know Selenium/Cypress?");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("selenium")) {

                System.out.println("We are very pleased to hear about it..");
                System.out.println("Do you know API testing?");
                String API = scanner.nextLine();

                if (API.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL?");
                    String sql = scanner.nextLine();

                    if (sql.equalsIgnoreCase("yes")) {

                        System.out.println("CONGRATS! You are HIRED!!");
                    } else {
                        System.out.println("We need someone who knows SQL");
                    }

                } else {
                    System.out.println("We need someone who knows API");
                }


            } else if (answer.equalsIgnoreCase("cypress")) {
                System.out.println("We are very pleased to hear about it..");
                System.out.println("Do you know API testing?");
                String API = scanner.nextLine();

                if (API.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL?");
                    String sql = scanner.nextLine();

                    if (sql.equalsIgnoreCase("yes")) {

                        System.out.println("CONGRATS! You are HIRED!!");
                    } else {
                        System.out.println("We need someone who knows SQL");
                    }

                } else {
                    System.out.println("We need someone who knows API");
                }


            } else {
                System.out.println("We need someone who knows Selenium");
            }

        } else {

            System.out.println("We need someone who knows Coding Language");
        }
        System.out.println("that was nice to meet with you");

    }
}
