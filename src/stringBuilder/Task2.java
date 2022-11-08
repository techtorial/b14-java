package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*
    create a method
    pass parameter as StringBuilder Array
    the method will replace middle char of object with $, if the object have odd length
    return list of those elements(revised)
    {"monday","tue$day", "Friday"}
     */

    public static List<StringBuilder> replaceMidChar(StringBuilder[] builders) {
        List<StringBuilder> list = new ArrayList<>();
        for (StringBuilder builder : builders) {

            if (builder.length() % 2 != 0) {
                list.add(builder.replace((builder.length() -1) / 2, (builder.length() - 1) / 2 + 1, "$"));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        StringBuilder[] brands = new StringBuilder[3];
        StringBuilder b1 = new StringBuilder("Monday");
        StringBuilder b2 = new StringBuilder("Tuesday");
        StringBuilder b3 = new StringBuilder("Friday");
        brands[0] = b1;
        brands[1] = b2;
        brands[2] = b3;

        System.out.println(replaceMidChar(brands));

    }

}
