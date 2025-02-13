package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamExample1 {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("D:\\Example.txt");
		FileWriter wr = new FileWriter("D:\\Example1.txt");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			wr.write(ch);
		}
		System.out.println("File Copied");
		fr.close();
		wr.close();
	}
}
