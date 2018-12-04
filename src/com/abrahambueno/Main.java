package com.abrahambueno;

public class Main {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || seconds >= 60) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String result = hours + "h " + remainingMinutes + "m " + seconds + "s ";
        return result;
    }
    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
//        String result = hours + "h " + remainingMinutes + "m " + seconds + "s ";
//        return result;
    }

    public static void main(String[] args) {
        String resOne = getDurationString(65, 10);
        System.out.println(resOne);
        resOne = getDurationString(65);
        System.out.println(resOne);
    }

}
