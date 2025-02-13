package com.celcom.day8;

public class StringMethodExample1 {
	public static void main(String args[]) {

		String s = "Java";
		System.out.println(s.toLowerCase());
		System.out.println(s.compareTo("Java"));
		System.out.println(s.toUpperCase());
		System.out.println(s.concat("Programming"));
		System.out.println(s.replace('a', 'd'));
		System.out.println(s.equals("java"));
		System.out.println(s.equalsIgnoreCase("java"));
		System.out.println(s.toCharArray());
		System.out.println(s.startsWith("J"));
		System.out.println(s.endsWith("va"));
		System.out.println(s.contains("av"));

		String s1 = "Hello World";
		System.out.println(s1.substring(1, 6));

	}
}
