package com.thread;

public class RunMyThread {

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Main Thread: "
						+ (++MyRunnableThread.myCount));
				Thread.sleep(10000);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: "
						+ iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");

	}
}
