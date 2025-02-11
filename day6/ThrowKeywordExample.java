package com.celcom.day6;

import java.util.Scanner;

class InvalidException extends Exception {
	int age;

	InvalidException(int age) {
		this.age = age;
	}

	public String toString() {
		return age + " Invalid Age for Voting";
	}
}

public class ThrowKeywordExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {
				throw new InvalidException(age);
			} catch (InvalidException e) {
				System.out.println(e);
			}
		}
	}
}
