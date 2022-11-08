package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeTest {


    public static void main(String[] args) {

        Employee e1 = new Employee("Alex", "Chicago", 25);

        System.out.println(e1.id);
        Employee e2 = new Employee("David", "Boston", 21);
        Employee e3 = new Employee("Nicole", "Houston", 18);
        Employee e4 = new Employee("Dima", "New York", 44);

        HashMap<Integer, Employee >  employeeMap  = new HashMap();

        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        employeeMap.put(e4.id, e4);

        System.out.println(    employeeMap.get(e1.id)  );

        e1.printNames( employeeMap   );

        System.out.println(   Employee.youngPopCityFinder(   employeeMap  ));

        List<String> list =   Employee.youngPopCityFinder(   employeeMap  );

        System.out.println( list);

        Collections.sort(list) ;

        System.out.println(list);
    }

}
