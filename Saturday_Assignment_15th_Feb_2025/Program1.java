package com.celcom.Saturday_Assignment_15th_Feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
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
		System.out.println("Enter the Element to be Searched : ");
		int find = sc.nextInt();
		for(int i : l) {
			if(i == find) {
				System.out.println("Element found in the Index : " + l.indexOf(i));
				System.exit(0);
			}
		}
		System.out.println("Element not Found");
	}
}
