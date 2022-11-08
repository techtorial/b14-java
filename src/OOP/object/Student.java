package OOP.object;

import java.util.Random;

public class Student {
    String fName, lName = "Smith";
    int age;

    // create a method to assign a vale to the fName
    public void assignFName(String userGivenName) {

        fName = userGivenName;

    }

    // 'setter' methods are just setting value to the instance variable/s
    public void setAge(int userGivenAge) {
        age = userGivenAge;
    }

    // create a method that will return the lName

    public String lNameFinder() {
        return lName;
    }

    //'getter' methods are just returning value of the instance variable
    public int getAge() {
        return age;
    }

    //overload example for lNameFinder

    // pass city name of the Student to the method as a parameter
    // and return the following message
    // "Mr/s. ... you live in ...city.. "
    // test your method in the 'StudentTest' class

    public String lNameFinder(String city) {
        return "Mr/s. " + lName + " you live in " + city;
    }

    public void sleep() {

        System.out.println(fName + " is sleeping " + hourCreator() + " hours");
    }

    public void sleep(int hour) {

        System.out.println(fName + " is sleeping " + hour + " hours");
    }

    public void study() {

        System.out.println(fName + " is studying " + hourCreator() + " hours");
    }
    // create a method that will give me a random hour/number
    // I will take that random hour from that method
    // and I will use it as HOURs in my other methods
    public int hourCreator() {

        Random random = new Random();

        int hour = random.nextInt(12);
        return hour;
    }


}
