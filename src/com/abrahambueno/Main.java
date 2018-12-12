package com.abrahambueno;

public class Main {

    public static double area(double radius) {
        if (0 > radius) return -1.0;
        return 3.14159 * radius * radius;
    }

    public static double area(double x, double y) {
        if (0 > x || 0 > y) return -1.0;

        return x * y;
    }

    public static void main(String[] args) {
        String resOne = getDurationString(65, 10);
        System.out.println(resOne);
        resOne = getDurationString(65);
        System.out.println(resOne);
    }

}
