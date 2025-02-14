package com.celcom.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
		Vector<Integer> vec = new Vector<>(3, 2);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.add(10);
		vec.add(9);
		vec.add(111);
		vec.add(101);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i) + " ");
		}
		System.out.println();
		for (Integer i : vec) {
			System.out.print(i + " ");
		}
		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
