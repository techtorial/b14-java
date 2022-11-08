package OOP.object;

public class Car {

    String make;
    String color;
    double price;
    int year;

    public Car(){

        System.out.println("No Argument Constructor");

    }
    public Car(String make){
        this.make= make;
        System.out.println("Single Argument Constructor");
    }

    public Car(String make, String color, double price){

        this("Lexus");
        this.make = make;
        this.color=color;
        this.price = price;



    }
    public Car (String make, String color, double price, int year){

        this();// calling no argument constructor
        this.make = make;
        this.color=color;
        this.price = price;
        this.year = year;

        int a = 23;
        int sum = a + 1;
        System.out.println(sum);

    }

}
