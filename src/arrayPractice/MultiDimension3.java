package arrayPractice;

import java.util.Arrays;

public class MultiDimension3 {
    public static void main(String[] args) {


        String[][] items = { {"Apple", "Lenova", "HP", "Dell", "Acer"}, {"Samsung", "LG", "Sony"}, {"Alexa", "Google", "Logitec", "JBL"}};

        double[][] prices = {  {2500, 1600,1800,1900,  1100}, { 2199,    2199, 1599}, {79.99,  89.99,   64.99, 55.99}};

        String[] sections = {"Computer", "TV", "Speakers"};

        for ( int i=0; i< items.length; i++){

            System.out.println("=== "+sections[i] + " prices ===");

            for ( int j = 0; j< prices[i].length; j++){

                System.out.println("price for "+ items[i][j] +" is "+ prices[i][j]);
            }

        }
        System.out.println("**************");
        int[][][] numbers = { {   {1,2},{2,1,8},{5}  },    {   {5,4,6},{6,7}  }   };

        System.out.println(Arrays.deepToString(numbers));
        //System.out.println(numbers[0][0][0]);
        System.out.println(   numbers[1][1][1] +" <<< "  );

        for ( int[][] num1: numbers){

            for (int[] num2 : num1){
                 for (int num: num2){
                     System.out.println(num);
                 }
            }
        }
        System.out.println("&&&&&&&&&&&&&&&");

        for (int i=0; i< numbers.length;i++){

            for (int j =0; j < numbers[i].length; j++){

                for (int k=0; k< numbers[i][j].length; k++){
                    System.out.println(numbers[i][j][k]); // numbers[1][1][1]
                }
            }
        }

    }
}
