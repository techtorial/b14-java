package RecapWithAhmet;

import java.lang.reflect.Array;

public class ObjectAndMethods {
    /*
    1-What is object?and tell me about its methods?
        ->Object is a representation of the class(blueprint)-->DNA,Car,Batch example
        ->there are many methods of object but I am familiar with these:
          -->.equals()-->which is comparison of object
          -->.toString()->it turns the variable to the String(kind of convertion)(Arrays.toString)[]
          -->Hashcode()->location of the object
    2-What is the difference between object and class?
     Class: is a blueprint/template which you can create as many as you like
     Object:is a representation/member of a class -> instance of a class (INSTANCE=OBJECT)
     Class:One class i can have for one scenario(BMWcar, DNA)
     Object:Can be created as many as from the class
     Class:declared with class keyword;
     Object:declared with new keyword

    3-How do you initiliaze the instance variables?

     *There are different ways to initiliaze variables mostly I use:
      ***** ->Constructor
            ->Methods(setter)
            ->Create an object then initiliaze
            ->Directly initiliaze from instance variable

    4-What is the difference between instance and local variables ?
        Instance Variables:                             Local Variables:
       -Belong to the class                             -Belong to the blocks
       -as default null,0,0.0 (it has default values)   -No default values.They must be initiliazed(compile)
       -Has Access modifiers(private,public,default..)
         -It doesn't have access modifiers






     */
    public static void main(String[] args) {
        String name="Ahmet";
        String name1="Mehmet";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name.equals(name1));
        System.out.println(name.toString());
        Integer number=1;
        System.out.println(number.toString());
    }
}
