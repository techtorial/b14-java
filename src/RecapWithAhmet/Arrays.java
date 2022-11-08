package RecapWithAhmet;

public class Arrays {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is the difference between Array and ArrayList?
      -Array is a storage for primitives and Objects
      -Array is fixed size
      -Array has MULTIDIMENSIONAL form.
      -Array has a length function -->NO methods
      -Array cannot be manipulated(you cannot play with it)

      ==>Write an implementation that initiliaze int array and find the:
        1-Sum of the even number
        2-SUm of the odd number
        3-Difference between them (the answer shouldn't minus)
        exp: {1,2,3,8,12,65,76,5,22,17} for each:

      -->Write an implementation that initiliaze int array and find the:
        1-The smallest number
        2-The largest number

       {100,300,200,450,350}
       sout("The smallest number is 100 and the largest number is 450) 7 min
       NOTE:You cannot use sort method.


     */
    public static void main(String[] args) {
//        int[] numbers=new int[5];//Array is fixed size
//        int[] numbers2={1,2,3,4,};
//        String[] names={"Ahmet","Mehmet","Mahmut","Merve"};
//
        int[] numbers = {1, 2, 3, 8, 12, 65, 20, 5, 22, 17};
        int evenNumbers = 0;
        int oddNumber = 0;

        for (int number : numbers) {//whenever you need to iterate all the values then use it
            if(number%2==0){
                evenNumbers+=number;
            }else{
                oddNumber+=number;
            }
        }

        int difference=(evenNumbers-oddNumber)>=0 ? evenNumbers-oddNumber :oddNumber-evenNumbers;
        System.out.println(evenNumbers-oddNumber);
        System.out.println(evenNumbers);
        System.out.println(oddNumber);
        System.out.println(difference);


//        -->Write an implementation that initiliaze int array and find the:
//        1-The smallest number
//        2-The largest number
//
//        {100,300,200,450,350}
//        sout("The smallest number is 100 and the largest number is 450) 7 min
//                NOTE:You cannot use sort method.

        int[] nums={100,300,200,450,350};
        int smallest=nums[3];
        int largest=nums[0];
        for(int num:nums){
            if(num<smallest){
                smallest=num;
            }else if(num>largest){
                largest=num;
            }
        }
        System.out.println("The smallest number is"+smallest+" and the largest number is " + largest);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }else if(nums[i]>largest){
                largest=nums[i];
            }
        }
    }
}
