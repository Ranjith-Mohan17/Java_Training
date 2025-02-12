package com.celcom.day7;

class TwoTable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class ThreeTable extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.err.println("3 * " + i + " = " + (3 * i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadExample5 {
	public static void main(String args[]) throws InterruptedException {
		Thread t1 = new TwoTable();
		Thread t2 = new ThreeTable();
		t1.start();
		t1.join();
		t2.start();

	}
}
