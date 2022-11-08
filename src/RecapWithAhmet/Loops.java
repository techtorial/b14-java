package RecapWithAhmet;

import java.util.Scanner;

public class Loops {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Many technical interview questions they require to use loops to solve
    the questions.

     LOOPS:It is a way to iterate(circles/cycles) the elements(values/variables
     one by one).In other words: it is a cycle for the repetitive actions.

     TYPES OF LOOPS:
      1-Do While
      2-While
      3-For
      4-For Each *****

      DO While:It executes the code 1 time no matter what.Whenever you need to
      execute the code and want users decide when it is going to end. Then Use
      do while

      While:Is a way to iterate the elements.The big difference between
      while loop and do while is that to be able to iterate the elements
      you Must check the condition first unlike DO while.

      HOMEWORK:
      USING SCANNER: Ask user to enter one string value with 3 words
      1-Print first letter of Each Word
      2-Print last letter of each word's index number
      3-Print the sum of the last letter of each word's index number
      4-Print the last letter of each word

      CLUES:I would use if condition for charAt and ' '

      EXAMPLE:"JAVA STRING TEST"
      //output:JST
      //output:31015
      //output:28(3+10+15)
      //output:AGT

      NOTE:YOu can use either one or two loops.

 WHILE --> 1-Ask the user put an int number and reverse the int number
       -->2-Multiply the digits
       -->NOTE:in 1 loop
       -->exp:12345  --> 1-54321  2- 120


     */
    public static void main(String[] args) {
        int choice;

//        do {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("1-Continue\n 2-Exit");
//            choice = scan.nextInt();
//        } while (choice != 2);

/*
WHILE --> 1-Ask the user put an int number and reverse the int number
       -->2-Multiply the digits
       -->NOTE:in 1 loop
       -->exp:12345  --> 1-54321  2- 120

       1=This task is asking me to reverse the numbers(DO i Know how to reverse YES
       2=Multiply these digits(Do i know how to implement *)
       3-How am I going to implement
 */
//        System.out.println("Please provide a number");
//        Scanner scan=new Scanner(System.in);
        int number=54321;
        String reverse="";
        int multiply=1;//for debugging

        while(number!=0){
            //12345 --> %10
            int digit=number%10; //5  //4 //3 // 2//  //0
            multiply*=digit; //multiply=multiply*digit
            reverse+=digit;
            number/=10; //1234
        }
        System.out.println(reverse);
        System.out.println(multiply);



    }
}
