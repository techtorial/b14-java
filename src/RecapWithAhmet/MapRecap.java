package RecapWithAhmet;

import java.util.HashMap;
import java.util.Map;

public class MapRecap {
    /* //3 idiots -->good movie
    POSSIBLE INTERVIEW QUESTIONS:
    1-Can you tell me about map and why do you use map in your project?
        *Map is an awesome interface to be used in my project to share/store my data
        as KEY AND VALUE

    2-What is the connection between Map and Collection?
      ->They are all useful that I use in my project for different purposes.
      As I mentioned before set is all about uniqueness
                            list is all about duplication if you need it
                            map is all about key-value pair.
      ->SHOW OFF NOTES:Map is the combination of collections.
      As you know key part of the map must be unique which refers to "SET"
                  value part of the map might be duplicated which refers to "LIST"

    3-What is the type of map and difference between them?
        ->HashMap()->random order
        ->LinkedHashMap() -->insertion order
        ->TreeMap()  -->ascending order

    4-What is synchronization ? can you give examples and what do you know about
    synchronization usage in Java?
      -->it executes any actions one by one(First come first serve)(one after another)
      -->As you know We have two most common concept in java-->HashTable -->StringBuffer
   ***-->Synchronized system is ****THREAD-SAFE**** and ******SLOW********
      -->Non-Synchronized system is *****NOT THREAD-SAFE****and ****FASTER**********
      -->The example of non-synchronized --->MAP, STRINGBUILDER,SET,LIST

       String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
       TASK:I want you get the outpu of totall item for each:
       -->Apple=3,Banana=2,Orange=2,Strawberry=1,Cherry=1
       TIPS:You can use a method(map) containsKey
       TIPS:If condition

        -->In this question you are asking me to get the elements from map and also
          provide how many of them I have in a key and value format right?
        -->First of all,I would use map because I see you want the answer as key and value
        -->To be able to access each of the element, I will use loops to iterate them
        -->Then I am going to use if statement for the specific condition
        -->I believe it will solve the task in here
     */
    public static void main(String[] args) {
        String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
        Map<String,Integer> counts=new HashMap<>();
        for(String fruit:fruits){
            if(!counts.containsKey(fruit)){//
                counts.put(fruit,1);
            }else{
                counts.put(fruit,counts.get(fruit)+1);
            }
        }
        System.out.println(counts);
    }
}
