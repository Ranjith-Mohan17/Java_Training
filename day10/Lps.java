package com.celcom.day10;

import java.util.Scanner;

public class Lps {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		String s1 = "";
		int resMax = 1;
		for (int i = 0; i < s.length(); i++) {
			int max = 1;
			int a = (i > 0) ? (i - 1) : -1;
			int b = (i < s.length() - 1) ? (i + 1) : s.length();
			while (a >= 0 && b < s.length()) {
				if(s.charAt(a) == s.charAt(b)) {
					max += 2;
					a -= 1;
					b += 1;
				}
				else break;
			}
			if(max > resMax) {
				s1 = s.substring(a + 1, b);
				resMax = max;
			}
		}
		System.out.println(resMax);
		System.out.println(s1);
	}
}
