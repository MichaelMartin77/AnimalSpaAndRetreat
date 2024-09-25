package com.skilldistillery.spa.entities;

public class Tiger extends Animal {
	private String noise = "Chuffffff";

	// methods
	
	@Override
	public void eat(int quantity) {
		System.out.println("I couldn't be more excited to eat every " + quantity + " lbs of wild boar I caught!");
	} 

	public Tiger() {
	}

	public Tiger(String name) {
		super(name);
	}

	public Tiger(String name, String noise) {
		super(name);
		this.noise = noise;
	}
	
	
	@Override
	public void makeNoise() {
		super.makeNoise(); // parent make noise
		System.out.println(noise);
	}
	

}
