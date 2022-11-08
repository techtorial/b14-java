package WrapperClasses;

public class Practice1 {
    public static void main(String[] args) {

        byte b = 11;
        Byte bt = new Byte(b);

        System.out.println(bt);//11
        bt = 22;
        System.out.println(bt);//22

        short s = 34;
        Short sh = new Short(s);

        Short sh1 = new Short((short) 45);
        System.out.println(sh1);//45

        Integer i = new Integer(12);
        Long l = new Long(2);
        Float fl = new Float(2.3);
        Double db = new Double(5.5);

        Character ch = new Character('r');
        char letter = 'c';

        Boolean bl1 = new Boolean(true);

        Boolean bl2 = new Boolean("true");

        System.out.println(bl2 == true);

        Boolean bl3 = new Boolean("car");

        System.out.println(">>> " + bl3);

        System.out.println(bl3 == true); // false
        System.out.println(bl3 == false);// true

        Integer number2 = new Integer(33);
        Integer number = 33; // Auto boxing --> java converts primitive value to Wrapper object
        System.out.println("*** " + (number2 == number));

        int number1 = 33; // primitive int
        System.out.println("!! " + (number2 == number1));
        System.out.println(number1 == number);

        int i2 = number2; // Un Boxing --> java converts Wrapper object to primitive

        int i3 = sh1;

        int i4 = ch;
        System.out.println(i4);

    }
}
