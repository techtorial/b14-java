package OOP.Abstraction.AbstractClasses1;

public class JrAlex extends Alex{


    public JrAlex(String name, int id) {
        super(name, id);
    }

    @Override
    public void play() {
        System.out.println("Jr ALex is playing");
    }

    @Override
    public void eat() {
        System.out.println("Jr Alex is eating");
    }

}
