package OOP.object;

public class OverloadingTest {

    public static void main(String[] args) {
        OverloadingPractice object = new OverloadingPractice();
        object.sum(3, 2);
        object.sum(7,8,1);
        object.sum("add", 4,5);
        object.sum("subtract", 5, 2);
        object.sum("xyz", 5,6);
    }
}
