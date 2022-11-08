package OOP.object;

public class NetFlixTest {
    public static void main(String[] args) {

        NetFlix account1 = new NetFlix();

        account1.userName = "Kids";

        account1.monthlyData = 1012;

        account1.usage(2);

        account1.usage(2);

        NetFlix account2 = new NetFlix();


        account2.usage(1);
        account2.usage(2);

        System.out.println(account2);



    }
}
