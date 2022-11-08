package RecapWithAhmet.OOP;

public class Interitance extends InheritancePractice{
    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-What do you know about inheritance and how do you inherit two classes?
        -->Inheritance is a way to make a connection(relationship) between classes.
        -->We need to use "EXTENDS" keyword to do this connection

     2-Why do you use inheritance in your project ?
        -->We need inheritance because: We would like to have less amount of code
        (reducing the execution time) during execution.(which saves your time)
        -->Reducing amount of Code and execution time(SUMMARY)
        *It will be more safe and efficient to maintain.
     */
    public void setage(){
        super.age=5;
    }
    String hairColor="Brown";
    public static void main(String[] args) {

        Interitance interitance=new Interitance();
        System.out.println(interitance.age=5);
        InheritancePractice inheritancePractice=new InheritancePractice();
      //  inheritancePractice.
    }
}
