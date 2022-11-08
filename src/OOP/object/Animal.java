package OOP.object;

import java.util.Arrays;

public class Animal {


    // instance variables
    String name = "King";
    int age;
    String color;
    String gender;
    String[] toys = {"ball", "bone","string"};

    int energy = 100;

    public void sleep(){
        energy = 100;
        System.out.println(name + " is sleeping");
        System.out.println("After sleeping energy is full: "+energy);

    }


    // create one speak method and print out "animal is speaking"
    // call this method with a bird Animal

    public void speak(){

       energy =  energy - 10;
        System.out.println(name + " is speaking");
        System.out.println("After speaking the energy is now: "+energy);

    }



}
