package com.celcom.Saturday_Assignment_15th_Feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
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
		System.out.print("Array Elements are : ");
		for(int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
	}

}
