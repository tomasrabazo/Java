package com.thread;

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyRunnableThread2 mrt = new MyRunnableThread2();
		Thread t = new Thread(mrt);
		t.start();

		
		int count =0;
		while (count <= 10) {
			try {
				System.out.println("Main Thread: " + (++count));
				//Thread.sleep(10000);
				Thread.sleep(1000000000);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: "
						+ iex.getMessage());
			}
		}

	}

}
