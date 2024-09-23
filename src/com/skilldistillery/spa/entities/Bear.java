package com.skilldistillery.spa.entities;

public class Bear extends Animal {
	private String noise = "GRRRRRRR";

	// methods

	public Bear() {

	}

	public Bear(String name) {
		super(name);
	}
	
	public Bear(String name, String noise) {
		super(name);
		this.noise = noise; 
	}
	
	
	@Override
	public void makeNoise() {
		super.makeNoise(); // parent make noise
		System.out.println(noise);
	}
	
}
