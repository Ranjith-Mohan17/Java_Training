package com.celcom.day5;

import java.util.Scanner;

interface Area1 {
	void calculateArea();
}

interface Perimeter {
	void calculatePerimeter();
}

abstract class Shape1 implements Area, Perimeter {
	int height;
	int radius;
	int breath;
	int length;
	float base;

	Shape1(int radius) {
		this.radius = radius;
	}

	Shape1(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}

	Shape1(float base, int height, int length) {
		this.base = base;
		this.height = height;
		this.length = length;
	}

}

class Triangle1 extends Shape1 {
	Triangle1(float base, int height, int length) {
		super(base, height, length);
	}

	public void calculateArea() {
		System.out.println("The Area of Triangle is " + (0.5 * base * height));
	}

	public void calculatePerimeter() {
		System.out.println("The Perimeter of Triangle is " + (length + height + base));
	}
}

class Rectangle1 extends Shape1 {
	Rectangle1(int length, int breath) {
		super(length, breath);
	}

	public void calculateArea() {
		System.out.println("The Area of Rectangle is " + (length * breath));
	}

	public void calculatePerimeter() {
		System.out.println("The Perimeter of Rectangle is " + 2 * (length + breath));
	}

}

class Circle1 extends Shape1 {
	Circle1(int radius) {
		super(radius);
	}

	public void calculateArea() {
		System.out.println("The Area of Circle is " + (3.14 * radius * radius));
	}

	public void calculatePerimeter() {
		System.out.println("The Perimeter of Circle is " + (2 * 3.14 * radius));
	}
}

public class MultipleInterfaceExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Shape1 shape;
		boolean flag = true;
		do {
			System.out.println("Enter 1 -----> TriangleAreaAndPerimeter");
			System.out.println("Enter 2 -----> RectangleAreaAndPerimeter");
			System.out.println("Enter 3 -----> CircleAreaAndPerimeter" + "");
			System.out.println("Enter 4 -----> Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Base and Height and Length: ");
				float base = sc.nextFloat();
				int height = sc.nextInt();
				int length = sc.nextInt();
				shape = new Triangle1(base, height, length);
				shape.calculateArea();
				shape.calculatePerimeter();
				break;
			case 2:
				System.out.println("Enter Length and Breath : ");
				length = sc.nextInt();
				int breath = sc.nextInt();
				shape = new Rectangle1(length, breath);
				shape.calculateArea();
				shape.calculatePerimeter();
				break;
			case 3:
				System.out.println("Enter Radius : ");
				int radius = sc.nextInt();
				shape = new Circle1(radius);
				shape.calculateArea();
				shape.calculatePerimeter();
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
