package com.abrahambueno;

public class Main {

    public static void printYearsAndDays(long minutes) {
        if (0 > minutes) System.out.println("Invalid Value");
        long day = 60 * 24;
        long year = 365;
        long days = (long) minutes / day;
        int years = (int) (days / year);
        long remDays = (long) ((days % year));

        if (minutes >= 0) {
            System.out.println(minutes + " min = " + years + " y and " + remDays + " d");
        }

    }

    public static void main(String[] args) {
        String resOne = getDurationString(65, 10);
        System.out.println(resOne);
        resOne = getDurationString(65);
        System.out.println(resOne);
    }

}
