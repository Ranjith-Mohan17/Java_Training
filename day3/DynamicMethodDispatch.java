package com.celcom.day3;

//Dynamic Method Dispatch (DMD)
class Dmd1 {
	void display() {
	}
}

class Dmd2 extends Dmd1 {
	void display() {
		System.out.println("It is Dynamic Method Dispatch");
	}
}

public class DynamicMethodDispatch {
	public static void main(String args[]) {
		Dmd1 obj = new Dmd2();
		obj.display();

	}
}
