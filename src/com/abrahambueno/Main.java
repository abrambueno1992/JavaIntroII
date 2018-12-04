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
    public static void main(String[] args) {

    }

}
