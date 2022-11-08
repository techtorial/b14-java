package map;

import java.util.HashMap;

public class Task1 {

    public static void main(String[] args) {


        String test =  "I am Happyyyy";

        test = test.replace(" ", "");

        HashMap< Character, Integer >  map = new HashMap<>();

        System.out.println( map.hashCode());

        for (int i=0; i< test.length(); i++){


            if (map.containsKey(test.charAt(i))){

              int number =   map.get(test.charAt(i));

              map.put(test.charAt(i), number+1);
            }else {

                map.put(test.charAt(i), 1);
            }

        }
        System.out.println(map);

        map.put('X', 1);

        System.out.println( map.hashCode());

    }
}
