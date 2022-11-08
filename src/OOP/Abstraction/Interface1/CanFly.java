package OOP.Abstraction.Interface1;

public interface CanFly {

    int WINGS = 2;
    int TAIL = 1;


    void fly(String destination);

 //you cannot have non-abstract method in interface
//    void abc(){
//        System.out.println();
//    }

     default void printInfo(){
        System.out.println("number of wings: "+ WINGS
                +"\nnumber of tails: "+TAIL );
    }


}
