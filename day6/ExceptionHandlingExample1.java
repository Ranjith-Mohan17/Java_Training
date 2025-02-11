package com.celcom.day6;

public class ExceptionHandlingExample1 {
	
	public static void main(String args[]) {
		System.out.println("Before Exception");
		
		//int a = 100 / 0; ArithmeticException.
		
		//int arr[] = new int[-2];  NegativeArraySizeException.
		
		/*int arr[] = {10, 02, 30};
		System.out.println(arr[7]); ArrayIndexOutOfBoundException.*/
		
		//int a = Integer.parseInt("ABD"); NumberFormatExcption.
		
		/*ExceptionHandlingExample1 obj = (ExceptionHandlingExample1) new object(); ClassCastException --> It cant be used 
		even after it gets typecasted.*/
		
		System.out.println("After Exception");
	}
	
}
