package com.abrahambueno;

public class Main {

    public static void main(String[] args) {
    	// width of int = 32 bits (4 bytes).
    	int myIntValue = 5 / 3;

    	// width of float = 32 bits (4 bytes)
    	float myFloatValue = 5f / 3f;

    	// width of double = 64 bits (8 bytes)
    	double myDoubleValue = 5d / 3;
    	System.out.println("myIntValue = " + myIntValue);
    	System.out.println("myFloatValue = " + myFloatValue);
    	System.out.println("myDoubleValue = " + myDoubleValue);

    	double wLb = 3;
    	double wKg = 3 * 0.45359237;
    	System.out.println(wKg);


    }
}
