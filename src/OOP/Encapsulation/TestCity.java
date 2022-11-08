package OOP.Encapsulation;

public class TestCity {


    public static void main(String[] args) {
        City city = new City();
        System.out.println(city.getPopulation());//90

        city.setPopulation(70854);

        System.out.println(city.getPopulation());

        int pop = city.getPopulation();


    }
}
