package com.celcom.day2;
import java.util.Arrays;
public class ArraySortingExample {
	public static void main(String args[]) {
		int arr[] = {98, 1, 5, 61, 12, 7, 4};
		Arrays.sort(arr);
		System.out.println("Sorted Array in Ascending order : ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Minimum Value is : " + arr[0]);
		System.out.println("Second Minimum Value is : " + arr[1]);
		System.out.println("Maximum Value is : " + arr[arr.length - 1]);
		System.out.println("Second Maximum Value is : "  + arr[arr.length - 2]);
		System.out.println("Sorted Array in Descending order : ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
