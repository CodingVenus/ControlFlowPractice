package com.teksystems.conditionalflow;

import java.util.Scanner;

public class ConditionalPractice {

	// 1. Write a program that declares 1 integer variable x, and then assigns 7 to
	// it.
	// Write an if statement to print out “Less than 10” if x is less than 10.
	// Change x to equal 15, and notice the result (console should not display
	// anything).

	public void printIfStatement1() {
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		}

		x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		}

	}

	// 2. Write a program that declares 1 integer variable x, and then assigns 7 to
	// it.
	// Write an if-else statement that prints out “Less than 10” if x is less than
	// 10, and “Greater than 10” if x is greater than 10.
	// Change x to 15 and notice the result.

	public void printIfStatement2() {
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10) {
			System.out.println("Greater than 10");
		}

		x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10) {
			System.out.println("Greater than 10");
		}

	}

	// . Write a program that declares 1 integer variable x, and then assigns 15 to
	// it. Write an if-else-if statement that prints out “Less than 10” if x is less
	// than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
	// “Greater than or equal to 20” if x is greater than or equal to 20. Change x
	// to 50 and notice the result.

	public void printIfStatement3() {
		int x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Greater than 10");
		} else if (x >= 20) {
			System.out.println("Greater than or equal or to 20");
		}

		x = 50;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else if (x >= 20) {
			System.out.println("Greater than or equal to 20");
		}
	}

	// 4. Write a program that declares 1 integer variable x, and then assigns 15 to
	// it. Write an if-else statement that prints “Out of range” if the number is
	// less than 10 or greater than 20 and prints “In range” if the number is
	// between 10 and 20(including equal to 10 or 20). Change x to 5 and notice the
	// result.

	public void printIfStatement4() {
		int x = 15;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		} else if (x >= 10 && x <= 20) {
			System.out.println("Within Range");
		}
		x = 5;
		x = 15;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		} else if (x >= 10 && x <= 20) {
			System.out.println("Within Range");
		}
	}

	// Write a program that uses if-else-if statements to print out grades A, B, C,
	// D, F according to the following criteria:
	// A: 90-100
	// B: 80-89
	// C: 70-79
	// D: 60-69
	// F: <60

	// Use the Scanner class to accept a number score from the user to determine the
	// letter grade. Print out “Score out of range” if the score is less than 0 or
	// greater than 100.

	public void printIfStatement5() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your score?");
		int x = scanner.nextInt();
		

		if (x >= 90 && x <= 100) {
			System.out.println("Grade: A");
		} else if (x >= 80 && x < 90) {
			System.out.println("Grade: B");
		} else if (x >= 70 && x < 80) {
			System.out.println("Grade: C");
		} else if (x >= 60 && x < 70) {
			System.out.println("Grade: D");
		} else if (x < 60) {
			System.out.println("Grade: F");
		} else {
			System.out.println("Score is out of range");
		} 
	}

	// Write a program that accepts an integer between 1 and 7 from the user. Use a
	// switch statement to print out the corresponding weekday. Print “Out of range”
	// if the number is less than 1 or greater than 7. Do not forget to include
	// “break” statements in each of your cases.

	public void printSwitchStatement() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number between 1 and 7:");
		int x = scanner.nextInt();

		
		switch (x) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of Range");

		}
	}

	/*
	 * Create a program that lets the users input their filing status and income.
	 * Display how much tax the user would have to pay according to status and
	 * income. // The U.S. federal personal income tax is calculated based on the
	 * filing status and taxable income. // There are four filing statuses: Single,
	 * Married Filing Jointly, Married Filing Separately, and Head of Household. //
	 * The tax rates for 2009 are shown below.
	 */

	public void calculateTaxPayment() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your filing status: ");

		String filingStatus = input.nextLine().toLowerCase();

		System.out.println("Enter your income: ");

		int income = input.nextInt();

		double taxRate = 0;

		// single
		if (filingStatus.equals("single")) {
			if (income >= 0 && income <= 8350) {
				taxRate = 0.10;
			} else if (income >= 8351 && income <= 33950) {
				taxRate = 0.15;
			} else if (income >= 33951 && income <= 82250) {
				taxRate = 0.25;
			} else if (income >= 82251 && income <= 171550) {
				taxRate = 0.28;
			} else if (income >= 171551 && income <= 372950) {
				taxRate = 0.33;
			} else if (income >= 372951) {
				taxRate = 0.35;
			}
		} else if (filingStatus.equals("married filing jointly")) {

			if (income >= 0 && income <= 16700) {
				taxRate = 0.10;
			} else if (income >= 16701 && income <= 67900) {
				taxRate = 0.15;
			} else if (income >= 67901 && income <= 137050) {
				taxRate = 0.25;
			} else if (income >= 137051 && income <= 208850) {
				taxRate = 0.28;
			} else if (income >= 208851 && income <= 372950) {
				taxRate = 0.33;
			} else if (income >= 372951) {
				taxRate = 0.35;
			}

		} else if (filingStatus.equals("married filing separately")) {

			if (income >= 0 && income <= 8350) {
				taxRate = 0.10;
			} else if (income >= 8351 && income <= 33950) {
				taxRate = 0.15;
			} else if (income >= 33951 && income <= 68525) {
				taxRate = 0.25;
			} else if (income >= 68526 && income <= 104425) {
				taxRate = 0.28;
			} else if (income >= 104426 && income <= 186475) {
				taxRate = 0.33;
			} else if (income >= 186476) {
				taxRate = 0.35;
			}
		} else if (filingStatus.equals("head of household")) {

			if (income >= 0 && income <= 11950) {
				taxRate = 0.10;
			} else if (income >= 11951 && income <= 45500) {
				taxRate = 0.15;
			} else if (income >= 45501 && income <= 117450) {
				taxRate = 0.25;
			} else if (income >= 117451 && income <= 190200) {
				taxRate = 0.28;
			} else if (income >= 190201 && income <= 372950) {
				taxRate = 0.33;
			} else if (income >= 372951) {
				taxRate = 0.35;
			}

		}
		double taxPayment = income * taxRate;
		System.out.println();

		System.out.println("Your tax amount is: " + taxPayment);

	

	}

}
