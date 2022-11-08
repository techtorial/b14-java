package RecapWithAhmet.EmployeeProject;

public class EmpDriver {
    public static void main(String[] args) {
    Employee Kemal=new Employee("Kemal",2000,45,1985);
    Kemal.information();
    Employee Bektur=new Employee("Bektur",5000,40,2022);
    Kemal.setName("Mahmut");
        System.out.println(Kemal.getName());
    Bektur.information();
    }
}
