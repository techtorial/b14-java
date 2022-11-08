package RecapWithAhmet;

public class JavaPrimitiveDataAsciiTable {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is Java and what is JDK,JVM,JRE? (indian style)
    2-What do you know about JDK,JVM,JRE?(american style)
      TIPS:Before Interview check the name of interviewers
      to make yourself ready for the syle questions?

      *Java is a programming language.
      *I Use the components of Java a lot during implementation:
        JDK-->Is a java development kit that has some libraries which
        supports the application development.
        JVM-->Is a virtual machine which is responsible for converting
        the Byte code to Binary code(1,0)
        JRE-->Is a java runtime Environment.***It is responsible for
        ***EXECUTION***.

       PRIMITIVE DATA:
       *Whole Numbers:    *Decimal Numbers:   Condition:     Char:
        -int                -float (f)         -boolean     char
        -byte               -double (d)
        -short
        -long(l)

       *ASCII TABLE:Is a table that contains all the characters,numbers,
       letters,symbols etc..

       short a=5;
       short b=6;
       short c=a+b-2
       sout(c);

     */
    public static void main(String[] args) {
        char letter=65;
        char letter2='g';
        int number=(char)('g');
        System.out.println(number); //103
        System.out.println(letter2-letter);//38
        System.out.println(letter2);//g
        System.out.println(letter);//A
    }
}
