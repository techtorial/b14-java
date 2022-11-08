package set;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    /*
    Character[] array = {'a', 'R', 'e', 'u', 'r', 'e', 'a', 'd', 'y'};

        create a method that will take given Character array as parameter
        -this method will store elements to a set collection
        -this method should return the set with all unique elements
     */


    public static HashSet<Character> convertToSet(Character[] array) {

        HashSet<Character> set = new HashSet<>();
        for (Character ch : array) {

            set.add(ch);
        }
        return set;
    }

    public static void main(String[] args) {


        Character[] array = {'a', 'R', 'e', 'u', 'r', 'e', 'a', 'd', 'y'};

        System.out.println(convertToSet(array));

        Set<Character> abc = convertToSet(array);


    }
}
