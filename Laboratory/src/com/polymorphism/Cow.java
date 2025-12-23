package com.polymorphism;

public class Cow extends Mammal implements Herbivore {
	// implement the super class's abstract methods
	
	private final String name = "Cow";			 
	
	@Override
	void speak() {
		System.out.println("The Cow says, \"muuuuuu!!!!.\"");
	}

	// methods for the Herbivore interface
	@Override
	public void eat(Object plantMatter) {
		// eat plants
		System.out.println("Eating: " + ((Plant)plantMatter).getName());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}