package com.celcom.day6;

public class TryCatchFinally {
	public static void main(String args[]) {
		System.out.println("Before Exception");
		try {
			System.exit(69);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception Occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception Occurs");
		} finally {
			System.out.println("Finally Block Executed");
		}
	}
}
