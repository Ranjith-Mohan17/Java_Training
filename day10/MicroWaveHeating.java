package com.celcom.day10;

import java.util.Scanner;

class Microwave {
	int item;
	float seconds;
	String foodName;
	String microwaveModel;

	public Microwave(int item, float seconds, String foodName, String microwaveModel) {
		this.item = item;
		this.seconds = seconds;
		this.foodName = foodName;
		this.microwaveModel = microwaveModel;
	}

	public float cook() {
		float totalTime = 0;
		if (item == 1) {
			totalTime = seconds;
		} 
		else if (item == 2) {
			totalTime = seconds + (seconds / 2);
		} 
		else {
			totalTime = seconds * 2;
		}

		if (foodName.equals("pasta")) {
			totalTime += ((totalTime * 10) / 100);
		} 
		else if (foodName.equals("frozen meal")) {
			totalTime += ((totalTime * 20) / 100);
		}
		
		if(microwaveModel.equals("medium")) {
			totalTime -= ((totalTime * 10) / 100);
		}
		else if(microwaveModel.equals("low")) {
			totalTime += ((totalTime * 15) / 100);
		}
		return totalTime;
	}
}

public class MicroWaveHeating {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int item;
		float seconds;
		String foodName;
		String microwaveModel;

		System.out.println("Enter the number of items: ");
		item = sc.nextInt();
		if (item >= 4 || item <= 0) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		System.out.println("Enter the heating time for one item (in seconds) : ");
		seconds = sc.nextFloat();
		System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables) : ");
		foodName = sc.next().toLowerCase();
		if (!(foodName.equals("pasta") || foodName.equals("frozen meal") || foodName.equals("vegetables"))) {
			System.out.println("Invalud Input");
			System.exit(0);
		}
		System.out.println("Enter the microwave model (high, medium, low) : ");
		microwaveModel = sc.next().toLowerCase();
		if (!(microwaveModel.equals("high") || microwaveModel.equals("medium") || microwaveModel.equals("low"))) {
			System.out.println("Invalud Input");
			System.exit(0);
		}
		Microwave cook = new Microwave(item, seconds, foodName, microwaveModel);
		System.out.println(cook.cook());
	}
}
