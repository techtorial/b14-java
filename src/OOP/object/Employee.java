package OOP.object;

public class Employee {

    String name;
    String city = "Chicago";
    int id;

    //constructor with no parameter/argument
    public Employee(){
        System.out.println("No Argument Constructor");
    }

    // constructor to initialize city
    public Employee(String newCity){

        this.city = newCity;
        System.out.println("This is Constructor to Initialize CITY");
    }

    //multiple parameter constructor

    public Employee(String name,String city, int id){

        this.name = name;
        this.city=city;
        this.id = id;

        System.out.println("Three argument Constructor");

    }
public String toString(){

        return "Name is: "+name + " City is: "+ city + " Id: "+id;
}

//method to set value for city
public void setCity(String city1){

        city = city1;
        this.name = "Efe";

}

}
