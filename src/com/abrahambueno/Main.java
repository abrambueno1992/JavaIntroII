package com.abrahambueno;

public class Main {

    public static void main(String[] args) {
    	int result = 1 + 2;
    	System.out.println("1 + 2 = " + result);

		int previousResult = result;

		result = result - 1;
		System.out.println("Previous result = " + previousResult);
		System.out.println("New result = 3 - 1 =" + result);

		previousResult = result;

		result = previousResult * 10;
		System.out.println(previousResult + " * 10 =" + result);

		previousResult = result;

		result = result / 5;
		System.out.println(previousResult + " / 5 =" + result);

		previousResult = result;

		result = result % 3;
		System.out.println(previousResult + " % 3 =" + result);

		previousResult = result;

		result = result + 1;
		System.out.println("Result is now " + result);

		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("It is not an alien");

		int topScore = 92;
		if (topScore < 100)
			System.out.println("You got the high score!");

		int secondTopScore = 60;
		if (topScore > secondTopScore && topScore < 100)
			System.out.println("Greater than second top score and less then 100");
    }
}
