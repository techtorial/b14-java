package OOP.object;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari","Yellow",1000, 2020);



        Car car3 = new Car("XYZ");

        Car car2 = new Car("Honda","Blue",2002);

        System.out.println("-------------");
        System.out.println(car3.make);

    }
}
