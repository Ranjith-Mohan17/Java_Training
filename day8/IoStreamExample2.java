package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamExample2 {
	
	public static void main(String args[]) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\A.jpg");
		FileOutputStream wr = new FileOutputStream("D:\\A1.jpg");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			wr.write(ch);
		}
		System.out.println("File Copied");
		fr.close();
		wr.close();
	}
	
}
