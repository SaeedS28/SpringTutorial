package com.saeeds28.SpringTutorial.pojos;

public class Tire {

	private String brand;
	private double size;
	
	public Tire(String brand) {
		super();
		this.brand = brand;
	}

	public Tire() {}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tire [brand=" + brand + ", size=" + size + "]";
	}
	
}
