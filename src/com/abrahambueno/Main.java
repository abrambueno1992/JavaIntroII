package com.abrahambueno;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32 bits
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    int myTotal = (myMinValue / 2);
	    System.out.println("myTotal = " + myTotal);

	    // byte has a width of 8 bits
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte) (myByteValue / 2);
	    System.out.println("myNewByteValue = " + myNewByteValue);

	    // short has a width of 16 bits
	    short myShortValue = 32767;
	    short myNewShortValue = (short) (myShortValue / 2);
	    System.out.println("myNewShortValue = " + myNewShortValue);

	    // long has a width of 64 bits
	    long myLongValue = 100L;
	    long longestValue = -9_223_372_036_854_775_807L;


    }
}
