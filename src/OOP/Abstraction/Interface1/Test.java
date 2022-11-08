package OOP.Abstraction.Interface1;

public class Test {

    public static void main(String[] args) {
        //   you cannot create object from interface
        //  CanFly canFly = new CanFly();

        Bird bird1 = new Bird();
        bird1.fly("south");
        bird1.sing(9);
        System.out.println(bird1.TAIL);
        //  bird1.TAIL = 5; you cannot reassign a new value to interface variables
        Fish fish1 = new Fish();
        fish1.eatWeed();
        fish1.swim();

        CanFly c1 = new Bird();
        c1.fly("North");

        CanSwim sw1 = new Fish();
        sw1.swim();

        Duck duck = new Duck();
        duck.fly("down to water");
        duck.swim();

        duck.lookFood();

        duck.printInfo();
        bird1.printInfo();
        c1.printInfo();
    }
}
