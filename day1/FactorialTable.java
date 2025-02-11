package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println("The Factorial of " + i + " = " + (res * i));
			res *= i;
		}
	}
}
