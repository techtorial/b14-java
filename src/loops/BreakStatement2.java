package loops;

public class BreakStatement2 {
    public static void main(String[] args) {

        /*
        String str = "I did one of my hw by myself";
        as soon as you find letter 'y' --> print "I found it" and stop the loop
         */
        String str = "I did one of my hw by myself";

        for ( int i=0 ; i< str.length() ; i++ ){


            if ( str.charAt(i) == 'y'){
                System.out.println("I found it");
                break;
            }
            System.out.println(i);

        }

    }
}
