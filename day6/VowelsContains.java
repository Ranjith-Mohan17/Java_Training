package com.celcom.day6;

import java.util.Scanner;

class Vowels extends Exception {
	public String toString() {
		return "String doesn't Contains any Vowels";
	}
}

public class VowelsContains {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		int flag = 0;
		for (Character i : s.toCharArray()) {
			char ch = Character.toLowerCase(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = 1;
			}
		}
		try {
			if (flag == 0)
				throw new Vowels();
			else
				System.out.println("It is a Valid String which contains Vowels!!");
		} catch (Vowels v) {
			System.out.println(v);
		}
	}
}
