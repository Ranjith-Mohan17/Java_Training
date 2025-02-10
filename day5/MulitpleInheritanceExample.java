package com.celcom.day5;

interface Interface1 {
	
	int a = 10; // by default public, static and final
	
}

interface Interface2 {
	
	int a = 20;
	
}

interface Interface3 extends Interface1, Interface2{
	
	void addition();
}

class Addition implements Interface3 {
	
	public void addition() {
		System.out.println("The Addition is " + (Interface1.a + Interface2.a));
	}
}
public class MulitpleInheritanceExample {
	public static void main(String args[]) {
		Addition add = new Addition();
		add.addition();
		
	}
}
