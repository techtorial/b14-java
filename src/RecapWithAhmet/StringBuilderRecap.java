package RecapWithAhmet;

public class StringBuilderRecap {

    /*
    Possible Interview Questions:
      1-What is the difference between String Builder and String?
        They are both useful for the project in terms of mutability and immutability
        *String is immutable*
        *StringBuilder is mutable*
        *String Builder and String have some different methods like Append,reverse


      2-What is the difference between String Builder and String Buffer?
        *StringBuffer and HashTable are synchronized
        *Map,List,Set,String,StringBuilder are non-synchronized

        NOTE:Mutable is all about the giving functions/actions/manipulations WITHOUT "RE-ASSIGNING"
        exp: please check the practice down for String Builder
        NOTE2:Immutability is all about the giving functions/actions/manipulations WITH "RE-ASSIGNING"
        exp:please check the practice down for String
        NOTE3:PassByValue and PassByReference is all about the way that you pass the data
         -->If you call the method and pass the value directy (stringbuilderrecap.run("AHMET").It means you are passing by VALUE
         -->If you call the method and pass the value with the reference:
             String name="KEMAL"
             stringbuilderrecap.run(name);// it means you are passing by REFERENCE
     */
    public void run(String name1){
        String name=name1;
        System.out.println(name);
    }
    public void run1(String name2){
        String name=name2;
        System.out.println(name);
    }

    public String brand; //instance variable

    public static void main(String[] args) {
        String name="Ahmet";
        StringBuilder str=new StringBuilder("Ahmet");
        name.toUpperCase().replace("H","*");//A*MET
        System.out.println(name);
        name= name.toUpperCase().replace("H","*");
        System.out.println(name);
        str.append("Mehmet").append("Mahmut").reverse();//AhmetMehmet -->tumhaMtemheMtemHa
        System.out.println(str);
        StringBuilderRecap stringBuilderRecap=new StringBuilderRecap();
        String name2="Mehmet";
        stringBuilderRecap.run(name2); //pass by reference
        stringBuilderRecap.run1("Kemal"); //pass by value
    }


}
