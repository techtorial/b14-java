package OOP.Encapsulation;

public class City {

    private String name;
    private int population=90;
    private double area;


    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {

        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
