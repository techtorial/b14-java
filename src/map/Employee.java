package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Employee {


    String name, city;
    int  age, id;

    public Employee(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator(); // ?
    }


    public static int idGenerator(){
        Random random = new Random();

       return random.nextInt(1_000_000);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }


    public void printNames(HashMap<Integer, Employee> map){


        for ( Employee employee    :  map.values()  ){


            System.out.println(    employee.name  );

        }


    }

    // create a method to
    // find out employees who are younger than age of 25 and print and return their city name as list

    public static List<String> youngPopCityFinder(HashMap<Integer, Employee> map ){

        List<String> cities = new ArrayList<>();
        for ( Employee employee  : map.values()){

            if (   employee.age <25   ){

             cities.add(   employee.city );
            }

        }
        return cities;
    }




}
