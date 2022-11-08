package string;

public class Practice {

    public static void main(String[] args) {

        String name = "Fluffy";

        String text = new String("Fluffy");

        System.out.println(name);
        System.out.println(text);

        System.out.println(name == text);

        name = "Saturday";
        System.out.println(name);

        name = name + " is not here"; // concatenation, meaning adding more string to the existing value
        System.out.println(name);

        String word = "good" + " " + "morning"; // concatenation, meaning adding more string to the existing value

        System.out.println(word);

        word = word.concat(" everyone"); // good morning everyone

        System.out.println(word);

        System.out.println(word.concat(", it is good to see you")); // showing everything just one time

        System.out.println(word); //

        word += " How are you?"; // good morning everyone + How are you?
        System.out.println(word);

        word = "java";

        word = word.concat(" is easy");

        System.out.println(word);
        word = word.concat("123");

        word = word + 123;
        System.out.println(word);

        word = "java";
        String word2 = "selenium";

        String course = word + word2;
        System.out.println(course);

        System.out.println(5+9); // 14
        System.out.println("t"+"r");  // tr
        System.out.println("t"+"r"+6); //tr6
        System.out.println(1+5+"t"+"c"); //6tc
        System.out.println("t"+"c"+1+5);//tc15

        String str = "1";

        str +="2";

        str += 2; // --> str = str + 2;
        System.out.println(str);



    }
}
