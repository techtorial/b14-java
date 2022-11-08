package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] fruits = {"apple", "cherry", "orange", "dragon fruit"};

        List<String> fruitList = Arrays.asList(fruits);

        System.out.println(fruitList);
        // you cannot add or remove element from the list that you converted from ARRAY
        // fruitList.add("Watermelon"); // UnsupportedOperationException
        System.out.println(fruitList);

        //  fruitList.remove("apple"); // UnsupportedOperationException
        System.out.println(fruitList);

        fruitList.set(0, "KIWI");
        System.out.println(fruitList);

    }
}
