package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice2 {


    public static void main(String[] args) throws FileNotFoundException, InterruptedException {


        System.out.println("Before");
        FileInputStream fileInputStream = new FileInputStream("Test");

        System.out.println( fileInputStream);
        System.out.println("After");

        Scanner scanner = new Scanner(fileInputStream);

        while ( scanner.hasNextLine()  ){
            Thread.sleep(15000);
            System.out.println(scanner.nextLine());
        }
       // finally{}

    }











    public void parser(String str){
        try {
            Integer.parseInt(str);
        }catch (NumberFormatException exception){
            System.out.println("exception");
        }
    }


}
