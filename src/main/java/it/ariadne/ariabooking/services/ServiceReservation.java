package it.ariadne.ariabooking.services;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.Interval;

import it.ariadne.ariabooking.dao.history.DaoReservation;
import it.ariadne.ariabooking.dao.resources.DaoResourceDB;
import it.ariadne.ariabooking.dao.resources.DaoResources;
import it.ariadne.ariabooking.dao.user.DaoUser;
import it.ariadne.ariabooking.dao.user.DaoUserDB;
import it.ariadne.ariabooking.model.User;
import it.ariadne.ariabooking.model.resources.Resource;
import it.ariadne.ariabooking.util.UtilityDate;
import it.ariadne.model.history.Reservation;

public class ServiceReservation {
	
	private DaoUser			daoUa;
	private DaoResources 	daoR;
	private DaoReservation	daoRes;
	
	private List<User> 			listU;
	private List<Resource> 		listR;
	private List<Reservation>	listRes;
	
	private UtilityDate uDate;
	
	public ServiceReservation(DaoUser daoUa, DaoResources daoR, DaoReservation daoRes) {
		super();
		this.daoUa 		= daoUa;
		this.daoR 		= daoR;
		this.daoRes 	= daoRes;
		this.listU 		= new ArrayList<User>();
		this.listR 		= new ArrayList<Resource>();
		this.listRes	= new ArrayList<Reservation>();
		this.uDate		= new UtilityDate();
	}

	public ServiceReservation() {
		super();
		this.daoUa 		= new DaoUserDB();
		this.daoR 		= new DaoResourceDB();
		this.listU 		= new ArrayList<User>();
		this.listR 		= new ArrayList<Resource>();
		this.listRes	= new ArrayList<Reservation>();
		this.uDate		= new UtilityDate();
	}

	
	
	public Boolean reserve(Reservation res) {
		
		boolean response;
		listRes = daoRes.loadAll();
		
		response = uDate.checkAvailability(res, listRes);
		
		if (response) {
			return false;
		}
		else {
			daoRes.save(res);
			return true;
		}
	}
	 
	

}
