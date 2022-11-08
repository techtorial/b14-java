package OOP.inheritance;


public class Zoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println(animal1.name);

        WildAnimal wild1 = new WildAnimal();
        System.out.println(wild1.name);

        Lion lion1 = new Lion();
        System.out.println(lion1.name);

        animal1.name = "Fluffy";
        System.out.println(animal1.name);
        System.out.println(wild1.name);
        System.out.println(lion1.name);

        System.out.println(animal1.color);
        System.out.println(wild1.color);
        System.out.println(lion1.color);

        Cat cat1 = new Cat();
        System.out.println(cat1.mealType);

        DomesticAnimal domestic1 = new DomesticAnimal();

        domestic1.eat();
        animal1.eat();
        wild1.eat();
        lion1.eat();
        cat1.eat();

        System.out.println("----------");
        cat1.sleep();
        cat1.name = "Tom";
        cat1.sleep();

        Cat cat2 = new Cat();
        cat2.sleep();

        System.out.println("----------");
        domestic1.play();
        cat2.play();

        System.out.println("----------");

        Number a = animal1.energyAmount(5);
        Integer b = domestic1.energyAmount(5);
        Integer c = cat2.energyAmount(5);

      //  animal1.play(); play method is created in the Domestic class for the first time
        // so, you cannot reach play method by using animal object
        lion1.sleep();
        System.out.println("----------");

       Cat c3 =  cat1.test1();
       DomesticAnimal d2 =cat1.test1();

    }

}
