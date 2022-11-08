package RecapWithAhmet.EmployeeProject;

public class Employee {
    //Instance variables belong to the class
  public  String name;
 protected    double salary;
  private  int workhours;
    int hireYear;

    public Employee(){}

    public Employee(String name, double salary, int workhours, int hireYear) {
        //These are the initiliazation of the instance variable
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary<=1000){
            return 0.0;
        }
        return salary*0.03;
    }

    public double bonus(){
        //local variable belongs to the blocks(method)
        double extrahours=workhours-40;
         if(extrahours>0){
            return extrahours*30;
         }
         return 0.0;
    }

    public double increaseSalary(){
        int year=2015-hireYear;
        if(year<10){
            return salary*0.05; // 50
        }else if(year>9 &&year<20){
            return salary*0.1;
        }else if(year>19){
            return salary*0.15;
        }
        return 0.0;
    }
    public void information(){
        //to be able to use the value from methods you should return it.
        System.out.println("Name : " + name);
        System.out.println("Salary : "+salary);
        System.out.println("WorkHours : "+workhours);
        System.out.println("HireYears : "+hireYear);
        System.out.println("Tax : "+"$"+tax());
        System.out.println("Bonus : "+"$"+bonus());
        System.out.println("IncreasedSalary : "+"$"+increaseSalary());
        System.out.println("Salary with Tax and Bonus : "+"$"+(salary+bonus()-tax()));
        System.out.println("Total salary with increase salary : "+"$"+(salary+increaseSalary()));
    }

}
