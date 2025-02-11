package com.celcom.day1;

import java.util.Scanner;

public class UserInputExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name, Id and Salary");
		String ename = sc.next();
		int eid = sc.nextInt();
		long esalary = sc.nextLong();
		System.out.print(ename + " " + eid + " " + esalary);
	}

}
