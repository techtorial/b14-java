package stringBuilder;

public class Practice1 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        System.out.println(builder);

        //  builder = "Test"; compile time error

        builder.append("Techtorial");
        System.out.println(builder);
        // mutability
        builder.append(builder).append("Academy");
        System.out.println(builder);
        builder.append(true);
        builder.append(234556);
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        builder1.append(2);
        builder1.append("Academy a");

        //charAt()
        System.out.println(builder1.charAt(1)); //

        // indexOf()
        System.out.println(builder1.indexOf("A"));

        System.out.println(builder1.indexOf("a", 4));

        //length()
        System.out.println(builder1.length());

        //substring()

        String str = builder1.substring(1);
        System.out.println(builder1);

        System.out.println(str);


        System.out.println(   builder1.substring(1,   builder1.indexOf(" "))      );


    }
}
