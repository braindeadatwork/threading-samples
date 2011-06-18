package com.samples.threading;

public class MainWaitsToDie {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 10; i++) {
			Thread t = new Thread(new Thread2("::Thread::" + i));
			t.start();
			t.join();// this means main waits for this to die before doing
						// anything else. effectively stopping the creation of
						// next thread
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
		System.err.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();// eat me up
		}
		System.out.println("Thread " + Thread.currentThread().getName()
				+ " back up.");
	}

}