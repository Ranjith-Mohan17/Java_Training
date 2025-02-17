package com.celcom.Saturday_Assignment_15th_Feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		int choice, flag = 0;
		do {
			System.out.println("Enter 1 ----> Add Elements in the List : ");
			System.out.println("Enter 2 ----> Exit");
			System.out.println("Enter the Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Element to add :");
				l.add(sc.nextInt());
				break;
			case 2:
				flag = 1;
				break;
			case 3:
				System.out.println("Enter the Valid Choice");
				break;
			}
		} while (flag == 0);
		System.out.println("Original List : " + l);
		System.out.println("Reversed List : " + l.reversed());
	}

}
