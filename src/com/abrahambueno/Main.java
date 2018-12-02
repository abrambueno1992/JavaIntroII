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
		if ((topScore > secondTopScore) && (topScore < 100))
			System.out.println("Greater than second top score and less then 100");

		if ((topScore > 90) || (secondTopScore <= 90))
			System.out.println("One of these tests is true");

		int newValue = 50;
		if (newValue == 50)
			System.out.println("This is true");

		boolean isChar = false;
		if (isChar == true)
			System.out.println("This is not supposed to happen");

		isChar = true;
		boolean wasChar = isChar ? true : false;
		if (wasChar)
			System.out.println("wasChar is true");

		double doubleVar = 20;
		double secondDouble = 80;
		double productDoubles = (double) (doubleVar + secondDouble) * 25;
		double doubleRemainder = (double) (productDoubles % 40);
		if (doubleRemainder <= 20)
			System.out.println("Total was over the limit");
    }
}
