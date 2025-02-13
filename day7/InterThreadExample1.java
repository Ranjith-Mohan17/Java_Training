package com.celcom.day7;

//Inter-Thread Communication
class Data {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}

class Reader extends Thread {
	Data data;

	Reader(Data data) {
		this.data = data;
	}

	public void run() {
		synchronized (data) {
			System.out.println("Reader is waiting for writer to write a data");
			try {
				data.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Data from the Resource is : " + data.getMsg());
		}
	}
}

class Writer extends Thread {
	Data data;

	Writer(Data data) {
		this.data = data;
	}

	public void run() {
		synchronized(data) {
			System.out.println("Writer is writing Data...");
			data.setMsg("Hii EveryOne");
			data.notify();
		}
	}
}

public class InterThreadExample1 {
	public static void main(String args[]) throws InterruptedException {
		Data data = new Data();
		Reader reader = new Reader(data);
		reader.start();
		Thread.sleep(2000);
		Writer writer = new Writer(data);
		writer.start();
	}
}
