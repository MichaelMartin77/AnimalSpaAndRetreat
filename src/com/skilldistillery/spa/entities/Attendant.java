package com.skilldistillery.spa.entities;

import java.util.Random;

public class Attendant {
	private String name;

	public Attendant(String name) {
		this.name = name;
	}

	public void makeRounds(Animal animal[]) {
		Random rand = new Random();
		int min = 5;
		int max = 50;

		for (Animal animals : animal) {
			if (animals != null) {
				System.out.println("I will feed " + animals.getName());
				animals.eat(rand.nextInt(max - min + 1) + min);
			}

			if (animals == null) {

				System.out.println("The room is empty, please visit the next room");
			}

		}
		// makeRounds() is complete message
		System.out.println("The attendant is done from the day");
	}
}
