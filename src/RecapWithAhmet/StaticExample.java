package RecapWithAhmet;

public class StaticExample {
    static String name="Ahmet";
    public static void run(){
        System.out.println("I am running");
    }
    //BEfore method
    static {
        System.out.println("I am a static block ");
        System.out.println("hello");
    }
    static {
        System.out.println("I am a second static block");
    }
    {
        System.out.println("I am a instance block");
    }


    public void name() {
    }
}
