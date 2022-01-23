package com.dio3;

public class Calculation {

	public static double area(double side) {
		return side*side;
	}
	
	public static double area(double side1, double side2) {
		return side1*side2;
	}
	
	public static double area(double higherBase, double lowerBase, double height) {
		return (((higherBase + lowerBase)*height)/2);
	}
	
	public static float area(float diagonal1, float diagonal2) {
		return ((diagonal1*diagonal2)/2);
	}
	
}
