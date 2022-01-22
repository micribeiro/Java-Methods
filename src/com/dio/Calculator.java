package com.dio;

public class Calculator {
	
	public static void sum(double number1, double number2) {
		double result = number1 + number2;
		System.out.println("The sum result is " + result);
	}
	
	public static void subtraction(double number1, double number2) {
		double result = number1 - number2;
		System.out.println("The subtraction result is " + result);
	}
	
	public static void multiplication(double number1, double number2) {
		double result = number1 * number2;
		System.out.println("The multiplication result is " + result);
	}
	
	public static void division(double number1, double number2) {
		double result = number1 / number2;
		System.out.println("The division result is " + result);
	}
}
