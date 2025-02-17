package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortList {
	public static void selectionSort(List<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (list.get(j) < list.get(minIndex)) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = list.get(i);
				list.set(i, list.get(minIndex));
				list.set(minIndex, temp);
			}
		}
	}

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
		System.out.println("The Original List : " + l);
		SortList.selectionSort(l);
		System.out.println("The Sorted List : " + l);
		sc.close();
	}
}
