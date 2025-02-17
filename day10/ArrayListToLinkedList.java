package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListToLinkedList {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the List Size : ");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Element to an ArrayList : ");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		List<Integer> l1 = new LinkedList<>();
		l1.addAll(list);
		System.out.println("Array List : " + list);
		System.out.println("Linked List : " + l1);
		sc.close();
	}
	
}
