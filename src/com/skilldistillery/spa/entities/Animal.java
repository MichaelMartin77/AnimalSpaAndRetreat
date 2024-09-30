package com.skilldistillery.spa.entities;

import java.util.Objects;

public abstract class Animal {
	private String name;

	// methods
	
	public Animal() { }
	
	public Animal(String name) { 
		this.name = name; 
	}

	public void eat(int quantity) {
		System.out.println("Don't bother me I am eating " + quantity + " lbs of meat");
	} 

	public void makeNoise() {
		System.out.println("I am an animal, growling with delight");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	

}
