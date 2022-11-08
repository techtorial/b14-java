package OOP.Abstraction.Interface1;

public class Bird implements CanFly{

    @Override
  public  void fly(String destination){
        System.out.println("Bird is flying " + destination);
    }

    public int sing(int words){

        System.out.println("Bird is singing "+words);
      return  words;
    }

    @Override
    public void printInfo(){
        System.out.println("Print info in the BIRD");
    }
}
