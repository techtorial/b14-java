package OOP.object;

public class Phone {

    String brand;
    String IMENumber;


    public Phone() {
        this("X","Y" );
        System.out.println("No Argument");
    }

    public Phone(String brand) {
        this();
        this.brand = brand;

    }

    public Phone(String brand, String IMENumber) {
        this.brand = brand;
        this.IMENumber = IMENumber;
        System.out.println("Two Parameter");
    }

    public String toString() {
        return "Phone brand is " + brand;
    }


}
