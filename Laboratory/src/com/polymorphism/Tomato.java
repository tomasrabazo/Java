package com.polymorphism;

public class Tomato implements Plant{
	
	private final String name = "Tomato";
	
	@Override
	public void eat(Object inorganicMatter) {
		// TODO Auto-generated method stub
		System.out.println("Eating: inorganicMatter");
	}

	public String getName() {
		return name;
	}

}
