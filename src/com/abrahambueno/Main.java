package com.abrahambueno;

public class Main {

    public static void printEqual(int one, int two, int three) {
        if (0 > one || 0 > two || 0 > three) {
            System.out.println("Invalid Value");
            return;
        }
        if ((one == two) && (one == three) && (two == three)) {
            System.out.println("All numbers are equal");
        } else if ((one != two) && (one != three) && (two != three)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }



    }

    public static void main(String[] args) {
        String resOne = getDurationString(65, 10);
        System.out.println(resOne);
        resOne = getDurationString(65);
        System.out.println(resOne);
    }

}
