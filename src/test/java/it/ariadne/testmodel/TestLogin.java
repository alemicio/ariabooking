package it.ariadne.testmodel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import it.ariadne.ariabooking.dao.user.DaoUser;
import it.ariadne.ariabooking.dao.user.DaoUserMap;
import it.ariadne.ariabooking.model.Admin;
import it.ariadne.ariabooking.model.User;
import it.ariadne.ariabooking.services.ServiceLogin;

public class TestLogin {

	private Admin a1;
	private User u1, u2;
	private List<User> listU;
	
	private DaoUser daoU;
	private ServiceLogin s_login;
	
	
	@Before
	public void setUp() throws Exception {
		// ========================================================= creating
		// some user
		a1 = new Admin("micio", "miapss", "alessandro", "gatti", "ale@mia.it", "3931402361");
		u1 = new User("guasco", "tuapass", "simone", "guasconi", "simo@tua.it", "3334442266");
		u2 = new User("andre", "suapss", "andrea", "carrus", "andre@sua.it", "3335558866");
		// ========================================================= creating some collections
		listU = new ArrayList<User>();
		
		daoU = new DaoUserMap();
		daoU.save(a1);
		daoU.save(u1);
		daoU.save(u2);
	}

	@Test
	public void testUserCreation() {
		// ========================================================= save a user
		listU = daoU.loadAll();
		assertEquals(3, listU.size());
	}
	@Test
	public void testLogIn() {
		int response = 0;
		s_login = new ServiceLogin(daoU);
		
		response = s_login.log("dio", "merda");
		assertEquals(0, response);
		response = s_login.log("andre", "tuapass");
		assertEquals(1, response);
		response = s_login.log("micio", "miapss");
		assertEquals(2, response);
		
	}
}
