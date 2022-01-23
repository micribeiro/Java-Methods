package com.dio3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Return Exercise");
		
		double squareArea = Calculation.area(3);
		System.out.println("Square area: " + squareArea);
		
		double rectangleArea = Calculation.area(5, 5);
		System.out.println("Rectangle area: " + rectangleArea);
		
		double trapeziumArea = Calculation.area(8, 7, 6);
		System.out.println("Trapezium area: " + trapeziumArea);
		
		float lozengeArea = Calculation.area(5f, 5f);
		System.out.println("Lozenge area: " + lozengeArea);

	}

}
