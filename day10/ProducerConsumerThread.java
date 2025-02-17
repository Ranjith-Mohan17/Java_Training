package com.celcom.day10;

class Resource {
	private String resource;

	public String getData() {
		return resource;
	}

	public void setData(String resource) {
		this.resource = resource;
	}

}

class Consumer extends Thread {
	Resource resource;

	Consumer(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		synchronized (resource) {
			System.out.println("Consumer is waiting for producer to load the data");
			try {
				resource.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Data from the producer is: " + resource.getData());
		}

	}
}

class Producer extends Thread {
	Resource resource;

	Producer(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		synchronized (resource) {
			System.out.println("Producer is Loading the Products :");
			resource.setData("Hello Consumer");
			resource.notify();
		}

	}
}

public class ProducerConsumerThread {

	public static void main(String[] args) throws InterruptedException {
		Resource resource = new Resource();
		Consumer reader = new Consumer(resource);
		reader.start();

		Thread.sleep(2000);

		Producer writer = new Producer(resource);
		writer.start();
	}

}
