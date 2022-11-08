package map;

import java.util.*;


public class Practice3 {

    public static void main(String[] args) {

        HashMap<Integer, String> studentInfo = new HashMap<Integer, String>();

        studentInfo.put(501, "Adilet");
        studentInfo.put(503, "Alex");
        studentInfo.put(609, "Mary");
        studentInfo.put(895, "Aizat");
        studentInfo.put(111, "Asel");

        //replace();
        studentInfo.replace(501, "Kuba");
        System.out.println(studentInfo);

        studentInfo.replace(501, "Kuba", "good for you");
        System.out.println(studentInfo);

        //containsKey()

        boolean b1 = studentInfo.containsKey("501"); // ??  parse the string
        System.out.println(b1);

        boolean b2 = studentInfo.containsKey(501);// true
        System.out.println(b2);
// parse "501" string value to Integer, so it will be used as Integer, than you can call containsKey() method to get 'TRUE'
        System.out.println(    studentInfo.containsKey(    Integer.parseInt("501")     )    );// TRUE

        System.out.println("------------------");
        //containsValue()
        System.out.println(   studentInfo.containsValue("good for you")    );; // true
        System.out.println(    studentInfo.containsValue("abc")); // False

        // values() -- returns all values as Collection
        System.out.println(studentInfo.values());

       Collection valuesFromStudentMap =  studentInfo.values();

       // print values one at a time from above collection
        for (Object value :valuesFromStudentMap){

            System.out.println(value.toString().toUpperCase());
        }

        printValues(   studentInfo    );

        // size()
        System.out.println( studentInfo.size());
        // isEmpty()

        System.out.println( studentInfo.isEmpty());

        // clear()
       // studentInfo.clear();
        System.out.println( studentInfo.isEmpty());

        System.out.println("**************");
        // entrySet()  IT WILL RETURN ALL THE KEYS AND VALUES

        System.out.println(     studentInfo.entrySet() );
        System.out.println(       studentInfo    );

        Set<Map.Entry<Integer, String>> pairs = studentInfo.entrySet();
        for (Map.Entry<Integer, String>   pair : pairs){

            System.out.println(pair);

        }




    }

    // create a method that will take a HashMap as a parameter, it will print values one by one, by using 'values' method call

    public static void printValues (HashMap<Integer, String> map){

        for (String value :   map.values()  ){

            System.out.println(value.concat(" from method call"));
        }
    }
}
