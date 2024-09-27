package com.skilldistillery.spa.entities;

public class Lion extends Animal {
	private String noise = "ROARRR";

	// methods
	
	@Override
	public void makeNoise() {
		super.makeNoise(); // parent make noise
		System.out.println(noise);
	}
	
	@Override
	public void eat(int quantity) {
		super.eat(quantity);
		System.out.println("Yummmm I'm eating " + quantity + " lbs of of buffalo meat");
	} 

	//no arg constructor 
	public Lion() {

	}

	@Override
	public String toString() {
		return "Lion [noise=" + noise + "]";
	}

	public Lion(String name) {
		super(name);
	}

	public Lion(String name, String noise) {
		super(name);
		this.noise = noise;
	}
	

}
