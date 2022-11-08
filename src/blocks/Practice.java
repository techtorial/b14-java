package blocks;

public class Practice {

    String str;
    static int num;

    {
        str = "Test";
        System.out.println("Instance Block " + str);
    }

    static {
        num = 34;
        System.out.println("Static block " + num);
    }


}
