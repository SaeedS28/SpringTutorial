package com.saeeds28.SpringTutorial.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saeeds28.SpringTutorial.interfaces.Vehicle;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tire tire;

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void drive() {
		System.out.println("drive method in Car called");
	}

	@Override
	public String toString() {
		return "Car [tire=" + tire + "]";
	}
	
	
	
}
