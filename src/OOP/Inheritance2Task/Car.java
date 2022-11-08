package OOP.Inheritance2Task;

public class Car extends Vehicle {


    String model;
    String engineType;

    public Car(String model, int year, String brand) {
        super(model, year, brand);

    }

    @Override
    public void drive() {
        System.out.println("Car is driven");
    }

    @Override
    Integer accelerate() {
        System.out.println(

                super.model
        );
        return 20;
    }

    public static void main(String[] args) {
        Car car = new Car("S", 2023, "Tesla");


        Integer number = car.accelerate();

        System.out.println(number);

        Vehicle v = new Vehicle("Y", 2023, "Tesla");
        Vehicle v2 = (Vehicle) v.accelerate();

        System.out.println(v2.start());
        System.out.println(v2.model);
    }
}
