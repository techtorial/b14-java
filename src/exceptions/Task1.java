package exceptions;

public class Task1 {

    public static void printStrings(String[] array){
        System.out.println("I am in the printStrings method");
        try{

            for (int i=0; i <= array.length; i++ ) {

                System.out.println(array[i] + "**");
            }
        }catch (ArrayIndexOutOfBoundsException e){

          e.getMessage();
          e.printStackTrace();
        }

        System.out.println("I am here after catch block");





    }

    public static void main(String[] args) {

        System.out.println("Working on task");

        String[] ex = {"1","2","3","t","4","6"};
        printStrings(ex);


        System.out.println("completed the task");
    }

}
