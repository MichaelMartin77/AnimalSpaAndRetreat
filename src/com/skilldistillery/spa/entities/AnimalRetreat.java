package com.skilldistillery.spa.entities;

public class AnimalRetreat {
	private Attendant attendant;

	private Animal[] rooms = new Animal[10];

	public AnimalRetreat(String attendantName) {
		attendant = new Attendant(attendantName);
	}

	public void listAnimals() {

		for (int i = 0; i < rooms.length; i++) {
			if (rooms == null) {
				System.out.println("This room is empty :(");
			} else {
				System.out.println("Room:  " + rooms[i].getName());
			}

		}

	}

	public boolean addAnimal(Animal newAnimal) {

		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				rooms[i] = newAnimal;
				System.out.println("Hey! " + newAnimal.getName() + " make yourself at home");
				return true;
			}

		}
		
		System.out.println("No room at the retreat and spa, try again tomorrow.");
		return false;
	}
	
	
	public void startAttendantRounds() {
		attendant.makeRounds(rooms);
	}

}
