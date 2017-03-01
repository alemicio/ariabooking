package it.ariadne.ariabooking.model.resources;

import java.io.Serializable;

public class Room extends Resource implements Serializable{

	private static final long serialVersionUID = 1L;

	// ======================================================================================================== Attributes
	private String name;
	private String description;
	private int floor;
	private int capacity;
	private int desks;
	// ======================================================================================================== Constructor
	public Room(int iD, String name, String description, int floor, int capacity, int desks) {
		this.name = name;
		this.description = description;
		this.floor = floor;
		this.capacity = capacity;
		this.desks = desks;
	}
	// ======================================================================================================== Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getDesks() {
		return desks;
	}
	public void setDesks(int desks) {
		this.desks = desks;
	}
	
	@Override
	public String toString() {
		return "Room [name=" + name + ", description=" + description + ", floor=" + floor + ", capacity=" + capacity
				+ ", desks=" + desks + "]";
	}
	
	@Override
	public boolean checkConstrain(int c) {
		if(this.capacity > 20){
			return true;
		}
		else{
			return false;
		}
	}
	
}
