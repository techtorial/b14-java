package OOP.Abstraction.Interface2;

public class Child1 implements Parent1, Parent2 {

    @Override
    public void talk(){
        System.out.println("talking");
    }

    public void run(int mile){
        System.out.println("runnn");
    }

    @Override
    public void run(){
        System.out.println("Running");
    }

    public void study(){
        System.out.println("studying");
    }

}
