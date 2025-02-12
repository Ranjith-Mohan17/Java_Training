package com.celcom.day7;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My Thread is Running......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadExample2 {
	public static void main(String args[]) throws InterruptedException {
		Thread t = new MyThread();
		System.out.println("State : " + t.getState());
		t.setName("Thread1");
		System.out.println("Name : " + t.getName());
		System.out.println("Priority : " + t.getPriority());
		t.start();
		Thread.sleep(1000);
		System.out.println("Main End");
	}
}
