package com.celcom.day3;

public class ThisKeywordExample2 {
	ThisKeywordExample2() {
		this("Sunder");
		System.out.println("A");
	}
	ThisKeywordExample2(String name) {
		this(10);
		System.out.println("B");
	}
	ThisKeywordExample2(int a) {
		System.out.println("C");
	}
	void display(String name) {
		System.out.print(name);
	}
	
	public static void main(String args[]) {
		ThisKeywordExample2 obj = new ThisKeywordExample2();
		obj.display("Partha");
	}
}
