package com.samples.threading;

public class Thread1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Thread1());
		t.start();
	}
}