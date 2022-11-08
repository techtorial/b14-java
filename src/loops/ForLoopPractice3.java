package loops;

public class ForLoopPractice3 {
    public static void main(String[] args) {

        /*
        String str = "Today is a rainy day"
        print every letter from given string by using for loop
         */
        String str = "Today is a rainy day";

        for ( int i=0    ;   i < str.length()  ;  i++  ){

            System.out.println(   str.charAt(i)   );

        }
        System.out.println("----------");
        /*
        String str = "Today is a rainy day"
        print only letter 'y' and 'Y' from given string by using for loop
         */
        String str1 = "Today is a rainy day";
        for ( int index = 0 ; index < str1.length() ; index++){

           if ( str1.charAt(index) == 'y' || str1.charAt(index)=='Y'){
               System.out.println(str1.charAt(index));
           }

        }
        System.out.println("----------------");

        /*
        String str = "Today is a rainy day"
       count and print the number of spaces in the given string by using for loop
       "there are ..4.. spaces in this string >> " str
         */

        String str2 = "Today is a rainy day ";

        int counter = 0;

        for ( int i =0; i <= str2.length()-1; i++){


            if ( str2.charAt(i)== ' ' ){
                counter++;
            }

        }
        System.out.println("There are "+counter+" spaces in the string: >> : "+str2);

        /*
        String str = "Today is a rainy day";

        print all characters one by one and separating them with comma on the same line -->  but spaces from given string
         */
        String str3 = "Today is a rainy day";
        for ( int a = 0     ; a < str3.length()   ; a++   ){

            if (  str3.charAt(a) != ' '){
                System.out.print( str3.charAt(a) + ", ");
            }

        }

    }
}
