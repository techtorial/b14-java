package arrayPractice;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String str = "It is a hot Sunday";

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        String sentence1 = "I want to solve all java questions by myself";

        String str1 = "java";
        String[] sentenceParts = sentence1.split(str1);

        System.out.println(Arrays.toString(sentenceParts));

        String sentence2 = "I want to solve all java questions by myself. " +
                "That would be great moment. It would be also great if the room is cooler";

        // separate those three sentences from the given string

        String[] result1 = sentence2.split("\\.");
        System.out.println(Arrays.toString(result1));

        //  09.18.2022 >> "Happy Birth Day"
        String date = "09.18.2022";

        String[] splitDate = date.split("\\.");

        System.out.println(Arrays.toString(splitDate));


        if (splitDate[1].equals("18") && splitDate[0].equals("09")) {
            System.out.println("Happy Birthday");
        }

    }
}
