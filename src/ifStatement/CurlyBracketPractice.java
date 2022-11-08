package ifStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {



        int a = 5, b=3;
        String  d ="string";
        if ( a != b )
            a++;
            b++;
            a = a + b;

            int c = a;
        System.out.println("value of c is "+c); //10, 9, 8, 11, 6 , 14, 15,

        if (a > b)
            c = a * b;
        else System.out.println("this is wrong");
        System.out.println("value of c is now> "+c);

    }
}
