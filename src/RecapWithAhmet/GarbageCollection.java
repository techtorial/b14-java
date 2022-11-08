package RecapWithAhmet;

import RecapWithAhmet.EmployeeProject.Employee;

public class GarbageCollection {


    /*(OCA) -->Java cerfication
        POSSIBLE INTERVIEW QUESTIONS:

        1-What is garbage collector and where is it coming from ?
          -->It is a way of cleaning unused or useless data in the class from memory.
          -->It is coming from System

        2-How can you prove that gc is working ?
        *To be able to prove you can OVERRIDE the finalize method.

        3-How can you make the element garbage?
        -->You can assign the value as null
        -->You can assign the reference of the element to the other element

        4-Do you have to call gc to clean up your codes?(memory)
        -->No because it is working automatically.

         */

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is working");
    }

    public static void main(String[] args) {
        Employee ahmet=new Employee();
        ahmet=null;

        System.gc();
    }
}
