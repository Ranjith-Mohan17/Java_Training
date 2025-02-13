package com.celcom.day8;

import java.util.StringTokenizer;

public class StringTokenizers {
	public static void main(String args[]) {
		String s = "Welcome to Java Programming";
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}
}
