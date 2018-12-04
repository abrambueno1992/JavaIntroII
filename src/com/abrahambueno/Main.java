package com.abrahambueno;

public class Main {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet <= 0 && inches <= 0) {
            return -1;
        }
        if (inches <= 0 && feet <= 0 || inches >= 12) {
            return -1;
        }
        double totalInches = (feet * 12) + inches;
        double totalCentimeters = totalInches * 2.54;
        return  totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches <= 0 || inches >= 12) {
            return -1;
        }
        int remainingInches = inches % 12;
        int feet = inches / 12;
        System.out.println("remaining inch, feet" + remainingInches + " " +feet);
        double centimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return  centimeters;
//        System.out.println("centimeters" + centimeters);
    }
    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(10);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(3, 10);
        System.out.println(result);
    }

}
