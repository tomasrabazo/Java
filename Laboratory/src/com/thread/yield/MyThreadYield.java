package com.thread.yield;

import java.util.ArrayList;
import java.util.List;

public class MyThreadYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ExmpThread> list = new ArrayList<ExmpThread>();
		for (int i = 0; i < 3; i++) {
			ExmpThread et = new ExmpThread(i + 5);
			list.add(et);
			et.start();
		}
		for (ExmpThread et : list) {
			try {
				et.join();
			} catch (InterruptedException ex) {
			}
		}
	}

}
