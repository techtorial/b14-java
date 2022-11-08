package OOP.object;

public class OverloadingPractice {
    // create a method that will add two integer numbers, void return type
    public void sum(int num1,int num2){
        System.out.println("the sum of two numbers is: "+ (num1+num2));
    }
// create a method that will add three integer numbers, void return type
    public void sum(int num1, int num2, int num3){

        System.out.println("the sum of three numbers is: "+ (num1+num2+num3));

    }
    // create a method
    // this method will decide either add or subtract given two numbers ,
    // void return type

    public void sum(String str, int num1, int num2){

        if (str.equalsIgnoreCase("Add")){

            System.out.println( "The sum is: "+(num1+num2));
        }else if(str.equalsIgnoreCase("subtract")){
            System.out.println("The difference is: "+(num1 - num2));
        }else {
            System.out.println("no matching operation");
        }
    }

}
