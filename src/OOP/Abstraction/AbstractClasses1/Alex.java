package OOP.Abstraction.AbstractClasses1;

public abstract class Alex extends CampusStudent {
    int age;
    int id;
    public Alex(String name, int id) {
        super(name,id);
        this.id = id;
    }

    abstract public void play();

    public void speak() {
        System.out.println("Abstract alex is speaking");
    }
}
