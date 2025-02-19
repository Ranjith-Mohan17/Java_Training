package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Theif {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total no of Transactions Occured : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the series of Transactions :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Suspected Transaction Amount :");
		int trans = sc.nextInt(), flag = 0;
		System.out.println("Suspecious Transactions are : ");
		for (int i = 0; i < n; i++) {
			int resSum = 0;
			List<Integer> l = new ArrayList<>();
			for (int j = i; j < n; j++) {
				if ((resSum + arr[j]) > trans)
					break;
				else if ((resSum + arr[j]) == trans) {
					l.add(arr[j]);
					System.out.println(l);
					flag = 1;
					break;
				} else {
					resSum += arr[j];
					l.add(arr[j]);
				}
			}
		}
		if (flag == 0) {
			System.out.println("No Suspecious Transaction Occured!!");
		}
		sc.close();
	}
}
