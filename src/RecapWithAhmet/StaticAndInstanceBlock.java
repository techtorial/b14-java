package RecapWithAhmet;

public class StaticAndInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is static as a keyword and why do you use it?
      -->Static(as a keyword) is a way to make the methods accessible *****WITHOUT creating an object***
      from that class.
      -->The advantage of having static keyword is that you do not need extra lines of codes for object to
      create.
      -->The disadvantage of having static keyword "YOU CANNOT OVERRIDE THE STATIC METHODS"
      -->The second disadvantage of having static keyword "You cannot call the non-static methods inside
      of static methods".
    2-What is static block?
       -->Is the block that can be called once(ONE TIME IT WORKS)
       -->It always executes FIRST.

    3-What is static variable?
       -->It makes the variables belong to the class
       -->it is sharable(changable/common) -->common for each object
       -->It can be accessed by other classes without creating and object.Just with the name of class

    4-What is instance block?
        -->it is a block that can be called as many as you have objects(create)
     NOTE:If you are making variable or methods static, the suggested usage is calling
     with CLASSNAME.(Computer suggestion as well)
     */
    public static void run(){
        System.out.println("I am running");
}
    public static void main(String[] args) {
   //     StaticExample staticExample=new StaticExample();
//        StaticExample staticExample1=new StaticExample();
//        StaticExample staticExample2=new StaticExample();
//        StaticExample staticExampl3=new StaticExample();
//        StaticExample staticExample4=new StaticExample();



       StaticExample.run();
//        System.out.println(staticExample.name);
//
//        StaticExample.run();
//        System.out.println(StaticExample.name);








    }
}
