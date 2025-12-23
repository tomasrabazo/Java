package com.vector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public class SortVectors implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return Integer.compare(o1, o2);
			/*
			// TODO Auto-generated method stub
			System.out.println(o1 + "-" + o2);
			if (o1 < 02) {
				return -1;
			} else if (o1 > o2)
				return 1;
			return 0;
			*/
		}
	}

	public static void displayVector(Vector<Integer> v) {
		Enumeration<Integer> vEnum = v.elements();
		System.out.println("\nElements in vector:");
		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
	}

	public static void main(String args[]) {
		// initial capacity is 3, increment is 2
		Vector<Integer> v = new Vector<Integer>(3, 2);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(4));
		v.addElement(new Integer(4));
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));

		//Collections.sort(v);
		Collections.sort(v, new Vector1().new SortVectors());
		displayVector(v);
		System.out.println();

		System.out.println("Capacity after four additions: " + v.capacity());

		// v.addElement(new Double(5.45));
		System.out.println("Current capacity: " + v.capacity());
		// v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current capacity: " + v.capacity());
		// v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First element: " + (Integer) v.firstElement());
		System.out.println("Last element: " + (Integer) v.lastElement());
		if (v.contains(new Integer(3)))
			System.out.println("Vector contains 3.");
		// enumerate the elements in the vector.
		displayVector(v);
		System.out.println();
	}
}
