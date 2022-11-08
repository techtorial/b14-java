package Primitives;

public class Casting {

    public static void main(String[] args){

        // casting: when you convert larger data type to smaller data type
        //          from decimal data type to whole number data type

        int number1 = 11;

       // byte bt1 = number1; // as is it will give compile time error

        byte bt1 = (byte) number1; // casting
        System.out.println("bt1 --> "+bt1);

        byte bt2 = (byte)3200;
        System.out.println("bt2 --> "+ bt2);

        byte bt3= 2, bt4 = 6;

       // byte total1 = bt3 + bt4; // as is it will give compile time error

        byte total1 = (byte) (bt3 + bt4); // casting

        total1 += bt3;

        //from decimal data type to whole number data type

        int num1 = (int)4.5;

        System.out.println("num1 --> "+num1);

        double moneyWithCents = 10.25;

        int money =(int) moneyWithCents;
        System.out.println(money);


        char  letter = 'A'; // 65

        int numberForLetter1 = letter;
        short numberForLetter = (short)letter;


        int i3 = 34;

        double d4 = i3; // implicit casting, java will do casting behind the screen

        long l = 12;

        int i = (int)l; // explicit

        byte b = 11;

        int i2 = b;// --> ok compile

        short s = b;


        b +=  4;

        int a = 23;

        byte b1 = 1;
         b1 += a;

    }
}
