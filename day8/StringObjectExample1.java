package com.celcom.day8;

public class StringObjectExample1 {
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = new String("Java");
		char ch[] = {'p','o','i','l','e','t'};
		String s3 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
