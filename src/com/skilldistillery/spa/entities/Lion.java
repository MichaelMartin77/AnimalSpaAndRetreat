package com.skilldistillery.spa.entities;

public class Lion extends Animal {
	private String noise = "ROARRR";

	// methods

	public Lion() {

	}

	public Lion(String name) {
		super(name);
	}

	public Lion(String name, String noise) {
		super(name);
		this.noise = noise;
	}

	@Override
	public void makeNoise() {
		super.makeNoise(); // parent make noise
		System.out.println(noise);
	}
}
