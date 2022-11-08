package RecapWithAhmet;

public class TernaryOperators {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-There is no directly questions about that but it is good to use during the interview
     instead of if conditions.
     TIPS:IF you are having lots of conditions(if, else if, else if ,else if else)
     TIPS2:If you have a simple validation(condition(one-two) -->Then ternary operators
     */
    public static void main(String[] args) {
        int number=46;
        int number2=35;

        String value=number>number2 ? "Number is bigger" : "Number2 is bigger";
        System.out.println(value);
        System.out.println(number>number2 ? "Number is bigger" : 56);

//        if(number>number2){
//            System.out.println("number is bigger");
//        }else{
//            System.out.println("number2 is bigger");
//        }

    }
}
