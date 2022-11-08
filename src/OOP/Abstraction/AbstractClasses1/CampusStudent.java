package OOP.Abstraction.AbstractClasses1;

public class CampusStudent extends Student{

    public CampusStudent(String name, int id){
        super(name, id);
    }

    @Override
    public void eat(){
        System.out.println("Campus student is in the kitchen");
    }

    public void study(){

        System.out.println("campus student is studying in Class");
    }

  //  public abstract void run(); you cannot have abstract method in a non-abstract class

    public void tableTennis(){
        System.out.println("playing pin pong");
    }

}
