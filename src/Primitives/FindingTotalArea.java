package Primitives;

public class FindingTotalArea {

    public static void main(String[] args) {

        /*
        find total area of the given shapes if:
        triangle: base * height / 2
            base =4.5, height = 6

        rectangle: length * width

           length = 11, width =7.8

         Show total area of these two shapes after calculating it
         */
        double base = 4.5, height = 6, length = 11, width = 7.8;

        double triangleArea = base * height / 2;

        double rectangleArea = length * width;

        double total = triangleArea + rectangleArea;
        System.out.println(total+" is total area of given shapes");

        // another way for solution

        System.out.println(  (base * height / 2 )   +   ( length * width) );

        System.out.println(  triangleArea + rectangleArea   );



    }
}
