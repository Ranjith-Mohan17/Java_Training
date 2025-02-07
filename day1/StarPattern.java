package com.celcom.day1;
import java.util.Scanner;
public class StarPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 1, i = 0;
		while(i < n) {
			if(d == i) {
				System.out.println();
				i = 0;
				d += 1;
			}
			else {
				System.out.print("*");
				i += 1;
				if(i != d) System.out.print(" ");
			}
		}
	}
}
