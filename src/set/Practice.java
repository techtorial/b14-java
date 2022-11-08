package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Practice {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        HashSet<String> set2 = new HashSet();
        HashSet<String> set3 = new HashSet<>();

        Set set4 = new HashSet();
        Set<String> set5 = new HashSet();

        set2.add("baseball");
        set2.add("soccer");
        set2.add("tennis");
        set2.add("table tennis");

        System.out.println(set2);// [soccer, baseball, table tennis, tennis]

        boolean b1 = set2.contains("tennis");

        for (String sport : set2) {

            // System.out.println(sport);

            if (sport.equals("tennis")) {
                System.out.println("you need a :) ");
                System.out.println(sport.toUpperCase());
            }
        }
        System.out.println("==========");
        if (set2.contains("tennis")) {
            System.out.println("you need a :) ");
        }
        System.out.println("==========");

        set2.add("baseball");
        set2.add("baseBALL");

        System.out.println(set2);
        set2.add("basketball");

        //size() returns size/number of objects from the set
        System.out.println(set2.size());
        System.out.println(set2);// [soccer, basketball, baseball, table tennis, baseBALL, tennis]

        // remove();
        set2.remove("baseBALL");
        System.out.println(set2); //[soccer, basketball, baseball, table tennis, tennis]

        System.out.println("*****************");
        // remove the sport if it has word 'ball' inside
        System.out.println(set2);
//        for (String sport : set2){
//
//            if (sport.contains("ball")){
//                set2.remove(sport);
//               // break;
//
//            }
//        }
        System.out.println(set2);

        set2.removeIf(spt -> spt.contains("ball"));

        System.out.println(set2);

        Iterator<String> iterator = set2.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }
        System.out.println(set2);
    }
}
