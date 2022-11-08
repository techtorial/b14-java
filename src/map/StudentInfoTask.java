package map;

import java.util.*;

public class StudentInfoTask {
    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();
        HashMap<String, String> student2 = new HashMap<>();
        HashMap<String, String> student3 = new HashMap<>();
        HashMap<String, String> student4 = new HashMap<>();

        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "High Park");

        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        List<HashMap<String, String>> listOfStudents = new ArrayList<>();

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);

        System.out.println(listOfStudents);


        for (HashMap<String, String> student : listOfStudents) {

            if (student.get("Gender").equalsIgnoreCase("f")) {

                System.out.println(student.get("LastName").concat("_f@gmil.com"));
            }

        }

        // entrySet() --> pairs

        Set<Map.Entry<String, String>> pairs = student4.entrySet();


        System.out.println(pairs);
        // calling cityFinder method by passing 'listOfStudents' as parameter
        System.out.println(cityFinder(listOfStudents));
    }

    /*
    create a method which will take list of map as parameter
    this method will check if the age of students is less than 30
    it will store and return city of those students in a list
     */
    static public List<String> cityFinder(List<HashMap<String, String>> list) {
        List<String> cities = new ArrayList<>();

        for (Map<String, String> studentMap : list) {

            if (Integer.parseInt(studentMap.get("Age")) < 30) {

                cities.add(studentMap.get("City"));
            }
        }
        return cities;
    }


}
