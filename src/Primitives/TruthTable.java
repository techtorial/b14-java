package Primitives;

public class TruthTable {
    public static void main(String[] args) {


        /*
            &&
         T - T => T
         T - F => F
         F - T => F
         F - F => F

            ||
         T - T => T
         T - F => T
         F - T => T
         F - F => F
         */
        int chairLeg =4, tableLeg=4;

        boolean dinner = chairLeg == 4 && tableLeg == 4;
        System.out.println( dinner );

        // represent the situation for visa and ticket from our example

        boolean visa = true, ticket = true;

        boolean travel =  visa  && ticket;
        System.out.println("Can you travel : "+ travel); // false

        int moneyLimit = 1000;
        int myMoney = 5000;

        boolean condition = visa && ticket && (myMoney >= moneyLimit);
        System.out.println(condition);

    }
}
