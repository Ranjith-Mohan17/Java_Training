package com.celcom.PackageExample.src.com.celcom.main;

import com.celcom.PackageExample.src.com.celcom.pack1.MyClass1;
import com.celcom.PackageExample.src.com.celcom.pack2.MyClass2;

//Static import Implementation.

import static java.lang.Math.*;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class MainClass extends MyClass1 {

	public static void main(String[] args) {
		MainClass obj1 = new MainClass();
		obj1.myMethod1();
		obj1.myMethod2();
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod3();
		obj2.myMethod4();

		out.println("Hi"); // it can be accessed without the class name with the help of static import.
		out.println(PI);
		out.println(parseInt("123"));
	}

}
