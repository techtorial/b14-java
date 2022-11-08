package OOP.object;

public class BankAccount {
    String accountHolderName;
    double balance;
    int accountNumber;
    String userName;
    String password;
    boolean isLoggedIn;

    // -create a method that will display all account information
    public void printAccountInfo() {
        if (isLoggedIn == true) {

            System.out.println( "accountHolderName >>" + accountHolderName + "\nbalance >>" + balance + "\naccountNumber" +

                    accountNumber + "\nuserName >>" + userName + "\npassword >>" + password + "\nisLoggedIn >>" + isLoggedIn);
        }else {
            System.out.println("Please log in first to See your Information");
        }

    }
// -create a method that will be named as deposit(), and it will update balance

    public void deposit(double depositAmount) {

        balance = balance + depositAmount;
        System.out.println("Your balance after deposit amount of " + depositAmount + " is " + balance);
    }

    //-create a method that will be named as withdraw(), and it will update balance

    public void withDraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
        System.out.println("Your balance after withdraw amount of " + withdrawAmount + " is " + balance);
    }
    // -create a method that will be named as logIn(),
    //						and will check if the user logged in or not and returns true/false

    public boolean logIn(String enteredUserName, String enteredPassword) {

        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            isLoggedIn = true;
            printAccountInfo();
        } else {
            isLoggedIn = false;
        }
        System.out.println("is coming from logIn method: " + isLoggedIn);

        return isLoggedIn;
    }

    /*
    create a method that will be called signUp
    this method should set the values for instance variables
     */

    public void signUp(String accountHolderName1, double balance1, int accountNumber1, String userName1, String password1) {

        accountHolderName = accountHolderName1;
        balance = balance1;
        accountNumber = accountNumber1;
        userName = userName1;
        password = password1;

    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.userName = "java";
        bankAccount.password = "123";

        bankAccount.balance = 1000000;

        bankAccount.logIn("java", "123");

        System.out.println("-------------");
        bankAccount.logIn("java", "12345");

        System.out.println("*******************");
        BankAccount umar = new BankAccount();

        umar.signUp("Umar", 10000000, 999, "umar1", "1234");

        umar.printAccountInfo();
        umar.logIn("umar1","1234");
        System.out.println("*******************");
        umar.printAccountInfo();

    }

}
