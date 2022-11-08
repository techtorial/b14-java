package arrayList;

import java.util.ArrayList;

public class Computer {


    //brand, model, price, color, screenSize
    String brand, model, color;
    double price, screenSize;

    public Computer(String brand, String model, String color, double price, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }

    // create a method that will find total prices of the computers and returns it
    public static double totalPriceCalculator(ArrayList<Computer> computers){

        double totalPrice=0;
        for (int i = 0; i< computers.size(); i++){

            totalPrice = totalPrice +  computers.get(i).price;
        }
        return totalPrice;

    }

    // create a method that will show only price of HP computers from the list of Computers

    public static void hpPriceFinder(ArrayList<Computer> computers){

        for ( Computer  device  : computers ){

            if ( device.brand.equalsIgnoreCase("HP")) {

                System.out.println("Our hp computer price is: "+ device.price);
            }
        }
    }

}
