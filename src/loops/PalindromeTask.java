package loops;
public class PalindromeTask {
    public static void main(String[] args) {
/*
            Task: Check if given String is Palindrome or not

            if it is palindrome print > "Given string is palindrome"
            if not print --> "Given string is not palindrome"

            palindrome means: if a string is same when you read it from reverse order

            ex: anna, ana, efe, civic ,... these are palindrome
 */
        String str = "anna";
        String reverse = "";

        for (int i =str.length()-1; i >=0; i-- ){

            reverse += str.charAt(i);

        }

        if (str.equals(reverse)){
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is NOT palindrome");
        }


    }
}
