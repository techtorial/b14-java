package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("pink");


        // size();
        int size = colors.size();
        System.out.println(size);
        System.out.println(colors);

        System.out.println(colors.get(1));
        String str1 = colors.get(1);
        System.out.println(str1.toUpperCase()); //YELLOW

        //reach out every color in the arraylist and print them out as upper case

        //[red, yellow, red, blue, pink]

       // System.out.println(  colors.get(6));// IndexOutOfBoundsException
        System.out.println("**********");

        for (int i=0; i< colors.size(); i++ ){

            System.out.println( colors.get(i).toUpperCase());
        }

        System.out.println("----------------");

        for( String color: colors){

            System.out.println(color.toUpperCase());
        }
        System.out.println("----------!!!!------");
        int i = 0;
        while (i<colors.size()){

            System.out.println( colors.get(i).toUpperCase());

            i++;
        }



    }
}
