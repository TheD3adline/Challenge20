package com.company;

public class Mixer {

    private static String myWord;
    private static int length;
    private static String tempFirst;
    private static String tempLast;
    private static String tempRest;


    public static String firstLast(String myWord) {
        Mixer.myWord = myWord;
        Mixer.length = Mixer.myWord.length() - 1;
        Mixer.tempFirst = Mixer.myWord.substring(0, 1);
        Mixer.tempLast = Mixer.myWord.substring(length);
        Mixer.tempRest = Mixer.myWord.substring(1, length);
        return tempLast + tempRest + tempFirst;
    }

    public static String half(String myWord) {
        Mixer.myWord = myWord;
        Mixer.length = Mixer.myWord.length() - 1;
        Mixer.tempFirst = Mixer.myWord.substring(0, length / 2 + 1);
        Mixer.tempLast = Mixer.myWord.substring(length / 2 + 1, length + 1);
        return tempLast + tempFirst;
    }

    public static String capitalise(String myWord) {
        Mixer.myWord = myWord;
        Mixer.length = Mixer.myWord.length() - 1;
        Mixer.tempFirst = Mixer.myWord.substring(0, length - 2);
        Mixer.tempLast = Mixer.myWord.substring(length - 2);
        return tempFirst + tempLast.toUpperCase();
    }
}
