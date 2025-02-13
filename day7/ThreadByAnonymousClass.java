package com.celcom.day7;

public class ThreadByAnonymousClass {
	public static void main(String args[]) {
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("T1 : " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		Runnable runnable1 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("T2 : " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		Thread t2 = new Thread(runnable1);
		t2.start();
	}
}
