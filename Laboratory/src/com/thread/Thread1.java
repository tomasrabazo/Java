package com.thread;

public class Thread1 extends Thread {
 
	private boolean key = true;
	
	public void setKey(boolean b){
		key = b;
	}
	
    public Thread1() {
    }
 
    @Override
    public void run() {
        try {
            while (key) {
                sleep(20000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String args[]) {
        Thread1 prod = new Thread1();
        prod.start();
                
        Thread1 prod2 = new Thread1();
        prod2.setKey(false);

    }
   
}