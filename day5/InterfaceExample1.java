package com.celcom.day5;

interface VehiclePlan1 {

	void noOfEngine();

	void brandName();

}

interface VehiclePlan2 {

	void noOfEngine();

	void brandName();

}

// It wont allows to create object for an abstract class.
class Bike implements VehiclePlan1, VehiclePlan2 {

	public void noOfEngine() {
		System.out.println("I have an Engine");
	}

	public void brandName() {
		System.out.println("Ford");
	}

}

public class InterfaceExample1 {
	public static void main(String[] args) {
		Bike v = new Bike();
		v.noOfEngine();
		v.brandName();
	}

}
