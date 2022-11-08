package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ComputerTest {

    public static void main(String[] args) {

        Computer c1 = new Computer("Apple","Pro","Gray",1500, 13.5);
        Computer c2 = new Computer("Apple","Air","White",1100, 11);
        Computer c3 = new Computer("HP","Envy","Light Gray",999, 16);
        Computer c4 = new Computer("Lenovo","ThinkPad","Black",800, 17.5);

        System.out.println( c4.price   );
        System.out.println( c2.color   );

        ArrayList<Computer> computers = new ArrayList();

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);
        System.out.println(computers);

        double totalPrice=0;
        for (int i = 0; i< computers.size(); i++){

          totalPrice = totalPrice +  computers.get(i).price;
        }

        System.out.println("The worth of all computers is: $"+ totalPrice);

         Double total =  Computer.totalPriceCalculator( computers );

        System.out.println(total);

        Computer.hpPriceFinder( computers);
    }


}
