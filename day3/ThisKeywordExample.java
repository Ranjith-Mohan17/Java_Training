package com.celcom.day3;

public class ThisKeywordExample {
	String name;
	ThisKeywordExample() {
		this("Ranjith");
	}
	ThisKeywordExample(String name) {
		this.name = name;
		this.display();
	}
	void display() {
		System.out.println("The Name is " + name);
	}
	public static void main(String args[]) {
		ThisKeywordExample obj = new ThisKeywordExample();
	}
}
