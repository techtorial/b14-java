package OOP.Inheritance1;

public class Lily extends Flower {

    //String color;
    public Lily(double price, String color, String size, String type) {
        super(88, "color", "size", "type");
//        super(price,color,size,type);
//        this.color = color;
//        this.price = price;
//        this.size = size;
//        this.type = type;
    }

    public Lily(){
        super(5,"Pink","small","Lily");
    }

}
