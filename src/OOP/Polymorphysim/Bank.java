package OOP.Polymorphysim;

public class Bank extends Branch{

    @Override
    public void loan(){
        System.out.println("Bank can give loan up to 5_000_000_000");
    }

    public void openBranch(){

        System.out.println("Can open branch from BANK");
    }


}
