package OOP.Abstraction.AbstractClasses1;

public abstract class SelfLearner extends Student {

    public SelfLearner(String name, int id){
        super(name, id);
    }

    public void study(){

        System.out.println("self learner study");
    }

    public abstract void watch();



}
