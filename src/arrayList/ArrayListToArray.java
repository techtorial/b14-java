package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {


    public static void main(String[] args) {


        ArrayList<String>  cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Columbus");
        cities.add("Springfield");

        System.out.println(cities);

        Object[]   cityArray =   cities.toArray();

        System.out.println(Arrays.toString(cityArray));

        cityArray[0] = "LA";
        System.out.println(Arrays.toString(cityArray));

        System.out.println(cityArray.length);

        cities.add("Denver");

        System.out.println(cities);
        System.out.println(cities.size());

    }

}
