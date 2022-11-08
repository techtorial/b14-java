package RecapWithAhmet.OOP;

public interface InterfacePractice2 {
    final static String name="Ahmet";

    public abstract  void run();

    public default void speak(){
        //exception to have regular method
    }
//    public void speak1(){
//        you cannot have regular methods
//    }
}
