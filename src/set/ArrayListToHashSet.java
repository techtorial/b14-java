package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListToHashSet {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(57);
        list.add(23);
        list.add(10);
        list.add(5);
        list.add(6);
        System.out.println(list);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

        set.add(66);
        System.out.println(set);
        set.add(66);
        System.out.println(set);

        // write a java code to show/find/figure out duplicate elements in the arrayList by using set
        // store repeating elements in to another List

        List<Integer> duplicateElements = new ArrayList<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (Integer number : list){

          //  set2.add(number);
            if (!set2.add(number)){
                System.out.println(number);
                System.out.println("I am not adding this element. It is already in the set: "+ number);
                duplicateElements.add(number);

            }else {
                System.out.println("I am adding this element: "+number);
            }

        }
        System.out.println(set2);
        System.out.println(list);

        System.out.println(duplicateElements);




    }
}
