package OOP.inheritance;

public class Cat extends DomesticAnimal{

      String mealType;
      String name;

      public void sleep(){

            System.out.println(name + " Cat is sleeping");
      }

    public  void play(){
            System.out.println(name+" Cat is playing with a yarn ball");
      }

      public Integer energyAmount(int foodAmount){

          System.out.println(name + " Energy is "+ foodAmount * 10);

          return foodAmount *10;
      }

      public Cat test1(){
          System.out.println("Test1 method in the CAT class");

          return new Cat();
      }

}
