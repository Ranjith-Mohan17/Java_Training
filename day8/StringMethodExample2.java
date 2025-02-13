package com.celcom.day8;

public class StringMethodExample2 {
	public static void main(String args[]) {
		String s = "Hello World";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for (char ch : s.toCharArray()) {
			System.out.print(ch);
		}
		System.out.println();
		s.chars().forEach(ch -> System.out.print((char) ch));
		System.out.println();
		String s1 = "Welcome to India";
		String temp[] = s1.split(" ");
		for (String s2 : temp) {
			System.out.print(s2);
		}
	}
}
