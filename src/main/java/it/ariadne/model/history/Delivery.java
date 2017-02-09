package it.ariadne.model.history;

import java.io.Serializable;

import org.joda.time.DateTime;

public class Delivery implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes
	private int deliveryId;
	
	private DateTime deliveyTime;
	private Reservation res;
	// ======================================================================================================== Constructor
	public Delivery(DateTime deliveyTime, Reservation res) {
		super();
		this.deliveyTime = deliveyTime;
		this.res = res;
	}
	
	public Delivery(int deliveryId, DateTime deliveyTime, Reservation res) {
		super();
		this.deliveryId = deliveryId;
		this.deliveyTime = deliveyTime;
		this.res = res;
	}
	// ======================================================================================================== Getters & Setters
	public int getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	public DateTime getDeliveyTime() {
		return deliveyTime;
	}
	public void setDeliveyTime(DateTime deliveyTime) {
		this.deliveyTime = deliveyTime;
	}
	public Reservation getRes() {
		return res;
	}
	public void setRes(Reservation res) {
		this.res = res;
	}
	

}
