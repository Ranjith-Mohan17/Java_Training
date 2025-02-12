package com.celcom.day7;
class MyThread2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Running.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadExample4 {
	public static void main(String args[]) throws InterruptedException {
		Thread t1 = new Thread(new MyThread2());
		t1.setName("Thread1");
		Thread t2 = new Thread(new MyThread2());
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}
