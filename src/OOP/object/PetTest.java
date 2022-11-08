package OOP.object;

public class PetTest {

    public static void main(String[] args) {

        Pet lion = new Pet();

        lion.name = "Simba";

        System.out.println(lion.name);// Simba

        Pet tiger = new Pet();

        tiger.name = "Shah";

        System.out.println(tiger.name); // Shah

        lion.name = "Umar";

        System.out.println(lion.name); // Umar
        System.out.println(tiger.name); // Shah

        Pet snake = new Pet();

        System.out.println(snake.name); // null

        System.out.println("=====lion======");
        System.out.println( lion.foodAmount );
        System.out.println("=====tiger======");
        System.out.println(tiger.foodAmount);
        System.out.println("=====snake======");
        System.out.println(snake.foodAmount);

        lion.eat();

        System.out.println("calling food for tiger> "+tiger.foodAmount); //

        System.out.println("calling food for lion> "+lion.foodAmount);

        tiger.eat();
        tiger.eat();
        tiger.eat();
        System.out.println("calling food for lion> "+lion.foodAmount);

        // calling static run method by using object
        lion.run();

        //calling static run method by using class name(Pet)
        Pet.run();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(  lion ); //
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(  tiger ); //
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
        String str5 = tiger.toString();
        System.out.println("!!!! "+str5);
    }
}
