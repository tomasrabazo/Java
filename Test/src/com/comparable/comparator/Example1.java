package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {

	class Dog implements Comparator<Dog>, Comparable<Dog> {
		private String name;
		private int age;

		Dog() {
		}

		Dog(String n, int a) {
			name = n;
			age = a;
		}

		public String getDogName() {
			return name;
		}

		public int getDogAge() {
			return age;
		}

		// Overriding the Comparable::compareTo method 
		public int compareTo(Dog d) {
			return (this.name).compareTo(d.name);
		}

		// Overriding the Comparator::compare method to sort the age  
		public int compare(Dog d, Dog d1) {
			return d.age - d1.age;
		}
	}

	public static void main(String args[]) {
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();

		Example1 e = new Example1();
		list.add(e.new Dog("Shaggy", 3));
		list.add(e.new Dog("Lacy", 2));
		list.add(e.new Dog("Roger", 10));
		list.add(e.new Dog("Tommy", 4));
		list.add(e.new Dog("Tammy", 1));
		Collections.sort(list);// Sorts the array list -> compareTo()

		for (Dog a : list)
			// printing the sorted list of names
			System.out.print(a.getDogName() + ", ");

		// Sorts the array list using comparator -> compare()
		Collections.sort(list, e.new Dog());
		System.out.println(" ");
		for (Dog a : list)
			// printing the sorted list of ages
			System.out.print(a.getDogName() + "  : " + a.getDogAge() + ", ");
	}

}
