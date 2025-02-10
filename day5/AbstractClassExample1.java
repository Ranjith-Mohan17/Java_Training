package com.celcom.day5;

abstract class Vehicle {
	void noOfEngine() {
		System.out.println("I have an Engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
	
}

class Car extends Vehicle {

	void noOfWheels() {
		System.out.println("Four Wheels");
	}
	void brandName() {
		System.out.println("Ford");
	}
	
	// It can also be overridden like below.
	/*Vehicle v = new Vehicle() {
		void noOfWheels() {
			System.out.println("Four Wheels");
		}

		void brandName() {
			System.out.println("Ford");
		}
	};*/
	
}
public class AbstractClassExample1 {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.noOfWheels();
		v.brandName();
	}

}
