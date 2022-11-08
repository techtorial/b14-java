package OOP.Inheritance1;

public class Rose extends Flower {

    public Rose(){
        super(3.99,"Yellow","Medium","Flower");
    }

    public Rose(double price, String color){
        super(price,color, "small","rose2");

    }
}
