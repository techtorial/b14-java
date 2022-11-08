package WrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {

        String str = "123";
        System.out.println(str + 100);//123100

        int number1 = Integer.parseInt(str);

        System.out.println(number1 + 100); // 223

        int number2 = Integer.parseInt(str);

        System.out.println(number2 + 1);

        int number3 = Integer.parseInt("8");

        System.out.println(number3*2);

        String str2 = "E12";

       // int number4 = Integer.parseInt(str2);// NumberFormatException

        boolean b1 = Boolean.parseBoolean("True");

        System.out.println(b1);

        boolean b2 = Boolean.parseBoolean("text");

        System.out.println(b2);

        boolean b3 = Boolean.parseBoolean("FALSE");

        System.out.println(b3);

        String studentId = "1231244154";



    }
}
