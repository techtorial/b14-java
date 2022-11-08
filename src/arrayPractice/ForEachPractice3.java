package arrayPractice;
import java.util.Arrays;
import java.util.Scanner;
public class ForEachPractice3 {
    public static void main(String[] args) {
        /*
        get 5 employee names from user
        store those names into employeeNames array
        create email for each employee
        store the emails into employeeEmails array
            >> jhon@java.com,
        show each of array to see the data
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names you want to add to the list?");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] employeeNames = new String[size];
        String[] employeeEmails = new String[size];

         for ( int i=0; i< size; i++){
             System.out.println("Please enter employee name");

             employeeNames[i] = scanner.nextLine();
             employeeEmails[i] = employeeNames[i].concat("@java.com");
         }
        System.out.println("here are the names of employees "+Arrays.toString(employeeNames));
        System.out.println(Arrays.toString(employeeEmails));




    }
}
