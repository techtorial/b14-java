package OOP.object;

public class VarArgsExample {


    /*
    return sum of the numbers from array
    create a method to solve it

    {1,2,3,4}
     */


    public int sumFinder(int[] numbers ) {
        int sum = 0;

        for (int number : numbers) {

            sum = sum + number;
        }

        return sum;
    }

    public int totalFinder(  int ... numbers ){
        int sum = 0;

        for (int number : numbers) {

            sum = sum + number;
        }

        return sum;
    }

    // Print out given names as in following format
    // 1. Name is ...Alex...
    // 2. Name is ..Dima..

    public void printNames(String ... studentNames){

        for (int i=0; i < studentNames.length; i++){

            System.out.println(i+1 + ". Name is "+studentNames[i]);
        }

    }


    public static void main(String[] args) {
        VarArgsExample xyz = new VarArgsExample();

        xyz.printNames("Alex","Dima","David");
        xyz.totalFinder(2,3,4);
        xyz.totalFinder(5,6);
        xyz.totalFinder(10,20,30,40);



        int[] ids = {1, 2};
        int r2= xyz.totalFinder(ids);
        System.out.println(">>>> "+r2);


        int result = xyz.sumFinder(ids);
        System.out.println(result);

        int[] ns1 = {1, 2};
        xyz.sumFinder(ns1);
    }
}
