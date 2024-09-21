package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Tiger;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalRetreatApp app = new AnimalRetreatApp();
		
		app.run(); 

	}
	
	public void run() {
		Tiger tiger = new Tiger("Willie");
		
		System.out.println(tiger.getName());
	}

}
