package OOP.Abstraction.AbstractClasses1;

public abstract class  Student {

    String name;
    int id;

    public void eat(){
        System.out.println("Student is eating");
    }

    //abstract method
    public abstract void study();

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

}
