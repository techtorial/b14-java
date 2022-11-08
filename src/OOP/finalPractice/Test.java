package OOP.finalPractice;

public class Test {


    public static void main(String[] args) {
        Shirt shirt = new Shirt();

     //   shirt.PRICE = 9.99; //you cannot change the value of final variable

        TShirt tShirt = new TShirt();

      //   tShirt.PRICE = 7.99; you cannot change the value of final variable

        System.out.println( tShirt.PRICE );

        shirt.wash();
        tShirt.wash();
        shirt.wash();
        tShirt.wash();

        System.out.println(  shirt.color   );
        System.out.println(   tShirt.color  );

        shirt.color = "green";
       // tShirt.color = "Red"; you cannot change the value of final variable
        System.out.println(  shirt.color   );
    }
}
