package com.samples.threading;

public class MainWaitsToDie {
	public static void main(String[] args) throws Exception {
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Thread2("::Thread::" + i));// Make some
																	// threads
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();// start em
		}
		for (int i = 0; i < 10; i++) {
			threads[i].join();// main will live till end!! yippee
		}
		System.out.println("*******Thread " + Thread.currentThread().getName()
				+ " will die now*******");
	}

}

class Thread2 implements Runnable {
	private String name;

	public String getName() {
		return name;
	}

	public Thread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName()
				+ " going to sleep for 1s.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();// eat me up
		}
		System.out.println("Thread " + Thread.currentThread().getName()
				+ " back up.");
	}

}