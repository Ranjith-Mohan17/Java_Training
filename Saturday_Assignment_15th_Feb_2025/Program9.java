package com.celcom.Saturday_Assignment_15th_Feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program9 {
	public static void main(String args[]) {
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
		System.out.print("Array Elements are : ");
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i) + " - " + "Index : " + i);
		}
	}
}
