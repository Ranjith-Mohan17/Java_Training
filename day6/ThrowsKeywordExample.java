package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordExample {

	static void m1() throws FileNotFoundException {
		FileReader f = new FileReader("Test.txt");
	}

	static void m2() {
		try {
			ThrowsKeywordExample.m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		ThrowsKeywordExample.m2();
	}
}
