package OOP.object;

public class Pet {

    String name;
    String color;
    int age;
    static int foodAmount = 20;

    public String toString(){
        return "name: "+name+"\ncolor: "+color+"\nage: "+age;
    }
    public void sleep() {
        System.out.println("Pet is sleeping ...");
    }

    public void eat() {
        run(); // static 'run' method can be called in non-static 'eat' method without object
        sleep();// non-static 'sleep' method can be called in non-static 'eat' method without object
        foodAmount -= 1;
        System.out.println(name + " is eating... left over food is: " + foodAmount);
    }

    public static void run() {

        System.out.println("Pet is running .. ");
    }

    public static void main(String[] args) {
        run();

        // eat(); --> you cannot call non-static method in the static method without object
        Pet pet1 = new Pet();
        pet1.eat();
    }


}
