package RecapWithAhmet;

public class SplitMethod {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-There some technical interview questions can be solved with Split method

     NOTE:Split method returns the "String Array"

     String str="Hello Java is so good"

     output:olleH avaJ si  os doog
            avaJ
            si
            os
            doog

            NOTE:PLease use split method and nested loop
     */
    public static void main(String[] args) {
        //Reading whole questions and understanding the question is your first step
        //Declare,initiliaze your variables
        String str="Hello Java is so good";
        String[]words=str.split(" ");//[Hello,java,is,so,good]

        for(String word:words){
            String reverse="";
            for(int i=word.length()-1;i>=0;i--){
                reverse+=word.charAt(i);
            }
            System.out.print(reverse+" ");
        }


    }
    }



