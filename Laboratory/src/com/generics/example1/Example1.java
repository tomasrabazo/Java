package com.generics.example1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

// https://docs.oracle.com/javase/tutorial/java/generics/why.html
public class Example1 {

	@Test
	public void test1() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = (String) list.get(0);
		Assert.assertEquals("hello", s);
	}

	@Test
	public void test2() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0); // no cast
		Assert.assertEquals("hello", s);
	}

	public class Box {
		private Object object;

		public void set(Object object) {
			this.object = object;
		}

		public Object get() {
			return object;
		}
	}

	@Test
	public void test3() {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set(new Integer(1));
		Assert.assertEquals(new Integer(1), box.get());
		box.set(new String("1"));
		Assert.assertEquals(new String("1"), box.get());
	}

	/**
	 * Generic version of the Box class.
	 * 
	 * @param <T>
	 *            the type of the value being boxed
	 */
	public class Boxx<T> {
		// T stands for "Type"
		private T t;

		public void set(T t) {
			this.t = t;
		}

		public T get() {
			return t;
		}
	}

	@Test
	public void test4() {
		Boxx<Integer> integerBox1 = new Boxx<Integer>();
		Boxx<Integer> integerBox2 = new Boxx<>();
	}

	public interface Pair<K, V> {
		public K getKey();

		public V getValue();
	}

	public class OrderedPair<K, V> implements Pair<K, V> {

		private K key;
		private V value;

		public OrderedPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}

	@Test
	public void test5() {
		// Type parameter (i.e., K or V) with a parameterized type (i.e., List<String>).
		Pair<String, Integer> p0 = new OrderedPair<String, Integer>("Even", new Integer(8));
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");	
		
		OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
		OrderedPair<String, String>  p4 = new OrderedPair<>("hello", "world");
		
		OrderedPair<String, Boxx<Integer>> p = new OrderedPair<>("primes", new Boxx<Integer>());
	}
}
