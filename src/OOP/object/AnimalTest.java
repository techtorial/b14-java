package OOP.object;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {


        // creating animal object
        Animal cat = new Animal();

        System.out.println(cat);
        cat.color = "white";
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);

        cat.age = 3;
        System.out.println(cat.age);
        cat.age = 13;
        System.out.println(cat.age);
        cat.color = "Orange";
        System.out.println(cat.color);

        // create one object and name it as dog
        // initialize all instance variables for the new object
        // print all of those instance variables for the new object

        System.out.println("+=============+");
        Animal dog = new Animal();

        System.out.println(dog.name); // King
        System.out.println(dog.age); // 0
        System.out.println(dog.color); // null
        dog.name = "Basic";
        dog.age = 5;
        dog.color = "brown";
        System.out.println(dog.name); // Basic
        System.out.println(dog.age); // 5
        System.out.println(dog.color); //  brown

        System.out.println(cat.color); // orange

        System.out.println( dog.gender = "Male");
        System.out.println(dog.gender);

        System.out.println( cat.gender);

        System.out.println(cat.toys[0]); //ball
        cat.toys[0] = "yarn ball";
        System.out.println(cat.toys[0]); // yarn ball

        // print all available toys for dog all together

        System.out.println(Arrays.toString(dog.toys));

        cat.sleep();
        dog.sleep();

        String str = "Test";
        System.out.println( str.length());
       // System.out.println( cat.sleep() );

        Animal bird = new Animal();


        bird.name= "tweeter";

        System.out.println("this is energy of bird >> "+ bird.energy);
        bird.speak();


        System.out.println(cat.energy);
        cat.speak();
        cat.speak();
        cat.speak();
        cat.sleep();
        System.out.println(cat.energy);
        System.out.println(bird.energy);
        bird.sleep();
        System.out.println(bird.energy);


    }
}
