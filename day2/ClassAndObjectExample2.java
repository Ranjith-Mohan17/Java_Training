package com.celcom.day2;

class Fruits {
	String name;
	String color;
	float prize;
	int calories;
	Fruits(String name, String color, float prize, int calories) {
		this.name = name;
		this.color = color;
		this.prize = prize;
		this.calories = calories;
	}
	void display() {
		System.out.println("Fruit Name : " + name);
		System.out.println("Fruit Color : " + color);
		System.out.println("Fruit Prize : " + prize);
		System.out.println("Fruit Calories : " + calories);
	}
	void setPrize(int prize) {
		this.prize = prize;
	}
}
public class ClassAndObjectExample2 {
	public static void main(String args[]) {
		Fruits f = new Fruits("Mango", "Yellow", 100, 75);
		f.display();
		f.setPrize(150);
		f.display();
	}
}
