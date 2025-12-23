package com.concurrent.example1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  RunnableDemo R1 = new RunnableDemo( "Thread-1");
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo( "Thread-2");
	      R2.start();
	}

}
