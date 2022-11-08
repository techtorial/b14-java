package RecapWithAhmet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRecap {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is the difference between Array and List? //Array and ArrayList

    Array:                                           ArrayList
    -has fixed size                               -is dynamic size
    -has multidimensional form                    -it doesn't
    -store both primitive and Object type         -only Objects
    -Arrays(itself) do not have methods(length)    -It does have methods(add,replace)
    -Synthax is different(String[] name ={"Ahmet"} -Synthax is different(ArrayList<String> list=new ArrayList()
                  (String[] name1=new String[1]    -ArrayList<String> list1=Arrays.asList("Ahmet")
                                                    list.add("Ahmet")

     2-What is the difference between ArrayList And LinkedList?
      ->To be honest I do not use LinkedList in my project but as much as I know there is an execution time
      difference.
     ** -->The reaching out the elements inside of the list is more efficient and faster in ArrayList.
     ** -->When you do any manipulation(changing,replacing...,inserting, removing) at this moment LinkedList will be faster.

       {1,2,4,5,6,7} -->bit shifting
       list.add(3)
     NOTE:COMMON POINTS FOR ARRAYLIST AND LINKEDLIST:
      -->Both of them are indexing
      --?

     */
    public static void main(String[] args) {
        List numbers=new ArrayList<>();
        ArrayList numbers2=new ArrayList();
        List numbers3=new LinkedList();
        LinkedList numbers4=new LinkedList();
        numbers.add(3);
        numbers3.add(3);
        System.out.println(numbers.get(0));
        System.out.println(numbers3.get(0));



    }
}
