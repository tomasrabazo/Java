package com.generics.example2;

import org.junit.Test;

// Type parameter (i.e., K or V) with a parameterized type (i.e., List<String>).
public class Example2 {
	
	public class Pair<K, V> {

	    private K key;
	    private V value;

	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public void setKey(K key) { this.key = key; }
	    public void setValue(V value) { this.value = value; }
	    public K getKey()   { return key; }
	    public V getValue() { return value; }
	}
	
	@Test
	public void test1() {
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		System.out.println(same);
		boolean same2 = Util.compare(p1, p2);
		System.out.println(same2);
	}

}
