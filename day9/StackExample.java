package com.celcom.day9;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		System.out.println(s.size());
		System.out.println(s.capacity());
		s.add(10);
		s.add(9);
		s.add(111);
		s.add(101);
		System.out.println(s.size());
		System.out.println(s.capacity());
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
		System.out.println();
		for (Integer i : s) {
			System.out.print(i + " ");
		}
		Enumeration<Integer> e = s.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	
}
