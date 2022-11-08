package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    String color, type, size; double price;

    public Flower(String color, String type, String size, double price) {
        this.color = color;
        this.type = type;
        this.price = price;
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")||
        size.equalsIgnoreCase("large")){
            this.size = size;
        }else {
            this.size = "small";
        }
    }

    public static void findCheapestFlower(List<Flower> listOfFlowers){

        double cheapest = listOfFlowers.get(0).price;

        for ( Flower flower  : listOfFlowers){

            if ( flower.price < cheapest){
                cheapest = flower.price;
            }
        }
        for (Flower flower : listOfFlowers){

            if (cheapest == flower.price){

                System.out.println(flower.type);
                System.out.println(flower);
            }
        }



    }


    @Override
    public String toString() {
        return "Flower{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Flower f1 = new Flower("Red","Rose","medium",3.99);
        Flower f2 = new Flower("Yellow","Violet","medium",.99);
        Flower f3 = new Flower("White","daisy","Large",6.99);
        Flower f4 = new Flower("Red","Lily","medium",2.99);

        List<Flower> list = new ArrayList<>();

        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);

        System.out.println(list);
        Flower.findCheapestFlower(list);

    }
}
