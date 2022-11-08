package OOP.Polymorphysim;

public class Branch extends Atm{


    public void openAccount(){
        System.out.println("New account created at branch");
    }

    public void loan(){

        System.out.println("Branch can give loan up to 1_000_000");
    }


}
