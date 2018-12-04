package com.abrahambueno;

public class Main {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int XX = kiloBytes;
        int YY = (int) XX / 1024;
        int ZZ = (int) XX % 1024;
        System.out.println(XX + " KB = " + YY + " MB " + "and " + ZZ + " KB");
    }
    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (hourOfDay < 8 && barking || hourOfDay > 22 && barking) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double difference = (double) (first - second);
        if (-0.0009 < difference && difference < 0.0009) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean hasEqualSum(int one, int two, int three) {
        if (one + two == three) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int one, int two, int three) {
        boolean first = false;
        boolean second = false;
        boolean third = false;
        if (13 <= one && one <= 19) {
            first = true;
            return first;
        };
        if (13 <= two && two <= 19) {
            second = true;
            return second;
        }
        if (13 <= three && three <= 19) {
            third = true;
            return third;
        };
        return false;

    }
    public static void main(String[] args) {

    }

}
