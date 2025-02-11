package com.celcom.day6;

import java.util.Scanner;

class DuplicateFound extends Exception {
	public String toString() {
		return "Array Contains Duplicate please Enter unique Values";
	}
}

public class ArrayDuplicate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n = sc.nextInt();
		int[] arr = new int[n];

		int j = 0;
		System.out.println("Enter " + n + " elements to the array");
		while (j < n) {
			int m = sc.nextInt();
			int flag = 0;
			for (int i = 0; i < n; i++) {
				if (m == arr[i])
					flag = 1;
			}
			if (flag == 0) {
				arr[j] = m;
				j += 1;
			} else {
				try {
					throw new DuplicateFound();
				} catch (DuplicateFound d) {
					System.out.println(d);
				}
			}
		}
		System.out.println("Array elements are : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
