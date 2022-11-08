package OOP.object;

public class BottleTest {

    static Bottle b1 = new Bottle(true);

    static Bottle b2 = new Bottle(16);

    public static void main(String[] args) {
        b1.usage(5);

        System.out.println(b1.liquidAmountInBottle); // -5

        b2.usage(3);
        System.out.println(b2.liquidAmountInBottle); // -3


        System.out.println( b1 == b1);

        System.out.println(b1 == b2);

        Bottle b3 = b1;

        b2 = b3;

        System.out.println( b3 == b1);
        System.out.println("------------");

        System.out.println(   b2 == b1);

        System.out.println( b1.equals(b2));
        System.out.println("------------");
        Bottle b4 = new Bottle(16);

        System.out.println(b4.equals(b2));


//        b4 = null;

        b1 = null;

       // System.out.println(b4.size);
        System.gc();

    }

}
