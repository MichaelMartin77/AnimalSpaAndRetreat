package com.skilldistillery.spa.entities;

public class Bear extends Animal {
	private String noise = "GRRRRRRR";

	// methods

	@Override
	public void eat(int quantity) {
		super.eat(quantity);
		System.out.println("Grrrr I love all " + quantity + " lbs of of fish I've they feed at this retreat. I wish they had some honey.");
		System.out.println();
	} 
	
	@Override
	public void makeNoise() {
		super.makeNoise(); // parent make noise
		System.out.println(noise);
	}

	@Override
	public String toString() {
		return "Bear [noise=" + noise + "]";
	}
	
	
	// no arg constructor 
	public Bear() {

	}

	public Bear(String name) {
		super(name);
	}
	
	public Bear(String name, String noise) {
		super(name);
		this.noise = noise; 
	}
	
}
