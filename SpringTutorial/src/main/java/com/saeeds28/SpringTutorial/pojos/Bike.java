package com.saeeds28.SpringTutorial.pojos;

import org.springframework.stereotype.Component;

import com.saeeds28.SpringTutorial.interfaces.Vehicle;

@Component
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("you ride a bike, not drive it");
	}

}
