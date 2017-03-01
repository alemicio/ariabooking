package it.ariadne.ariabooking.model.resources;

import java.io.Serializable;

public class Vehicle extends Resource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes
	private String plate;
	private String 	brand;
	private String 	model;
	private int		seats;
	private String 	fuel;
	// ======================================================================================================== Constructor
	public Vehicle(int iD, String plate, String brand, String model, int seats, String fuel) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.seats = seats;
		this.fuel = fuel;
	}
	// ======================================================================================================== Getter & Setter
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", brand=" + brand + ", model=" + model + ", seats=" + seats + ", fuel="
				+ fuel + "]";
	}
	
	@Override
	public boolean checkConstrain(int c) {
		if(this.seats > 2){
			return true;
		}else{
			return false;
		}
		
	}
}
