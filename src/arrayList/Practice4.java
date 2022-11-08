package arrayList;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("pink");

        ArrayList<String> seasons = new ArrayList<>();

        seasons.add("winter");
        seasons.add("fall");
        seasons.add("summer");
        seasons.add("spring");
        System.out.println(colors);

        //addALl();
        colors.addAll(seasons);

        System.out.println(colors);// [red, yellow, red, blue, pink, winter, fall, summer, spring]

        System.out.println(colors.get(5)); //
        System.out.println(colors.get(6)); //
        colors.remove("winter");
        System.out.println(colors + " <<< ");
        System.out.println(seasons);
        // removeAll();
        colors.removeAll(seasons);

        System.out.println(colors);// [red, yellow, red, blue, pink]

        //set()
        colors.set(2,"Orange");
        System.out.println(colors);// [red, yellow, Orange, blue, pink]

        System.out.println("--------------");
        System.out.println(colors.size());
        //isEmpty()

        System.out.println(colors.isEmpty()); // false

        // clear()
        colors.clear();
        System.out.println(colors);

        System.out.println(colors.size());
        System.out.println(colors.isEmpty());//true






    }
}
