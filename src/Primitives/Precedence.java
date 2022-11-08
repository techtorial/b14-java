package Primitives;

public class Precedence {

    public static void main(String[] args) {
        int count = 10 + 3 * 5;

        System.out.println("count "+count); //25

        int count1 = (10 + 3) * 5;
        System.out.println("count1 "+count1);

        int count2 = 12 + 4 / 2 -2 * 3 + 5;

        System.out.println("count2 "+count2);

        int count3 = count + 11 % 2 + count2;

        System.out.println("Count3 "+ count3); //
    }
}
