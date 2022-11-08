package OOP.Abstraction.AbstractClasses1;

public class OnlineStudent extends Student {

    public  OnlineStudent (String name, int id){
        super(name, id);
    }

    public void study(){

        System.out.println("they are studying at HOME");
    }


}
