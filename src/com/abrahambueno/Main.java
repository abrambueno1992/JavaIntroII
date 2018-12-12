package com.abrahambueno;

public class Main {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == false) {
            if (25 <= temperature && temperature <= 35) {
                return true;
            } else return false;
        } else {
            if (25 <= temperature && temperature <= 45) {
                return true;
            } else return false;
        }
    }

    public static void main(String[] args) {
        String resOne = getDurationString(65, 10);
        System.out.println(resOne);
        resOne = getDurationString(65);
        System.out.println(resOne);
    }

}
