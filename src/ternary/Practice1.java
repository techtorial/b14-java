package ternary;

public class Practice1 {

    public static void main(String[] args) {

        int num1 = 4, num2 = 10;

        String str1 = num2 > num1 ? "This is first side" : "Second side ";

        System.out.println(num2 > num1 ? "This is first side" : "Second side ");

        System.out.println(str1);

        System.out.println(str1.equals(num2 > num1 ? "This is first side" : "Second side "));

        System.out.println("java".equals("selenium") ? num2 + num1 : num2 - num1);

        int d1 = "java".equals("selenium") ? num2 + num1 : num2 - num1;

        System.out.println(d1);

        boolean b1 = str1.equals(num2 > num1 ? "This is first side" : "Second side ");

        //========================

        String str2 = 7 < 4 ? "Correct" : "NOT";

        System.out.println(str2);

        String str3 = "Yes";

        boolean b2 = str2.equals(str3);

        boolean b3 = str2.equals(7 < 4 ? "Correct" : "NOT"); // true

        //============================

        int r3 = 't' == 'T' ? 5 + 7 : 7 - 5;

        System.out.println(r3);

        boolean r4 = "text" == "word" ? true : false;

        System.out.println(r4);
        //============================


     // String i =   "text".equalsIgnoreCase("t")   ?     "t"  :   25 ;  compile time error

        System.out.println(   "text".equalsIgnoreCase("t")   ?     "t"  :   25  );

      //   String r5 = "text".equalsIgnoreCase("t")   ?     "t"  :   'r'; //  compile time error

        System.out.println(  "text".equalsIgnoreCase("t")   ?     "t"  :   'r'  );

       // if( 'r'== 'r')

        if ( "r" == ("text".equalsIgnoreCase("text")   ?     "t"  :   "r")){

            System.out.println("Got it!");
        }


        if (8 > (4 >3 ? 5 : 4 )){

            System.out.println("Example");
        }


    }
}
