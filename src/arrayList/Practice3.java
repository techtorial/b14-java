package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {

        List<String> drinks = new ArrayList();

        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Water");
        drinks.add("Coke");
        drinks.add("Milk");
        drinks.add("Smoothie");
        drinks.add("Smoothie");
        drinks.add("Hot Chocolate");
        drinks.add("Smoothie");
        drinks.add("Smoothie");

        System.out.println(drinks);// [Tea, Coffee, Water, Coke, Milk, Smoothie, Hot Chocolate, Smoothie]
        System.out.println(drinks.size());
        // remove()
        drinks.remove("Smoothie");
        System.out.println(drinks);
        System.out.println(drinks.size());

        // remove all(Smoothie) items from the list

//        for (int i=0; i< drinks.size(); i++){
//
//            if (drinks.get(i).equals("Smoothie")){
//
//                drinks.remove(i);
//               i--;
//            }
//        }
        System.out.println(drinks);
        for (int i=0; i< drinks.size(); i++){

                drinks.remove("Smoothie");

        }
        System.out.println("-- "+drinks);

    }
}
