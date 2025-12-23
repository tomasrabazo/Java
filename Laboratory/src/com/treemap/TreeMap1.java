package com.treemap;

import java.util.*;
import java.util.Map.Entry;

public class TreeMap1 {

	public static void iteration(TreeMap<String, Double> tm) {
		
		Set<Entry<String, Double>> set = tm.entrySet();
		// Get an iterator
		Iterator<?> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			//me.setValue(new Double(100));
		}
		System.out.println();

	}

	public static void main(String args[]) {
		// Create a hash map
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// Put elements to the map
		tm.put("Xara", new Double(3434.34));
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Mahnaz", new Double(12));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		iteration(tm);
		//iteration(tm);

		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = tm.get("Zara").doubleValue();
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + tm.get("Zara"));
	}
}
