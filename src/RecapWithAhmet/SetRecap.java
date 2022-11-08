package RecapWithAhmet;

import java.util.*;

public class SetRecap {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
      1-How can you make the element unique with collection?(American Style)
      1-What is set ? what is the purpose of using it?(Indian Style)
        *In my project,i was using set to make the elements unique to prevent
        duplication which causes some problems later on.
        -->It is a way to store the unique elements only.

      2-Can you tell me the types of collections?
        ->List  --> ArrayList, LinkedList
        ->Set   -->HashSet,LinkedHashSet,TreeSet
        -->Queue-->We didn't use this type in my project, so I am not familiar with it
                 -->I am a quick learner, I can learn really fast.

      3-Can you explain the difference between SET AND LIST?
          SET:                                                         LIST:
      -Only unique elements(no duplication)                             -->I can store duplicates elements as well
      -It doesn't have indexing(You can access the data with Loops)     -->It has indexing
      -Synthax is different(Set set=new HashSet()                       -->Synthax is different(List list=new ArrayList()
      NOTE:Collections are the way of storing the objects with a different functions.
      It means it is a kind of storage and has functionality(methods) to manipulate data.
        -->We have three types of collections -->List,Set and Queue.

       4-What is the difference between Set Types?
        -->HashSet()-->It stores the element without any orders(random)
        -->LinkHashSet()-->It stores the element with insertion order(how you put it in the code the order)
    *   -->TreeSet()-->It stores the element ascending order

    NOTE:Whenever you need to reach out the elements from list, you can simply use get method
        :Whenevery you need to reach out the elements from set, you need to iterate(loop) then if you need a specific one
        then use also If condition.
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        Set<Integer> set=new HashSet();
        Set<Integer> set2=new LinkedHashSet<>();
         set.add(1);
        set.add(2);
        set.add(3);

        for(Integer number:set){
            if(number.equals(2)){
                System.out.println("number");
            }
        }
        for(Integer number2:list){
            if(number2==2){
                System.out.println("number2");
            }
        }


    }
}
