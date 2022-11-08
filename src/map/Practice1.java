package map;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

    public static void main(String[] args) {

        HashMap <String, String> map = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();

        map.put("Name", "Baran");
        map.put("LastName", "Smith");
        map.put("City", "Chicago");

        System.out.println(map);

        //get();
        System.out.println(    map.get("Name")  );

        String valueForName = map.get("Name");
        System.out.println(valueForName);

       // System.out.println(  map.get("Chicago")  );

        // same key, different value
        map.put("Name","David");

        System.out.println(map);

        //different key, same value
        map.put("Has Pet", "David");
        System.out.println(map);

        // null key --> only one null key is allowed!!!
        map.put(null, "Something");
        System.out.println(map);

        // null value --> multiple null values are okay
        map.put("state", null);
        System.out.println(map);

        map.put("Phone", null);
        System.out.println(map);

    }
}
