package com.polymorphism;

public class AnimalEating {

	public static void main(String[] args) {
		// create instances of our animals
		Plant plant = new Tomato();
		plant.eat(new Object());
		
		Animal animal = new Cow();
		animal.eat(plant);
		
		Animal animal2 = new Dog();
		animal2.eat(animal);
		
		Plant plant1 = new Tomato();
		plant1.eat(new Object());
		
		Omnivore omnivore = new Human();

		omnivore.eat(animal);
		omnivore.eat(animal2);
		omnivore.eat(plant1);
		
	}
}
