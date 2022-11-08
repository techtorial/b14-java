package string;

public class StringMethods1 {
    public static void main(String[] args) {

        String day = "today";
        // concat()
        String str = day.concat(" is saturday");

        // indexing
        // charAt(); finds and returns char at a given index number

        char letter1 = day.charAt(0); // t
        System.out.println(day.charAt(0)); // t

        System.out.println(letter1);

        // day = "" +  day.charAt(0);
        System.out.println(day);

        // use charAt method, find and store last letter from the string day and show it on the console
        //today
        //01234
        char last = day.charAt(4);
        System.out.println(last);

        //   System.out.println( day.charAt(8)); // run time error -->String index out of range: 8
        //  System.out.println(day.charAt(-2)); //  String index out of range: -2

        // length(); --> returns/counts number of characters on the string
        day.length(); // 5
        System.out.println(day.length());

        int l = day.length();

        System.out.println(l);
        System.out.println(day.length() == l); // true

        // can you use length to find out last index number? --> day.length() - 1


        System.out.println(day.charAt(day.length() - 1));

        System.out.println(day.charAt(1));

        // length
        //charAt
        //concat
        System.out.println("++++++++++++++++++++++");
        // indexOf() --> finds and returns index of given character
        String name = "Alexander";

        name.indexOf('A');
        System.out.println(name.indexOf('A'));

        int indexOfA = name.indexOf('A');
        // find the index of 'a'

        System.out.println(name.indexOf('a'));

        System.out.println(name.indexOf('w'));

        System.out.println(name.indexOf("A"));

        System.out.println(name.indexOf("exan")); // returns first character's index if there is matching sequence

        name = "Alexander";
        System.out.println(name.indexOf('e'));// --> 2

        System.out.println(name.indexOf("er")); //

        int i = name.indexOf('e');
        System.out.println(name.indexOf('e', ++i)); // 7

        // Homework --> "evergreen"

        // toUppercase(), toLowercase()

        name = name.toUpperCase();
        System.out.println(name);

        // alex, ALEX, ALex --> 'A'
        name = name.toLowerCase();
        System.out.println(name);

        String str2 = "sunday "+"abc"+ "morning";

        char symbol = '%';




    }
}
