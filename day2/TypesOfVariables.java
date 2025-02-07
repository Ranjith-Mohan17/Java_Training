package com.celcom.day2;

public class TypesOfVariables {
	int b = 20; //Instance or Object variable
	static int c = 17; //Static variable
	
	public static void main(String args[]) {
		int a = 10; //Local Variable
		System.out.println(a);
		
		TypesOfVariables obj1 = new TypesOfVariables();
		System.out.println(obj1.b);
		
		System.out.println(c);
	}
}
