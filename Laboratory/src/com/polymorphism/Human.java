package com.polymorphism;

public class Human extends Omnivore{

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println("I am a human.");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eat(Object freshMeatOrPlantMatter){
		System.out.println("Eating " + ((LivingBeing)freshMeatOrPlantMatter).getName());
	}

}
