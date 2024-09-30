package com.skilldistillery.spa.app;

import java.util.Scanner;

import com.skilldistillery.spa.entities.Animal;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Attendant;
import com.skilldistillery.spa.entities.Bear;
import com.skilldistillery.spa.entities.Lion;
import com.skilldistillery.spa.entities.Tiger;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalRetreatApp app = new AnimalRetreatApp();

		app.run();
		
	

	}

	public void run() {
		AnimalRetreat retreat = new AnimalRetreat("Fred");
		Scanner scanner = new Scanner(System.in);

		System.out.print(
				"We're excited to announce the COMPLETION of building out our NEW Animal Retreat and Spa Resort.\n");
		System.out.println("We welcome our non-human guests, and invite them all to luxuriate in delight!");

		boolean keepRunning = true;
		while (keepRunning) {
			System.out.println();
			System.out.println("Please select an option (1-4) from the menu below: ");
			System.out.println("1: List all animals");
			System.out.println("2: Add an animals");
			System.out.println("3: Start attendant rounds");
			System.out.println("4: Close the inn for the night");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				retreat.listAnimals();
				break;
			case 2:
				System.out.println("You've chosen to add a new animal. What kind of animal do you want to add? (1-3)");
				System.out.println("1. Lion");
				System.out.println("2. Tiger");
				System.out.println("3. Bear");

				int animalType = scanner.nextInt();

				Animal newAnimal = null;

				if (animalType == 1) {
					newAnimal = new Lion();
				} else if ((animalType == 2)) {
					newAnimal = new Bear();
				} else if ((animalType == 3)) {
					newAnimal = new Tiger();
				} else {
					System.out.println("Invalid animal");
				}

				if (newAnimal != null) {
					System.out.println("Next, what is their name? ");
					String animalName = scanner.nextLine();
					newAnimal.setName(animalName);
					retreat.addAnimal(newAnimal);
				}

				break;
			case 3:
				System.out.println("Starting my rounds...");
				retreat.startAttendantRounds();
				break;
			case 4:
				System.out.println("Buhhh Byeee see you later");
				keepRunning = false;
				break;
			}

		}

	}

}
