package OOP.inheritance;

public class Animal {

    String color;
    int age;
    String name = "FLUFFY";


    public void eat(){

        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public Number energyAmount(int foodAmount){

        System.out.println(name+ " Energy is"+foodAmount * 100);
        return foodAmount * 100;

    }



}
