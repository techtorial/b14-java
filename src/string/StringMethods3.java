package string;

public class StringMethods3 {

    public static void main(String[] args){

        String str = "spain";

        boolean r1 = str.equals("Spain");
        System.out.println(r1);

        System.out.println(  str.equals("SPAIN") ); // false

        String str2 = "SPAIN";

        System.out.println(  str2.toLowerCase().equals(str)   ); //true

        System.out.println(str2.equals(str));// false
        str2.concat("is good to see");
        str.concat("is good to see");

        System.out.println( str.toUpperCase().equals(str2));

        //equalsIgnoreCase(); returns boolean

        System.out.println(  str.equalsIgnoreCase(str2)  );// true

        String str3 = "Spain$";   // SPAIN    spain

        System.out.println( str2.equalsIgnoreCase(str3)); // false

        String name = "david";
        String name1 = "DAVID";
        String name2 = "david";
        String name3 = new String("david");
        System.out.println(name.equalsIgnoreCase(name1)); // if you ignore case of strings,
                                                            // values are same

        System.out.println("+++++++++++++++++++");
        System.out.println( 1 == 1); // true
        System.out.println( name == name1); // false
        System.out.println( name.equals(name1)); // false
        System.out.println(  name.equals(name2)  ); //true

        System.out.println(  name == name2 ); // true
        System.out.println(  name == name3);  //


    }
}
