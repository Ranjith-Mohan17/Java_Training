package com.celcom.day2;

public class ArraOfArrayExample2 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[] {1, 2};
		arr[1] = new int[] {10, 11, 2};
		arr[2] = new int[] {1, 9, 10, 7, 5};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
