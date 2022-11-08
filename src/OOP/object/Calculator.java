package OOP.object;

public class Calculator {


    int num1=10, num2=10;

    public void sumCalculator(){

        int sum =  num1+num2;

        System.out.println("The sum is "+sum);

    }

    public int sumCalculator1(){

        int sum =  num1+num2;

        double d = 2.3;

        System.out.println("The sum is "+sum);

        return sum;
    }

    // creating a method that will take parameter/s

    public void total(int number1, int number2){

        int result = number1+number2;

        System.out.println( "The total is "+result);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumCalculator1();
        calculator.sumCalculator();
        calculator.total(1,2);
    }


}
