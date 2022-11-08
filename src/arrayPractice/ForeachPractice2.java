package arrayPractice;

public class ForeachPractice2 {
    public static void main(String[] args) {

        String[] colors = {"red", "blue", "pink", "violet", "yellow"};

        // print every color as upper case and put a '*' after it >> RED*, BLUE* ...

        for (String color : colors) {

            System.out.println( color.toUpperCase().concat("*"));
          //  System.out.println( colors[1]); //blue
        }

        System.out.println( colors[1]); //blue
    }
}
