package arrayPractice;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {

        // show only words that has odd number of letters

        String str = "While scientists, geographers and astronomers regard the autumnal equinox " +
                "as \"mid-autumn\"[citation needed], some local cultures in high latitudes, with a" +
                " longer temperature lag, treat the equinox as the start of autumn.[2] In the " +
                "English-speaking world of high latitude countries, autumn traditionally began " +
                "with Lammas Day and ended around Hallowe'en, the approximate mid-points between " +
                "midsummer, the autumnal equinox, and midwinter. Meteorologists (and Australia[3][4] " +
                "and most of the temperate countries in the southern hemisphere)[5][6] use a definition" +
                " based on Gregorian calendar months, with autumn being September, October, and November" +
                " in the northern hemisphere,[7] and March, April, and May in the southern hemisphere." +
                "In the higher latitude countries in the Northern Hemisphere, autumn traditionally " +
                "starts with the September equinox (21 to 24 September)[8] and ends with the winter " +
                "solstice (21 or 22 December).[9] Popular culture in the United States associates Labor " +
                "Day, the first Monday in September, as the end of summer and the start of autumn; " +
                "certain summer traditions, such as wearing white, are discouraged after that date." +
                "[10] As daytime and nighttime temperatures decrease, trees change colour and then " +
                "shed their leaves.";

        String text = "";
        for (int i = 0; i < str.length(); i++) {

//            if ((str.charAt(i) == ' ' || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))) {
//                text += str.charAt(i);
//            }
            if ((str.charAt(i) == ' ' || Character.isAlphabetic(str.charAt(i)))) {
                text += str.charAt(i);
            }
        }
        System.out.println(text);


        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words) {

            if (word.length() % 2 == 1) {

                System.out.println(word);
            }
        }
    }
}
