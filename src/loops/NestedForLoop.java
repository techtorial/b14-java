package loops;

public class NestedForLoop {
    public static void main(String[] args) {

        /*
        you want to create java code that will show time in hours and minutes
        lets do 24 hour range
        1:0
        1:1
        1:2
        1:3
        ...
        ..
        1:59
        2:0
        ...

        hour, minutes and seconds
         */

        HOUR:
        for (int hour = 0 ;  hour<24; hour++ ){

                if (hour == 1)continue;

            MIN:
            for (int min =0 ; min <60; min++){
                if (min > 10 && min < 20 )continue;
               for (int sec =0; sec <60; sec++){
                       // if (sec > 10)break;
                   System.out.println( hour +" : "+min+" : "+sec);
               }
            }
        }
//        System.out.println("============");
//
//        for (int hour = 23 ;  hour>=0; hour-- ){
//
//            for (int min = 59 ; min >=0; min--){
//
//                for (int sec =58; sec >= 0; sec--){
//
//                    System.out.println( hour +" : "+min+" : "+sec);
//                }
//            }
//
//        }

    }
}
