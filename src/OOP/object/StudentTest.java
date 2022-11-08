package OOP.object;

public class StudentTest {

    public static void main(String[] args) {


        Student student1 = new Student();

        student1.age = 21;
        student1.lName = "Brown";
        student1.fName = "Jack";

        student1.assignFName("Matthew");
        System.out.println(student1.fName);

        student1.setAge(19);
        System.out.println(student1.age);

        student1.age = 21;
        System.out.println(student1.age);

        student1.lNameFinder();
        System.out.println(student1.lNameFinder()); // Brown

        String lastNameOfStudent1 = student1.lNameFinder();
        System.out.println(student1.lNameFinder()); // Brown
        System.out.println(lastNameOfStudent1.equals("Brown")); // true

        String str1 = student1.lNameFinder("Chicago").replace('c', '*');
        System.out.println(str1);

        student1.sleep();
        student1.sleep(8);

        student1.study();

        Student st2 = new Student();
        st2.fName = "Abdul";
        System.out.println(st2.fName);

        st2.sleep();

    }
}
