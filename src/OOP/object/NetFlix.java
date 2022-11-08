package OOP.object;

public class NetFlix {


    //-familyAccountName, userName, monthlyData
    //create a method that will update monthlyData for every usage
    //    `make sure this method takes parameter for data usage

    String familyAccountName, userName;
    static int monthlyData;

    public void usage(int usage){

        monthlyData = monthlyData - usage;

        System.out.println("Remaining data is: "+monthlyData+ " after "+ userName+" used the account");
    }
}
