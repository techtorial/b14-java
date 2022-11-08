package stringBuilder;

public class Task {
    /*
    create a method that will take a StringBuilder as parameter
    it will find the sum of digits from the builder object
    it will return the sum as an integer Object
      --> 6+8+6 ==> 20
     */

    public static Integer sumFinder(StringBuilder builder){

        Integer sum = 0;

        for (   int i=0; i< builder.length(); i++){

            if (   Character.isDigit( builder.charAt(i)  )){

           // sum +=    Integer.parseInt(       String.valueOf(  builder.charAt(i)     ));

                sum +=    Integer.parseInt(      ""+   builder.charAt(i)  );
              //  sum += builder.charAt(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        StringBuilder abc = new StringBuilder("TRu6FH8N6*L");
        System.out.println(  sumFinder(abc)  );
    }
}
