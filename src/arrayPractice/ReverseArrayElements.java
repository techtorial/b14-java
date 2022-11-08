package arrayPractice;
public class ReverseArrayElements {
    public static void main(String[] args) {
        /*
        String[] drinks = {"tea", "coke", "coffee", "water"};

        >> print every drink in reverse version from this array
	    >> aet, ekoc, ...
         */
        String[] drinks = {"tea", "coke", "coffee", "water"};

        for (String drink : drinks ){

            String reverse = "";

            for (int i= drink.length()-1; i >= 0 ; i-- ){

                reverse += drink.charAt(i);
            }

            System.out.println(reverse);
        }




    }
}
