package string;

public class StringMethods4 {
    public static void main(String[] args) {

        String quote = "just do it";

        // substring(); --> return type is String

        String part = quote.substring(5); // -->
        System.out.println(part);

        String part2  = quote.substring(5, 7); //-> from 5 to 7(excluded)
        System.out.println( part2 );

        // just cut second word from string

         String text = "#####is this dynamic";// --> "this"

        System.out.println(  text.substring(3, 7 )      );

        int indexOfFirstSpace = text.indexOf(" ");
        int indexOfSecondSpace = text.indexOf(" ", indexOfFirstSpace+1);

        String part3 = text.substring(indexOfFirstSpace+1, indexOfSecondSpace );

        System.out.println(part3);

        // replace(); returns String

        text = text.replace('#','*');

        System.out.println(text);

        // get rid of all stars
        text = text.replace('*',' ');// it will not get rid of stars, will replace with space
        System.out.println(text);

        // get rid of all spaces
        text = text.replace(" ","");
        System.out.println(text);

        //JAVA --> change all 'A's with '$'

        String java = "JAVA";

        java = java.replace("A","$");

        System.out.println(java);

        // J$V$ --> replace $V$ with ten stars

        java = java.replace("$V$", "**********");
        System.out.println(java);

        // trim(); --> it will delete all leading and ending spaces
        // "       java      is working      "

        String word = "       java      is working      ";

        System.out.println(   word.trim()   );


        // get rid of all spaces
        word = word.replace(" ", "");
        System.out.println(word);










    }
}
