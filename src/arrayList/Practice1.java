package arrayList;

import java.util.ArrayList;

public class Practice1 {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        ArrayList<Integer> list2 = new ArrayList();

        ArrayList<String> list3 = new ArrayList<String>();

        System.out.println(list2);

        list2.add(10);

        System.out.println(list2);
        list2.add(20);
        list2.add(2);
        list2.add(23);
        list2.add(7);
        System.out.println(list2);

        list2.add(0,99);
        System.out.println(list2);
        list2.add(1,88);
        System.out.println(list2);





    }
}
