package map;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    /*
    create a method to solve;
    String[] arr  = {"blue", "blue", "blue", "red", "white", "white", "black"};
    store array elements in a map as key and their count as value for each key
    make sure method takes String[] as parameter
    it will return the map
     */


    // String[] arr  = {"blue", "blue", "blue", "red", "white", "white", "black"};
    public static Map<String, Integer> counter(String[] array) {

        Map<String, Integer> map = new HashMap<>();

        for (String str : array) {

            if (map.containsKey(str)) {

                map.put(str, map.get(str) + 1);

            } else {

                map.put(str, 1);
            }

        }

        return map;
    }


    public static void main(String[] args) {
        String[] arr = {"blue", "blue", "blue", "red", "white", "white", "black"};

        Map<String, Integer> abc = counter(arr);

        System.out.println(abc);

    }


}
