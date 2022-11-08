package OOP.Inheritance1;

public class Garden {

    public static void main(String[] args) {


        Flower flower1 = new Flower(.99,"Orange","Large","FLOWER");

        System.out.println(flower1.color);

        Rose rose1 = new Rose();

        System.out.println( rose1.color);

        rose1.color = "RED";
        System.out.println(rose1.color);

        System.out.println( flower1.color);

        Lily l1 = new Lily();

        Lily l2 = new Lily(2, "Purple","Extra large","LILY");

        System.out.println(l1.color); // Pink

        System.out.println(l2.color); // Purple

        System.out.println("===============");

        System.out.println(flower1.color);

        Flower f2 = new Flower(0,"Black","abc","Flower2");
        System.out.println(f2.color);

    }
}
