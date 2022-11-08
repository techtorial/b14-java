package OOP.inheritance;

public class DomesticAnimal extends Animal{


    void play(){

        System.out.println("Domestic Animal is playing");
    }

    public Integer energyAmount(int foodAmount){

        System.out.println(name + " energy is "+ (foodAmount * 200));
        return foodAmount * 200;
    }


    public DomesticAnimal test1(){
        System.out.println("This is Tes1 method");
        return new DomesticAnimal();
    }

}
