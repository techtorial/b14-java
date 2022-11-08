package Primitives;

public class Farm {

    public static void main(String[] args) {

        /*
        1-calculate numbers of legs in a farm if:
        -there are 12 cows and 25 chickens at this farm
        -show the total numbers of the legs on the console
        "the total numbers of legs in the farm is:" ....
         */
        int eachCowLegs = 3;
        int eachChickenLegs = 2;
        int cows = 12;
        int chickens = 250;

        int total = cows * eachCowLegs + chickens * eachChickenLegs;

        System.out.println("the total numbers of legs in the farm is:" + total);

        System.out.println("the total numbers of legs in the farm is:" + (cows * eachCowLegs + chickens * eachChickenLegs));

        System.out.println((cows * eachCowLegs) + (chickens * eachChickenLegs));

        /*
        calculate worth of the farm if:
        each cow is $1500
        each chicken is $30                                         --18750
        -show total worth of the farm as: "The worth of the farm is: " ...
         */
        double costOfEachCow = 1500, costOfEachChicken = 30;

        double total$ = cows * costOfEachCow + chickens * costOfEachChicken;

        System.out.println("The worth of the farm is: $" + total$);

        System.out.println(4 + 5 * 7 + 8);

        float fl = 44;
    }
}
