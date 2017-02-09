package it.ariadne.model.history;

import java.io.Serializable;

import org.joda.time.DateTime;

import it.ariadne.ariabooking.model.User;
import it.ariadne.ariabooking.model.resources.Resource;

public class Reservation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Attributes
	private int reservationId;
	
	private Resource resource;
	private User u;
	private DateTime start;
	private DateTime end;
	private int duration;
	// ======================================================================================================== Constructor
	public Reservation(Resource resource, User u, DateTime start, DateTime end) {
		super();
		this.resource = resource;
		this.u = u;
		this.start = start;
		this.end = end;
	}
	public Reservation(int reservationId, Resource resource, User u, DateTime start, DateTime end, int duration) {
		super();
		this.reservationId = reservationId;
		this.resource = resource;
		this.u = u;
		this.start = start;
		this.end = end;
		this.duration = duration;
	}
	// ======================================================================================================== Getters & Setters
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public DateTime getStart() {
		return start;
	}
	public void setStart(DateTime start) {
		this.start = start;
	}
	public DateTime getEnd() {
		return end;
	}
	public void setEnd(DateTime end) {
		this.end = end;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
