package OOP.Polymorphysim;

public class Atm {


    public void deposit(int depositAmount){

        System.out.println("You deposit "+ depositAmount);
    }

    public void withdraw(int withdrawAmount){

        System.out.println("You take out: "+withdrawAmount);
    }

    public void printInfo(){

        System.out.println("Seeing details of account");
    }


}
