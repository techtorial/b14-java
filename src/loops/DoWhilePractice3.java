package loops;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        /*
        String str = "tdfgr6fva*7A&!";

        count number of letters, number of digits, number of other symbols

        "there are ..9.. letters in given string"
        "there are ..2.. digits in given string"
        "there are ..3.. other symbols in given string"
         */
        String str = "7Abcvfdgh&!5";

        int index = 0, letterCounter = 0, digitCounter =0, symbolCounter = 0;
        String letters = "";
        String digits = "";

        do {

            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z' || str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {

                letterCounter++;
                letters += str.charAt(index);

            }else if(str.charAt(index) >= '0' && str.charAt(index) <= '9'){
                digitCounter++;
                digits += str.charAt(index);

            }else {
                symbolCounter++;
            }


            index++;
        } while (index < str.length());

        System.out.println("there are " + letterCounter + " letters in given string");

        System.out.println("there are " + digitCounter + " digits in given string");
        System.out.println("there are " + symbolCounter + " symbols in given string");
        System.out.println(letters);
        System.out.println(digits);
    }
}
