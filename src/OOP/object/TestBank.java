package OOP.object;

public class TestBank {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(1000);

        account.printAccountInfo();
        account.withDraw(5.99);
        account.logIn("abc","123");
        account.userName = "abc";
        account.password = "abc123";
        account.logIn("abc","abc123");
    }
}
