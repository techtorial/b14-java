package exceptions;

public class Practice1 {

    public static void main(String[] args) {

        String number = "2210200M";

        // convert the given string to integer
        // need to parse the string
        // Integer.parseInt(number); // NumberFormatException

        try {

            System.out.println("First type of exception");
            Integer.parseInt(number); // NumberFormatException
            int result = 5 / 0; // ArithmeticException
            System.out.println(result);
            System.out.println("second type of exception");

        } catch (NumberFormatException formatException) {

            System.out.println( formatException.getStackTrace()  );
            System.out.println("I caught Number format exception");


        } catch (ArithmeticException arithmeticException) {
            System.out.println("I caught arithmetic exception");
        } catch (RuntimeException runtimeException) {

            //System.out.println(runtimeException.getCause());
            runtimeException.printStackTrace();
            //  System.out.println("Runtime Exception");
        } finally {
            System.out.println("This is finally block");
//        }finally{
//            compile time error
        }


        System.out.println(number + 200); //

        System.out.println("working on exceptions");


    }
}
