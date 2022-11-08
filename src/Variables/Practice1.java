package Variables;

public class Practice1 {

    public static void main(String[] args) {

        // declaring variable
        int age;
        //initializing variable
        age = 60;
        System.out.println("*********");

        System.out.println(age);
        int number = 200;
        System.out.println(number);
        System.out.println(age + number);
        System.out.println("My age is 25");
        System.out.println("My age is " + age);
        System.out.println("My age is " + (25 +25));

        // 25 is my age
        System.out.println(age + " is my age");
        int number2 = 20;
        System.out.println("my age will be " + age + number2 + 1111);
        System.out.println(age + number2 + " will be my new AGE");

        System.out.println("My age will be doubled:* " + age * 2 ); // ....602    ....120

        System.out.println("My age will be halved >> " + age / 2 );

       // System.out.println("My age will be less: " + age - 10 ); compile time error

        System.out.println("My age will be less: " + (age - 10 ));  //

    }

}
