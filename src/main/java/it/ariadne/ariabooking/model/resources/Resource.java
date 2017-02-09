package it.ariadne.ariabooking.model.resources;

import java.io.Serializable;

public class Resource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes
	private int iD;
	// ======================================================================================================== Constructor
	public Resource(int iD) {
		super();
		this.iD = iD;
	}
	// ======================================================================================================== Getter & Setter
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	
	@Override
	public String toString() {
		return "Resource [iD=" + iD + "]";
	}
	
	
}

