package OOP.object;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("LA");

        System.out.println(e1.city); //

        e1.city = "New York";

        System.out.println(e1.city);

        e1.setCity("Boston");
        System.out.println(e1.city);

        Employee e2 = new Employee("Miami");
        System.out.println(e2.city);

        Employee e3 = new Employee();

        System.out.println("+++++++++++++++++++");

        Employee e4 = new Employee("John","Denver",1);

        System.out.println("+++++++++++++++++++");
        System.out.println(e4); // hashcode--> fix it please!!

        System.out.println(e1); //
        System.out.println(e4); //

    }
}
