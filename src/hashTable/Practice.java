package hashTable;

import java.util.Hashtable;

public class Practice {

    public static void main(String[] args) {


        Hashtable<String, Integer>  table  = new Hashtable();
        table.put("IT", 505);
        table.put("HR", 609);
        table.put("Help", 101);

        System.out.println(table);

        System.out.println( table.get("HR")); // 609

      //  table.put(null, 999); cannot have null key

     //   table.put("Accounting", null);  cannot have null values
        System.out.println(table);

        System.out.println(  table.entrySet());


    }
}
