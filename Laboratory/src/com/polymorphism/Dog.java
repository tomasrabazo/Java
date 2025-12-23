package com.polymorphism;

public class Dog extends Mammal implements Carnivore {
	// implement the super class's abstract methods
	
	private final String name = "Dog";
	
	@Override
	void speak() {
		System.out.println("The Cat says, \"Guaw.\"");
	}

	// methods for the Carnivore interface
	@Override
	public void eat(Object freshMeat) {
		// eat fresh meat
		System.out.println("Eating: " + ((Animal)freshMeat).getName());
	}

	public String getName() {
		return name;
	}
}
