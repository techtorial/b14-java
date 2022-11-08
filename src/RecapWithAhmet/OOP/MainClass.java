package RecapWithAhmet.OOP;

public class MainClass extends AbstractPractice implements InterfacePractice,InterfacePractice2 {

    @Override
    public void race() {
        System.out.println("racing");
    }

    @Override
    public String go() {
        return null;
    }

    // @Override
   // public void go() {
 //       System.out.println("going");

   // }

    @Override
    public void run() {
        System.out.println("run");
    }
}
