package OOP.finalPractice;

public class Shirt {


    String color;
    final double PRICE = 29.99;
    String brand;
    String size;

    public double getPrice() {
        return PRICE;
    }

    public String getBrand() {
        return brand;
    }

   final public void wash() {
        System.out.println("cleaning");
    }

    // overloading final method
    final public  void wash(int lbs) {
        System.out.println("cleaning");
    }


}
