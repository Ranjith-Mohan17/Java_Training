package com.celcom.day2;

public class TypesOfMethods {
	static int a = 10;
	void display() {
		System.out.println(a);
	}
	static void show() {
		System.out.print(a);
	}
	public static void main(String args[] ) {
		TypesOfMethods obj = new TypesOfMethods();
		obj.display();
		TypesOfMethods.show();
	}
}
