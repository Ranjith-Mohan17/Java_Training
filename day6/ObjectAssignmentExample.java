package com.celcom.day6;

public class ObjectAssignmentExample {
	public static void main(String args[]) {
		ObjectAssignmentExample obj1 = new ObjectAssignmentExample();
		System.out.println(obj1.hashCode());
		ObjectAssignmentExample obj2 = obj1;
		System.out.println(obj2.hashCode());
		ObjectAssignmentExample obj3 = obj2;
		System.out.println(obj3.hashCode());
	}
}
