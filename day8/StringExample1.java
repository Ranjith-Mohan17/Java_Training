package com.celcom.day8;

public class StringExample1 {
	public static void main(String args[]) {
		String s1 = "Java";
	    s1.concat(" World");
	    StringBuffer s2 = new StringBuffer("Hello");
	    s2.append(" World");
	    StringBuilder s3 = new StringBuilder("Hello");
	    s3.append(" World");
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    
	}
}
