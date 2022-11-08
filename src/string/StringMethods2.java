package string;

public class StringMethods2 {
    public static void main(String[] args) {

        /*
        startsWith
        endsWith
        contains
         */

        String str = "muffin";

        boolean b1 = str.startsWith("m");

        System.out.println(b1);

        System.out.println( str.startsWith("muf") );

        System.out.println(  str.startsWith("123") );

        System.out.println(   str.endsWith("in"));
        System.out.println(   str.endsWith("n"));

        System.out.println("--------------------");
        boolean b2 = str.contains("muffin");

        boolean b3 = str.contains("xxxx");

        System.out.println(b2);
        System.out.println(b3);
        System.out.println("--------------------");

        System.out.println(   str.contains("mfn"));

        System.out.println(    str.contains("MUFFIN"));


    }
}
