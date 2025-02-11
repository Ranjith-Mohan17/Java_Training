package com.celcom.day6;

public class GarbageCollectorExample {
	static int count = 0;

	GarbageCollectorExample() {
		count += 1;
		System.out.println(count);
	}

	protected void finalize() {
		count -= 1;
		System.out.println(count);
	}

	public static void main(String args[]) {
		GarbageCollectorExample obj1 = new GarbageCollectorExample();
		GarbageCollectorExample obj2 = new GarbageCollectorExample();
		obj1 = null;
		System.gc();
		obj2 = null;
		System.gc();
	}
}
