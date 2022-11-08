package OOP.object;

public class Bottle {

    double size;
    boolean isClean;
    double liquidAmountInBottle;

    public Bottle(boolean isClean) {
        this.isClean = isClean;
    }

    public Bottle(double size) {
        this.size = size;
        usage(4);

    }

    //create one usage method which takes double amount as parameter, it updates the liquidAmount
    public void usage(double amount){

        liquidAmountInBottle -= amount;

        BankAccount b = new BankAccount();
        b.logIn("ergwer", "13415");

    }


    protected void finalize()  {

        System.out.println("This is gc calling");
    }
}
