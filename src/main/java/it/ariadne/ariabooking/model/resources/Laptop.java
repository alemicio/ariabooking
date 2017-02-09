package it.ariadne.ariabooking.model.resources;

import java.io.Serializable;

public class Laptop extends Resource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes
	private String 	brand;
	private String 	model;
	private String 	cpu;
	private String 	gpu;
	private String 	os;
	private int 	ram;
	private int 	screen;
	// ======================================================================================================== Constructor
	public Laptop(int iD) {
		super(iD);
	}
	public Laptop(int iD, String brand, String model, String cpu, String gpu, String os, int ram, int screen) {
		super(iD);
		this.brand = brand;
		this.model = model;
		this.cpu = cpu;
		this.gpu = gpu;
		this.os = os;
		this.ram = ram;
		this.screen = screen;
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
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", cpu=" + cpu + ", gpu=" + gpu + ", os=" + os + ", ram="
				+ ram + ", screen=" + screen + "]";
	}
	
}
