package Primitives;

public class TruthTable1 {
    public static void main(String[] args) {
        /*
        you want to start a masters program
        OR
        language score --> 80 or more
        gpa  ---> 3.6 or more
         */
        double myGpa = 4.0, gpa = 3.6, languageLimit = 80, myLanguageScore = 60;

        boolean program = myGpa >= gpa || myLanguageScore >= languageLimit;

        System.out.println(program);

        /*
        to be able to pass a class
        average of your three test scores should be greater or equal to the 60%
        and your average attendance should be 90% or more
         */

        int test1 = 0, test2 = 100, test3 = 100, myAttendance = 100, requiredScore = 60, requiredAttendance = 90;

        boolean pass = (test1 + test2 + test3) / 3 >= requiredScore && myAttendance >= requiredAttendance;

        System.out.println("Passing the class? --> " + pass);


    }
}
