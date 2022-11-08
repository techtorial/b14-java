package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        System.out.println(45 == 45); // true

        System.out.println('t' == 't');

        System.out.println('b' != 'c');
        System.out.println("******************");
        // event and only kids who are age of 11 and younger can participate

        int ageOfKid = 7, requiredAge = 11;

        boolean canParticipate = ageOfKid <= requiredAge;
        System.out.println(canParticipate); // true --> so 7 years old can attend the event

        // there is an event only people whose age is 21 can attend

        int agePerson = 21, limit = 21;

        boolean canAttend = agePerson == limit;
        System.out.println(canAttend);
        System.out.println(!canAttend);

        // there is an event only people whose age is 21 canNOT attend
        int agePerson1 = 21, limit1 = 21;
        boolean canAttend1 = agePerson1 != limit1;
        System.out.println(canAttend1);

        // there is an event only people whose age is 21 and older can attend
        int limitation = 21, age =30;

        boolean canGo = limitation <= age;

        boolean canGO1 = age >= limitation;

        System.out.println( canGo == canGO1); // true

    }
}
