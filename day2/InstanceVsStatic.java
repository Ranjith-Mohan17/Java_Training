package com.celcom.day2;

public class InstanceVsStatic {
	int a = 10; //Instance variable
	static int d = 20; //Static variable
	public static void main(String args[]) {
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		//Execution of instance variable
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 30; //It will chances only the value of a. Because, it creates multiple copies.
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		//Execution of static variable
		System.out.println(obj1.d);
		System.out.println(obj2.d);
		
		obj2.d = 17; //It will chances the both values. Because, it shares a single copy.
		System.out.println(obj1.d);
		System.out.println(obj2.d);
	}
}
