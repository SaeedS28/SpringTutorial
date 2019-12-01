package com.saeeds28.SpringTutorial.pojos;

public class Tire {

	private String brand;
	private double size;
	
	public Tire(String brand, double size) {
		super();
		this.brand = brand;
		this.size = size;
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
