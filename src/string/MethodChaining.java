package string;

public class MethodChaining {
    public static void main(String[] args) {

        String flower = "Rose";

        flower = flower.concat(" can be in different colors");

        System.out.println(flower);

        /*
        subString, trim, replace, upper/lower, concat
         */
        char letter = flower.substring(5).trim().replace('i','#').toUpperCase().concat(" as well as other flowers").charAt(0);
        System.out.println(letter);



    }
}
