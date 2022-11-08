package OOP.object;

import java.util.Arrays;

public class ReturnPractice {

    /*
    create a method that will return an array of e-mails
    this method should take an array of names of students as parameter
    this method should create e-mail for every student and store it into an array
    ex: Alex --> output email >> Alex@gmail.com

     */




    public String[] emailCreator(String[] names){

        String[] emails = new String[names.length];


        for(int i=0; i< names.length; i++){

            emails[i] =   names[i]+ "@gmail.com";

        }
        System.out.println( Arrays.toString(emails));
        return emails;
    }

    public static void main(String[] args) {

        ReturnPractice object = new ReturnPractice();
        String[] names = {"Alex","Dima", "Ahmet","Aida"};
        object.emailCreator(names);

        System.out.println(Arrays.toString( names));
        System.out.println( Arrays.toString( object.emailCreator(names) ));

    }
}
