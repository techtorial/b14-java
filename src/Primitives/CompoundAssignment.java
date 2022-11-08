package Primitives;

public class CompoundAssignment {
    public static void main(String[] args){

        int car = 2;

        // want to add two more cars
        car += 2;
        System.out.println(car);

        car /=2;

        System.out.println(car);

        int sandw = 17;
        sandw -=7;
        System.out.println(sandw);

        sandw %=3;
        System.out.println(sandw);

    }
}
