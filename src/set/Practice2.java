package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {
        /*
        HashSet --no order, yes for null
        LinkedHashSet - insertion order, yes for null
        TreeSet - ascending order, no for null
         */
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashSet.add("David");      linkedHashSet.add("David");    treeSet.add("David");
        hashSet.add("Alex");       linkedHashSet.add("Alex");     treeSet.add("Alex");
        hashSet.add("Nuradil");    linkedHashSet.add("Nuradil");  treeSet.add("Nuradil");
        hashSet.add("John");       linkedHashSet.add("John");     treeSet.add("John");
        hashSet.add("Aizat");      linkedHashSet.add("Aizat");    treeSet.add("Aizat");
        hashSet.add(null);         linkedHashSet.add(null);        // treeSet.add(null);
        // NullPointerExceptionSystem.out.println(hashSet);
        System.out.println(hashSet); System.out.println(linkedHashSet);  System.out.println(treeSet);
        //[Nuradil, Aizat, Alex, David, John]-[David, Alex, Nuradil, John, Aizat] - [Aizat, Alex, David, John, Nuradil]

        //first()
        String name1 = treeSet.first();
        System.out.println(name1);

        //last()
        System.out.println(treeSet.last());

        //pollFirst(); finds first element and removes from the treeset - it also returns that element
        treeSet.pollFirst();
        System.out.println(treeSet);

        //pollLast() finds last element and removes from the treeset - it also returns that element
        String str2 = treeSet.pollLast();
        System.out.println(treeSet);
        System.out.println(str2);

        System.out.println(treeSet.descendingSet());

        NavigableSet<String> reversedSet = treeSet.descendingSet();
        System.out.println(reversedSet);

        // 1,2,3,4,5   --> 5,4,3,2,1




    }
}
