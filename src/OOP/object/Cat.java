package OOP.object;

public class Cat {

    String name, color;
    int age, foodAmount;

    public void run(String destination) {

        System.out.println("Cat is running to " + destination);

        foodAmount -= 1;
        System.out.println("Food amount after run is: " + foodAmount);
    }

    public void print() {
        System.out.println(name + "\n" + color + "\n" + age + "\n" + foodAmount);
    }

    public Cat test() {

        System.out.println("This method will return a cat object");
        return new Cat();
    }

    public static void main(String[] args) {

        Cat yellow = new Cat();


        Cat c1 = yellow.test(); //it returns a cat object

        System.out.println( "-------------");
        System.out.println(c1);
        c1.print();
        System.out.println( "-------------");


        Cat cat1 = new Cat();
        cat1.name = "Meow";
        cat1.color = "Orange";
        cat1.age = 10;
        cat1.foodAmount = 10;

        cat1.run("west");

        // if you want to know/print all features of the cat how would you do it?

        System.out.println(cat1.name);
        System.out.println(cat1.color);
        System.out.println(cat1.age);
        System.out.println(cat1.foodAmount);

        cat1.print();

        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat2.print();
        cat3.print();

    }
}
