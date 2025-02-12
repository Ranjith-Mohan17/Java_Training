package com.celcom.day7;

interface Calculator {
	int calc(int a, int b);
}
public class LambdaExpressions {
	public static void main(String args[]) {
		Calculator c = (a, b) -> a + b;
		System.out.println(c.calc(10, 9));
		c = (a, b) -> a - b;
		System.out.println(c.calc(10, 9));
		c = (a, b) -> a * b;
		System.out.println(c.calc(10, 9));
		c = (a, b) -> a / b;
		System.out.println(c.calc(10, 9));
	}
}
