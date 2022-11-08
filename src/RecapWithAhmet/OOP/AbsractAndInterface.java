package RecapWithAhmet.OOP;

public class AbsractAndInterface extends AbstractPractice{
    @Override
    public void run() {
        System.out.println("Dismiss time for Ahmet's class");
    }
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is abstract? and can you clarify it with little-bit details?
        *Abstract is a way to organize the methods with only necessary information.It means
        people can see the template of the methods and override this based on their requirement.
        ****WE do not have a body for abstract methods because every class which extends to the
        abstract class can MAKE THEIR OWN IMPLEMENTATION by overriding.
    2-Why do you need to have abstract class in your project?
      *For many methods,we need developers to make their own implementation in the company.
      So they can create abstract class with the TEMPLATEof the specific methods and let people
      call it based on their requirement(override and do implementation)
    3-Where do you use abstract class in your project?
       I would definitely say that I use GENERAL OOP concept in  everywhere of my project.
    4-Can you create an object from abstract class?If no,how are you going to access all of the
    methods and variables from that class?
    No,You cannot create an object from abstract class.I WILL EXTEND THE CLASS AND OVERRIDE THE METHODS
    (INHERITANCE)
    5-Can you have normal and abstract method inside-of abstract class?
    YES you can have both under abstract class

    POSSIBLE INTERVIEW QUESTIONS:

    1-What is Interface?
      -->Interface is a blueprint of the object like class which has special methods that can
      be overridden to make new implementation.
      -->We use "IMPLEMENTS" key word to make the class connected with INTERFACE.

    2-Why do you need interface if you have abstract?
     ***BECAUSE INTERFACE HAVE MORE FEATURES IN TERMS OF ACCESSING THE MULTIPLE PARENTS AT THE SAME
     TIME BY OVERRIDING THE METHODS.

    3-What is the difference between abstract and interface? ********THE MOST COMMON QUESTION******

      INTERFACE:
       1-Interface  is declared with "INTERFACE" keyword
       2-Interface can have only public abstract methods.(*Show off -->default keyword-->create regular method)
       3-To make a connection with interface, we need to use "IMPLEMENTS" keyword
    ***4-In interface you can implement the class as many as you want(multiparents) and extends keyword(should come first)
      -->it means one class can implement multiple interface(parents)
       5-When you initiliaze a variable in interface as default it is final static
       6-Methods must be public abstract
       7-Interface cannot have CONSTRUCTOR

       ABSTRACT:
       1-Abstract class is declared with "ABSTRACT" keyword
       2-Abstract may or may not have regular methods as well.
       3-To make a connection with Abstract class, we need to use "EXTENDS" keyword
 ****  4-In abstract you can extend the class ONCE.(one extension from the class to the abstract)
       5-When you declare a variable in abstract there is no default key word.
       6-You can have any access modifiers for the methods.
       7-Abstract can have constructor.



     */
}
