package RecapWithAhmet;

public class Exception {
    /*
    Possible interview Questions:
     1-How do you handle the exceptions?
      -->We can handle the exception with TRY AND CATCH , THROWS.
     2-Can you use more than one catch block? How about try block?
      -->We can use as many as catch block after try.
      -->Try block can be used only once
     3-What do you know about final,finalize,finally ? (THE MOST COMMON)
      -->Final-->Is a keyword to make the variable or method unchangeable(last version)
      -->Finalize-->Is a method which works with Garbage collector to make sure it is manually
      worked(SYSTEM.GC)
      -->Finally-->Is a block that comes after try and catch block to do final execution
        -->Example:I have to connect to the database before the codes are executed then I must
        disconnect from database for security purpose.What I do is:
         -->I connect the database
         -->The codes are executed
         -->Under finally block { Database.Disconnect) -->It will be executed NO MATTER WHAT
         even if your tests fail.
     4-What is difference between Throw and Throws?
        -->Both throw and throws are the conceps of exception handling in which throws I used to
        explicitly(out of block) throw an exception from a method or any block of code
        -->public void exception() throws ArithmeticOperator
        -->public void exception2(){
           new throw ArithmeticOperator}
        **WHILE THROWS ARE USED NEXT TO THE METHOD SIGNATURE(OUTSIDE OF THE BLOCK)
        **THROW IS USED INSIDE OF THE BLOCK
     */
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
