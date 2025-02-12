package com.celcom.day7;

interface MyInterface {
	void display();
}

public class AnonymousInnerClass implements MyInterface {
	public void display() {
		System.out.println("Anonymous Inner Class");
	}

	public static void main(String args[]) {
		AnonymousInnerClass obj = new AnonymousInnerClass();
		obj.display();
		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		obj1.display();
		// Lambda Expression
		MyInterface obj2 = () -> System.out.println("Display");
		obj2.display();

	}
}
