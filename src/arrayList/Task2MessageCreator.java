package arrayList;

import java.util.ArrayList;

public class Task2MessageCreator {

    /*
     create method that will take an arraylist as a parameter --> arraylist should contain String elements
 this method will create message for given last names as:

  "MR/S. .... you are welcome to LIST usage!"
     */

    public static void messageCreator(ArrayList<String> names){

        for (String name: names){

            System.out.println("MR/S. "+ name +" you are welcome to LIST usage!");
        }

    }

    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<>();
        abc.add("Smith");
        abc.add("Brown");

        messageCreator(abc);
    }

}
