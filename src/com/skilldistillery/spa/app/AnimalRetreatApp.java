package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.AnimalRetreat;
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
		
//		Tiger tiger = new Tiger("Willie");
//		System.out.println(tiger.getName());
//		
//		Tiger tiger2 = new Tiger();
//		System.out.println();
		
//		Lion lion = new Lion("Bryce"); 
//		System.out.println(lion.getName());
//		
//		lion.makeNoise();
//		
		
		Bear bear = new Bear("Terry"); 
		System.out.println(bear.getName());
		
		bear.makeNoise();
	}
	

}
