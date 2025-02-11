package com.celcom.day6;

public class TryCatchExample1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			int[] arr = new int[-1];
			// It executes until the first error occurs in the try block.
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception Occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception Occurs");
		}
		/*
		 * If we use this catch block catch(Exception e) at last. then, the remaining
		 * catch block become unreachable. ORDER - SubType to SuperType.
		 */

	}

}
