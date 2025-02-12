package com.celcom.day7;

public class InnerClassExample {
	// Non-static Inner Class
	class InnerClass1 {
		void myMethod1() {
			System.out.println("Non-static Inner Class");
		}
	}

	// Static Inner Class
	static class InnerClass2 {
		void myMethod2() {
			System.out.println("Static Inner Class");
		}
	}

	// Local Inner Class
	void method() {
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
	}

	public static void main(String args[]) {
		InnerClassExample main = new InnerClassExample();
		InnerClass1 inner1 = main.new InnerClass1();
		inner1.myMethod1();
		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.myMethod2();
	}
}
