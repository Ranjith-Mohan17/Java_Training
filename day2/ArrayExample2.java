package com.celcom.day2;
import java.util.Scanner;
public class ArrayExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Initial values of an array is : ");
		for(int i : arr) System.out.print(i + " ");
		System.out.println();
		System.out.println("Enter " + n + " values for Input");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0, evenCount = 0, oddCount = 0;
		for(int i : arr) {
			sum += i;
			if(i % 2 == 0) {
				 evenCount += 1;
			}
			else {
				 oddCount += 1;
			}
		}
		System.out.println("The Sum is : " + sum);
		System.out.println("Even Count is : " + evenCount);
		System.out.println("Odd Count is : " + oddCount);
	}
}
