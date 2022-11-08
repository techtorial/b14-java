package RecapWithAhmet;

import java.util.Arrays;

public class StringAndMethods {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-Most of the technical questions are related with String
       2-What is the difference between (.)equals and (==)
       3-What is String and how do you declare?

       The big difference between .equals and == is all about the location and value comparison.
       .equals-->Is a way to compare two variables based on the "VALUES" of it.
          String name="Ahmet"                  name.equals(name1)-->True
          String name1=new String("Ahmet")
       (==) -->Is a way to compare two variables based on the "LOCATION" of it.
          String name="Ahmet"       (String Pool)name==name1(HEAP) -->false
          STring name1=new String("Ahmet")      name1==name2 -->false
          String name2=new String("Ahmet")     name==name3   -->true
          String name3="Ahmet"

       TIPS:Once you are explaining anything in IT. Try to use Technical terms.
       String name="AHMET"-->initializing->you are assigning a value
       Employee ahmet=new Employee()-->you are declaration the object.You do not assign any value

       *****REALLY IMPORTANT FOR AUTOMATION*********

       METHODS:* means Ahmet's favorite(suggestion)

    *  1-length()-->it counts the number of characters.It returns int
     * 2-equals()-->it compares the value of the variable.It returns boolean
       3-indexOf()->it gives you the index number of character.It returns int
    *  4-charAt()-->it gives you the character of the specific index.it returns char
     * 5-substring()-->it is a way to get a specific characters from the String.It returns String
       6-ToUpper/ToLower()-->It makes the characters upper or lower cases.it returns String
       7-concat()-->It is a way to add the two or more characters/words together.It returns String
     * 8-Split()-->It is a way to cut the specific characters/words from String.It returns String Array
    *  9-replace()-->It replaces the specific characters/words with the new value.It returns String
    **10-contains()-->It is a way to check the specific characters/words in the String.It returns boolean
      11-equalIgnoreCase()-->It is a way to compare two values without checking any sensitivity.It returns boolean
      12-StartsWith()-->It checks the word/character starts with specific given character.It returns boolean
      13-EndsWith()-->It checks the word/character ends with specific given character.It returns boolean
      14-ValueOf()-->It converting the value into the specific Object.It returns Object
***   15-trim()-->It removes the spaces from beginning and end.It returns String
     */
    public static void main(String[] args) {

        String str="Ahmet Loves Java";//initiliazed the variable //SP
        String str1=new String("Ahmet Loves Java"); //HEAP
        String str2="Ahmet Loves Java";
        String str3=new String("Ahmet Loves Java");
        String str4="Ahmet loves Java";
        Integer number=5;
        System.out.println(str.equals(str1));// true
        System.out.println(str==str1);//false
        System.out.println(str==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true
         str1=str2;
     //   String str="Ahmet Loves Java";//initiliazed the variable //SP
        System.out.println(str1==str2);
        System.out.println(str.length());//
        System.out.println(str.indexOf('a'));
        System.out.println(str.charAt(4));
        System.out.println(str.substring(7,10));
        System.out.println(str.indexOf('e',4));
        System.out.println(str.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat(" "+str2));
        String[] array=str1.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println(str1.replace("Java","Selenium"));
        System.out.println(str1.contains("Selenium"));
        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));//true
        System.out.println(str4.startsWith("A"));
        System.out.println(str4.startsWith("Ahm"));
        System.out.println(str4.endsWith("ava"));
        String str6="       Ahmet Loves java       ";
        System.out.println(str6);
        System.out.println(str6.trim());






    }
}
