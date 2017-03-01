package it.ariadne.ariabooking.model.resources;

import java.io.Serializable;

public abstract class Resource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes
	private int iD;
	// ======================================================================================================== Getter & Setter
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	
	
	public abstract boolean checkConstrain(int c);
	
	
	@Override
	public String toString() {
		return "Resource [iD=" + iD + "]";
	}
	
	
}

