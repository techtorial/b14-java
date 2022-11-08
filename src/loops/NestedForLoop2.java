package loops;

public class NestedForLoop2 {

    public static void main(String[] args) {
        /*

        print out months for the years from 2020 to 2023 as in following format

        2020 --> 1,2,3,4,5,6...12
        2021 --> 1,2,3,........12
        ...
         */
        /*
        2020 --> 1 Jan --> 2 Feb --> 3 March--> 4 --> 5 --> 6 --> 7 --> 8 --> 9 --> 10 --> 11 --> 12
        2021 --> 1 Jan --> 2 Feb --> 3 --> 4 --> 5 --> 6 --> 7 --> 8 --> 9 --> 10 --> 11 --> 12
        2022 --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> 8 --> 9 --> 10 --> 11 --> 12
        2023 --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> 8 --> 9 --> 10 --> 11 --> 12
         */
        for (int y=2020; y<=2023;y++){
            System.out.print(y);
            for (int m=1; m<=12;m++){
                    switch (m){

                        case 1:  System.out.print(" --> "+m + " Jan");break;
                        case 2: System.out.print(" --> "+m + " Feb");
                    }

            }
            System.out.println();


        }

    }
}
