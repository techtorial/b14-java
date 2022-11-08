package Primitives;

public class UnaryOperators2 {

    public static void main(String[] args){

        int flower  = 10, vase = 15, liter = 2;

        int result = (flower--  + --vase *  ++liter) / 2;


        System.out.println(result);


        int result2 = liter++ * 2 * flower++ + vase; //68

        System.out.println(result2);

    }
}
