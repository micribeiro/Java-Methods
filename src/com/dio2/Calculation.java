package com.dio2;

public class Calculation {
	
	public static void area(double side) {
		System.out.println("Square area: " + side*side);
	}
	
	public static void area(double side1, double side2) {
		System.out.println("Rectangle area: " + side1*side2);
	}
	
	public static void area(double higherBase, double lowerBase, double height) {
		System.out.println("Trapezium area: " + (((higherBase + lowerBase)*height)/2));
	}
	
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Lozenge area: " + ((diagonal1*diagonal2)/2));
	}

}
