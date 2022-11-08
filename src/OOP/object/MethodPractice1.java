package OOP.object;

public class MethodPractice1 {

    /*
    create a method that will find  sum of numbers in an array
    it will take an array as a parameter
    return type is double
    do not print out anything
     */


    public double sum(int[] numbers) {

        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodPractice1 obj = new MethodPractice1();
        int[] data = {5, 10, 5, 4, 3};
        double r = obj.sum(data);
        System.out.println(r);

        System.out.println(obj.sum(data));

        int[] myData = {5, 10};
        MethodPractice1 myObject = new MethodPractice1();

        r = myObject.sum(myData);
        System.out.println(r);
    }


}
