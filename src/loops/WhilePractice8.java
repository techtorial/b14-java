package loops;

public class WhilePractice8 {
    public static void main(String[] args) {
        /*
        you have $40 in you phone call account
        each call cost $5
        print --> "you can make .8. calls with your money"
        show how much money you have left after each call
         */
        int money = 40, eachCall = 5;
        int totalCall = 0;

        while (money > 0) {
            totalCall++;
            money -= eachCall;
            System.out.println("after making call your money is: " + money);
            System.out.println(totalCall + ". iteration for while loop");
        }
        System.out.println("you can made " + totalCall + " calls");


    }
}
