package com.celcom.day9;

public class WrapperClassExample {
	public static void main(String args[]) {
		int a = 10;
		Integer obj = new Integer(a);// Boxing
		int b = obj.intValue();// Un-Boxing
		Integer obj1 = a;// Auto Boxing
		int c = obj1;// Auto Un-Boxing
	}
}
