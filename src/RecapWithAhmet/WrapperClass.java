package RecapWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-What is Wrapper Class
      -->It is a way(process) to convert data into different forms.
        -->Primitive data -->Object //Autoboxing
        -->Object data -->Primitive // Unboxing

     2-How many ways of wrapper class do you know?
        *Hey Sir/Boss/King, I know there are two main ways to do it:
           -->conversion from primitive to object-->Autoboxing
           -->conversion from object to primitive -->Unboxing
        TIPS:To be able to keep it in your mind properly.Always think about
        the keyword of AUTO-->it means it is happening by itself you do not need to
        use any methods or take any actions to convert (Primitive to the OBJECT)

        -->To be able to figure out Unboxing.Think that you need to take actions on it
        it means you need to use some methods(parsing)

        ***NOTE:String value of is not a part of WRAPPER CLASS ******

     */
    public static void main(String[] args) {
        //AUTOBOXING:
        List numbers=new ArrayList<>();
        int number=1; //INTEGER number=1
         numbers.add(number);
         numbers.get(0).hashCode();
         String number1="5";
        // number1.
         int number2=Integer.parseInt(number1);
           boolean result=  Boolean.parseBoolean("false");
           Integer numbe111=5;

           int nus=(int)numbe111;
        System.out.println(number2);
        // number2.

    }
}
