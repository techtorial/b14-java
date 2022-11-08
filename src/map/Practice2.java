package map;

import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<Integer, String> studentInfo = new HashMap<Integer, String>();

        studentInfo.put(501, "Adilet");
        studentInfo.get(501);
        studentInfo.put(503, "Alex");
        studentInfo.put(609, "Mary");
        studentInfo.put(895, "Aizat");
        studentInfo.put(111, "Asel");

        System.out.println(studentInfo);
        System.out.println(studentInfo.get(609)); // Mary

        //remove()
        studentInfo.remove(111);

        System.out.println(studentInfo);

        studentInfo.remove(609, "vary");// if value does not match, it will not remove it
        System.out.println(studentInfo);
        studentInfo.remove(609, "Mary");// key and value is matching, it will remove it
        System.out.println(studentInfo); // {501=Adilet, 503=Alex, 895=Aizat}

        //keyset() -- returns all keys as a Set from the map

        System.out.println(studentInfo.keySet());

        Set<Integer> keys = studentInfo.keySet();

        System.out.println(keys);

        printingValues(studentInfo);

    }
    // create a method that will take a HashMap as a parameter, it will print values one by one, by using 'keyset()' method call

    public static void printingValues(HashMap<Integer, String> map) {

        Set<Integer> keys = map.keySet();// [501, 503, 895]
        int i = 1;
        for (Integer key : keys) {
            // "1. values is .. Adilet"
            // "2. values is .. Alex "

            System.out.println(i + ". value is: " + map.get(key));
            i++;
        }

    }

    public static void printingValues1(HashMap<Integer, String> map) {

        Set keys = map.keySet();// [501, 503, 895]
        int i = 1;
        for (Object key : keys) {
            // "1. values is .. Adilet"
            // "2. values is .. Alex "

            System.out.println(i + ". value is: " + map.get(key));
            i++;
        }

    }

}
