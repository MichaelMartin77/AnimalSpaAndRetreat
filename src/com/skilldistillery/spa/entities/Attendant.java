package com.skilldistillery.spa.entities;

import java.util.Random;

public class Attendant {
	private String name;

	public Attendant(String name) {
		this.name = name;
	}

	public void makeRounds(Animal[] animals) {
		Random rand = new Random();
		int min = 5;
		int max = 50;

		for (Animal animal : animals) {

			if (animal != null) {

				System.out.println("I will feed " + animal.getName());
				// generated random number so that eat method doesn't have same number every time 
				animal.eat(rand.nextInt(max - min + 1) + min);
			} else {

				System.out.println("The room is empty, please visit the next room");
			}

		}
		// makeRounds() is complete message
		System.out.println("The attendant is done from the day");
	}
}
