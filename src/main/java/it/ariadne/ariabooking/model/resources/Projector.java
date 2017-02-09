package it.ariadne.ariabooking.model.resources;

import java.io.Serializable;

public class Projector extends Resource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes	
	private String 	brand;
	private String 	model;
	private int		resolution;
	private Boolean short_throw;
	// ======================================================================================================== Constructor
	public Projector(int iD, String brand, String model, int resolution, Boolean short_throw) {
		super(iD);
		this.brand = brand;
		this.model = model;
		this.resolution = resolution;
		this.short_throw = short_throw;
	}
	public Projector(int iD) {
		super(iD);
		// TODO Auto-generated constructor stub
	}
	// ======================================================================================================== Getter & Setter
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
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public Boolean getShort_throw() {
		return short_throw;
	}
	public void setShort_throw(Boolean short_throw) {
		this.short_throw = short_throw;
	}
	
	@Override
	public String toString() {
		return "Projector [brand=" + brand + ", model=" + model + ", resolution=" + resolution + ", short_throw="
				+ short_throw + "]";
	}
	
}
