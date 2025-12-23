package com.generics.example4;

public class CountGreater {
/*
	public interface Comparable<T> {
	    public int compareTo(T o);
	}
	*/
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0) // compiler error
				++count;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer = new Integer(1);

		Integer array[] = {1,2,3,4,5};
		System.out.println(CountGreater.countGreaterThan(array, 1));
		
	}

}
