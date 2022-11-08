package OOP.Inheritance2Task;

public class Vehicle {

    protected String model;
    int year;
    public String brand;

    public void drive() {

        System.out.println("Vehicle is moving");
    }

    public boolean stop() {

        System.out.println("Vehicle stops");
        return true;
    }

    protected boolean start() {
        System.out.println("Vehicle is starting");
        return true;
    }

    Object accelerate() {
        System.out.println("From Vehicle class");
        return new Vehicle("corolla",2022,"Toyota");
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}






