package com.skilldistillery.spa.entities;

public abstract class Animal {
	private String name;

	// methods
	
	public Animal() { }
	
	public Animal(String name) { 
		this.name = name; 
	}

	public void eat(int quantity) {
		System.out.println("Don't bother me I am eating " + quantity + " lbs of of meat");
	} 

	public void MakeNoise() {
		System.out.println("I like to howl");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
