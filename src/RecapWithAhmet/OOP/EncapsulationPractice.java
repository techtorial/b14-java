package RecapWithAhmet.OOP;

public class EncapsulationPractice {
    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setName("Mahmut");
        System.out.println(encapsulation.getName());
        encapsulation.setAge(101);
        System.out.println(encapsulation.getAge());
        encapsulation.setAge(99);
        System.out.println(encapsulation.getAge());
    }
}
