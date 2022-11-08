package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice4 {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        TreeMap<String, Integer> map3 = new TreeMap<>();


        map1.put("IL",2);               map2.put("IL",2);                       map3.put("IL",2);
        map1.put("OH", 5);              map2.put("OH", 5);                      map3.put("OH", 5);
        map1.put("WI", 6);              map2.put("WI", 6);                      map3.put("WI", 6);
        map1.put("IN", 1);              map2.put("IN", 1);                      map3.put("IN", 1);
        System.out.println(map1);     System.out.println(map2);                System.out.println(map3);

        // null keys
        map1.put(null, 55);             map2.put(null, 55);                   //  map3.put(null, 55);
        System.out.println(map1);     System.out.println(map2);                System.out.println(map3);

        //null values
        map1.put("FL", null);             map2.put("FL", null);                     map3.put("FL", null);
        map1.put("WA", null);             map2.put("WA", null);                     map3.put("WA", null);
        System.out.println(map1);
        System.out.println("--------");
        System.out.println(map2);
        System.out.println("+++++++++++++");
        System.out.println(map3);


    }
}
