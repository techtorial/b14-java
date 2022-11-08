package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {

        // use String to print alphabet
        // abcdefghi....
        String str = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            str += ch;
            System.out.println(str);
        }
        // System.out.println(str);
        System.out.println("---------");

        StringBuilder builder = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            builder.append(ch);
            System.out.println(builder);
        }

        //===================
        StringBuilder stringBuilder = new StringBuilder("water");

        //insert
        stringBuilder.insert(3, "fresh");
        System.out.println(stringBuilder);
        stringBuilder.insert(stringBuilder.indexOf("f"), " ");
        System.out.println(stringBuilder);

        //stringBuilder.insert(15, "***");// StringIndexOutOfBoundsException

        String str1 = stringBuilder.substring(0, 4);
        System.out.println(str1);
        // delete()

        stringBuilder.delete(0, 4);
        System.out.println(stringBuilder);

        //  deleteCharAt()
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        String str3 = "inter**w*t*y*i***********";
        System.out.println(    starRemover(str3)   );

        System.out.println(    starRemover2(str3)   );
    }
    // i*n*t*e*r*v*i*e*w
        /*
        create a method that takes a String parameter
        it will delete '*' and return given string as String builder object
         */
    static public StringBuilder starRemover(String str){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i< str.length(); i++){

            if ( str.charAt(i)!= '*'){
                builder.append(str.charAt(i));
            }

//            if (builder.charAt(i) =='*'){
//                builder.deleteCharAt(i);
//
//            }
        }
        return builder;

    }
    static public StringBuilder starRemover2(String str){
        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i< builder.length(); i++){  // i**n*t*e*r*v*i*e*w

            if (builder.charAt(i) =='*'){
                builder.deleteCharAt(i);
                i--;
            }

        }
        return builder;

    }


}
