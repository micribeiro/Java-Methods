package com.dio;

public class Main {

	public static void main(String[] args) {
		//Calculator
		System.out.println("Exercise: Calculator");
		Calculator.sum(4, 4);
		Calculator.subtraction(10, 12);
		Calculator.multiplication(3, 9);
		Calculator.division(99, 11);
		
		//Message
		System.out.println("\nExercise: Message");
		Message.getMessage(0);
		Message.getMessage(13);
		Message.getMessage(23);
		
		//Loan
		System.out.println("\nExercise: Loan");
		Loan.calculate(1000, Loan.getTwoInstallments());
		Loan.calculate(1000, Loan.getThreeInstallments());
		Loan.calculate(1000, 5);

	}

}
