package com.celcom.day7;

import java.util.Scanner;

class ClassAccount {
	private long balance;

	public void deposit(long cash) {
		balance += cash;
	}

	public void withdraw(long cash) {
		if (cash > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= cash;
		}
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}

class Deposit extends Thread {
	ClassAccount account;

	Deposit(ClassAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Enter the Deposit Amount : ");
			Scanner sc = new Scanner(System.in);
			account.deposit(sc.nextLong());
			System.out.println("Balance : " + account.getBalance());
			account.notify();
		}
	}
}

class Withdraw extends Thread {
	ClassAccount account;

	Withdraw(ClassAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Withdrawing the Cash.......");
			try {
				account.wait();
			} catch (InterruptedException e) {
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Withdraw Amount : ");
			account.withdraw(sc.nextLong());
			System.out.println("Remaining Balance : " + account.getBalance());
		}
	}
}

public class InterThreadExample2 {
	public static void main(String args[]) {
		ClassAccount account = new ClassAccount();
		Deposit deposit = new Deposit(account);
		Withdraw withdraw = new Withdraw(account);
		withdraw.start();
		deposit.start();

	}
}
