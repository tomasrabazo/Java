package com.thread.prodcons;

import java.util.Vector;

public class Producer extends Thread {

	static final int MAXQUEUE = 5;
	private int number = 9;
	private Vector<String> messages = new Vector<String>();

	private Object semafore = new Object();
	
	public int getNumber(){
		return number;
	}

	@Override
	public void run() {
		try {
			while (true) {
				putMessage();
				// sleep(5000);
			}
		} catch (InterruptedException e) {
		}
	}

	// private synchronized void putMessage() throws InterruptedException {
	private void putMessage() throws InterruptedException {

		//synchronized (semafore) {
		synchronized (this) {
			while (messages.size() == MAXQUEUE) {
				//semafore.wait();
				this.wait();
			}
			messages.addElement(new java.util.Date().toString());
			System.out.println("put message");
			//semafore.notify();
			this.notify();
		}
		// Later, when the necessary event happens, the thread that is running
		// it calls notify() from a block synchronized on the same object.
	}

	// Called by Consumer
	// public synchronized String getMessage() throws InterruptedException {
	public String getMessage() throws InterruptedException {
		
		//synchronized (semafore) {
		synchronized (this) {
			//semafore.notify();
			this.notify();
			while (messages.size() == 0) {
				//semafore.wait();// By executing wait() from a synchronized block, a
				this.wait();// By executing wait() from a synchronized block, a
						// thread
						// gives up its hold on the lock and goes to sleep.
			}
			String message = (String) messages.firstElement();
			messages.removeElement(message);
			return message;
		}
	}
}
