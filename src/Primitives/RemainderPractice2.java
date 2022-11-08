package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {

        // find the sum of digits from given number
        //created 'originalNumber' variable to keep original value for the given number
        int number = 567, originalNumber = number;
        //finding remainder from 123 by dividing 10 which is 3(last digit)
        int digit1 = number % 10;

        //modifying number dividing by 10. which is giving 12, assigning back to number
        number = number / 10;

        int digit2 = number % 10;//finding remainder from 12 by dividing 10 which is 2(last digit)

        number = number / 10;//modifying number dividing by 10. which is giving 1  assigning back to number

        int digit3 = number % 10;//finding remainder from 1 by dividing 10 which is 1(last digit)


        // finding total of all digits and saving it in to 'sum' variable
        int sum = digit1+ digit2+digit3;

        System.out.println("The sum of the digits in number " + originalNumber +  " is "+sum);
    }
}
