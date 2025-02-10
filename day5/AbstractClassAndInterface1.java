package com.celcom.day5;

interface AnimalPlan {
	
	void move();
	void eatFoodType();
	
}

abstract class Animal implements AnimalPlan{
	
	public abstract void move();
	
	public abstract void eatFoodType();
	
}

class Pig extends Animal {
	
	public void move() {
		System.out.println("Pig will move by walk");
	}
	
	public void eatFoodType() {
		System.out.println("Pig will eat Mud");
	}
	
}

class Sparrow extends Animal {
	
	public void move() {
		System.out.println("Sparrow will move by Fly");
	}
	
	public void eatFoodType() {
		System.out.println("Sparrow will eat Grains");
	}
	
}

class Monkey extends Animal {
	
	public void move() {
		System.out.println("Monkey will move by walk");
	}
	
	public void eatFoodType() {
		System.out.println("Monkey will eat Rice with Sambar and Biriyani with Chicken 65");
	}
	
}

public class AbstractClassAndInterface1 {
	
	public static void main(String args[]) {
		Animal animal;
		
		animal = new Pig();
		animal.move();
		animal.eatFoodType();
		
		animal = new Monkey();
		animal.move();
		animal.eatFoodType();
		
		animal = new Sparrow();
		animal.move();
		animal.eatFoodType();
	}
	
}