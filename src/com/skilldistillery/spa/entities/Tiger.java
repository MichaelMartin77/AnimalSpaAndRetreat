package com.skilldistillery.spa.entities;

public class Tiger extends Animal {
	private String noise = "Chuffffff";

	// methods

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
