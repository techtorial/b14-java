package OOP.object;

public class MethodPractice2 {
    /*
    create a method that will calculate age of person
    return type is void
    name of method is ageCalculator
    -print age of person --> "age is .. "
     */
    public void ageCalculator() {
        int currentYear = 2022, birthYear = 2020, age;
        age = currentYear - birthYear;
       // System.out.println("Age is " + age);
    }

    public int ageCalculator1() {
        int currentYear = 2022, birthYear = 2020, age;
        age = currentYear - birthYear;
      // System.out.println("Age1 is " + age);
        return age;
    }

    public static void main(String[] args) {
        MethodPractice2 john = new MethodPractice2();
        john.ageCalculator();
        int number1 = john.ageCalculator1();
       // System.out.println( john.ageCalculator());
        System.out.println(   john.ageCalculator1());
        System.out.println( number1 );// 2

        if ( number1 == 15){
            System.out.println("you are so young");
        }

        if (john.ageCalculator1() == 15) {
            System.out.println("you are so young");
        }
        System.out.println( 2 < john.ageCalculator1()); // false
    }

}
