package com.celcom.day2;

public class ArrayExample1 {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		System.out.println("The length of the Array : " + arr.length);
		System.out.println("Array Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("The Sum of the Arrays is : " + sum);
		System.out.println("Printing elements using foreach loop : ");
		for (int i : arr)
			System.out.print(i + " ");
	}
}
