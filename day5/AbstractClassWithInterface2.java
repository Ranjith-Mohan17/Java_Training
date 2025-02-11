package com.celcom.day5;

import java.util.Scanner;

interface Area {
	void calculateArea();
}

abstract class Shape implements Area {
	int height;
	int radius;
	int breath;
	int length;
	float base;

	Shape(int radius) {
		this.radius = radius;
	}

	Shape(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}

	Shape(float base, int height) {
		this.base = base;
		this.height = height;
	}

}

class Triangle extends Shape {
	Triangle(float base, int height) {
		super(base, height);
	}

	public void calculateArea() {
		System.out.println("The Area of Triangle is " + (0.5 * base * height));
	}
}

class Rectangle extends Shape {
	Rectangle(int length, int breath) {
		super(length, breath);
	}

	public void calculateArea() {
		System.out.println("The Area of Rectangle is " + (length * breath));
	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		System.out.println("The Area of Circle is " + (3.14 * radius * radius));
	}
}

public class AbstractClassWithInterface2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Shape shape;
		boolean flag = true;
		do {
			System.out.println("Enter 1 -----> TriangleArea");
			System.out.println("Enter 2 -----> RectangleArea");
			System.out.println("Enter 3 -----> CircleArea");
			System.out.println("Enter 4 -----> Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Base and Height : ");
				float base = sc.nextFloat();
				int height = sc.nextInt();
				shape = new Triangle(base, height);
				shape.calculateArea();
				break;
			case 2:
				System.out.println("Enter Length and Breath : ");
				int length = sc.nextInt();
				int breath = sc.nextInt();
				shape = new Rectangle(length, breath);
				shape.calculateArea();
				break;
			case 3:
				System.out.println("Enter Radius : ");
				int radius = sc.nextInt();
				shape = new Circle(radius);
				shape.calculateArea();
				break;
			default:
				flag = false;
				System.out.println("Terinated!!");

				break;
			}
		} while (flag);
		sc.close();
	}
}
