package stringBuilder;

public class Practice3 {

    // Reverse String
    // create a method that will take a string and return reversed version

    public static String stringReverser(String word){

        String reversed = "";
        for (int  index = word.length()-1; index >=0 ; index-- ){

            reversed += word.charAt(index);
        }
        return reversed;
    }

    public static void main(String[] args) {

        System.out.println(   stringReverser("Interview") );


        //reverse()
        StringBuilder builder = new StringBuilder("Interview");

        System.out.println(   builder.reverse()   );

       // String str = builder; will not compile

        String str = builder.toString();

        StringBuilder sName=new StringBuilder();
        StringBuilder sName1=new StringBuilder();
        StringBuilder sName2 = sName.append("Techtorial");

        System.out.println(sName==sName1);

        System.out.println(sName.equals(sName1) );

        System.out.println("comparing"+ (sName==sName2));

        // builder --> weivretnI
        //replace()
        builder.replace(0, builder.length(), "$$$");

     //   System.out.println(builder.charAt(5));  StringIndexOutOfBoundsException
        System.out.println(builder);

        builder.replace(1,2,"***");
        System.out.println(builder);

        System.out.println(  builder.charAt(1)   );

        builder.append("vacation").replace(5, 7,"---").append(" is coming").reverse();
        System.out.println(builder.reverse());

    }
}
