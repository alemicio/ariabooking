package it.ariadne.testmodel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.ariabooking.dao.history.DaoReservation;
import it.ariadne.ariabooking.dao.history.DaoReservationMap;
import it.ariadne.ariabooking.dao.resources.DaoResourceMap;
import it.ariadne.ariabooking.dao.resources.DaoResources;
import it.ariadne.ariabooking.dao.user.DaoUser;
import it.ariadne.ariabooking.dao.user.DaoUserMap;
import it.ariadne.ariabooking.model.Admin;
import it.ariadne.ariabooking.model.User;
import it.ariadne.ariabooking.model.resources.Laptop;
import it.ariadne.ariabooking.model.resources.Projector;
import it.ariadne.ariabooking.model.resources.Resource;
import it.ariadne.ariabooking.model.resources.Room;
import it.ariadne.ariabooking.services.ServiceLogin;
import it.ariadne.ariabooking.services.ServiceReservation;
import it.ariadne.model.history.Reservation;

public class TestReservationCreation {

	private Admin 			a1;
	private User 			u1, u2;
	private Resource 		r1,r2,r3;
	private Reservation		res1, res2;
	
	private DaoUser 		daoU;
	private DaoResources 	daoR;
	private DaoReservation 	daoRes;
	
	private ServiceReservation s_reservation;
	
	@Before
	public void setUp() throws Exception {
		// ========================================================= creating obj for population
		// some user
		a1 = new Admin("micio", "miapss", "alessandro", "gatti", "ale@mia.it", "3931402361");
		u1 = new User("guasco", "tuapass", "simone", "guasconi", "simo@tua.it", "3334442266");
		u2 = new User("andre", "suapss", "andrea", "carrus", "andre@sua.it", "3335558866");
		// some sources
		r1 = new Laptop(0, "apple", "macbook", "i7", "nvidia", "macOs", 16, 15);
		r2 = new Room(0, "cantina", "molto accogliente", -1, 30, 1);
		r3 = new Projector(0, "benq", "TW5000", 1920, true);
		// ========================================================= creating some collections
		daoU = new DaoUserMap();
		daoU.save(a1);
		daoU.save(u1);
		daoU.save(u2);
		
		daoR = new DaoResourceMap();
		daoR.save(r1);
		daoR.save(r2);
		daoR.save(r3);
		
		daoRes = new DaoReservationMap();
	}

	@Test
	public void testReservationCreation() {
		Boolean ans1;
		
		s_reservation = new ServiceReservation(daoU, daoR, daoRes);
		
		res1 = new Reservation(r1, u1, new DateTime(2017, 2, 9, 16, 00), new DateTime(2017, 2, 9, 18, 00));
		
		ans1 = s_reservation.reserve(res1);
		
		assertEquals(true, ans1);
	}
	
	@Test
	public void testReservationOverlap() {
		Boolean ans1, ans2;
		
		s_reservation = new ServiceReservation(daoU, daoR, daoRes);
		
		res1 = new Reservation(r1, u1, new DateTime(2017, 2, 9, 16, 00), new DateTime(2017, 2, 9, 18, 00));
		res2 = new Reservation(r2, u1, new DateTime(2017, 2, 9, 17, 01), new DateTime(2017, 2, 9, 20, 00));
		
		ans1 = s_reservation.reserve(res1);
		ans2 = s_reservation.reserve(res2);
		
		assertEquals(true, ans2);
		
	}
	@Test
	public void testReservationOverbooking() {
		Boolean ans1, ans2;
		
		s_reservation = new ServiceReservation(daoU, daoR, daoRes);
		
		res1 = new Reservation(r1, u1, new DateTime(2017, 2, 9, 16, 00), new DateTime(2017, 2, 9, 18, 00));
		res2 = new Reservation(r2, u1, new DateTime(2017, 2, 9, 17, 01), new DateTime(2017, 2, 9, 20, 00));
		
	
	}
}
