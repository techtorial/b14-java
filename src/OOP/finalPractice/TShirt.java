package OOP.finalPractice;

final public class TShirt extends Shirt{

    final String color = "Blue";
// final methods cannot be overridden

//    @Override
//    final public void wash(){
//        System.out.println("Dry cleaning");
//    }

    final public void dye(){

        System.out.println("choose your own color");
    }

    public  void print(){
        // color = "white"; you cannot change the value of final variable
       // super.PRICE = 45; you cannot change the value of final variable
    }

}
