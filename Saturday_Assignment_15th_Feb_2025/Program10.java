package com.celcom.Saturday_Assignment_15th_Feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new LinkedList<>();
		System.out.println("Enter 1 ----> Add Elements in the List : ");
		System.out.println("Enter 2 ----> Exit");
		int choice;
		do {
			System.out.println("Enter the Choice : ");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("Enter the Element to add :");
				l.add(sc.nextInt());
			}
		}while(choice == 1);
		List<Integer> l1 = new LinkedList<>();
		l1.addAll(l);
		System.out.println("Copied Linked List : " + l1);
	}

}
