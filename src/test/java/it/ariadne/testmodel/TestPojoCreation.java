package it.ariadne.testmodel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

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
import it.ariadne.ariabooking.model.resources.Vehicle;


public class TestPojoCreation {

	private Resource l1, p1, r1, v1;
	private List<Resource> listR;
	private Admin a1;
	private User u1;
	private List<User> listU;
	
	@Before
	public void setUp() throws Exception {
		// ========================================================= creating some objects 		
		l1 = new Laptop(1);
		p1 = new Projector(2);
		r1 = new Room(3);
		v1 = new Vehicle(4);
		a1 = new Admin("micio", "miapss", "alessandro", "gatti", "ale@mia.it", "3931402361");
		u1 = new User("guasco", "tuapss", "simone", "guasconi", "simo@tua.it", "3334442266");
		// ========================================================= creating some collections
		listU = new ArrayList<User>();
		listR = new ArrayList<Resource>();
	}

	@Test
	public void testDaoUser() {
		DaoUser daoU = new DaoUserMap();
		// ========================================================= save a user
		daoU.save(a1);
		daoU.save(u1);
		System.out.println("save user \n");
		// ========================================================= load users;
		listU = daoU.loadAll();
		for (User user : listU) {
			System.out.println(user.toString());
		}
		System.out.println("load user \n");
		// ========================================================= delete a user;
		daoU.delete(a1);
		listU = daoU.loadAll();
		for (User user : listU) {
			System.out.println(user.toString());
		}
		System.out.println("delete user \n");
		// ========================================================= modify a user;
		u1.setName("Riccardo");
		u1.setSurname("cipolla");
		daoU.update(u1);
		listU = daoU.loadAll();
		for (User user : listU) {
			System.out.println(user.toString());
		}
		System.out.println("modify user \n");
	}
	
	@Test
	public void testDaoResurces(){
		DaoResources daoR = new DaoResourceMap();
		// ========================================================= save res
		daoR.save(l1);
		daoR.save(p1);
		daoR.save(r1);
		daoR.save(v1);
		System.out.println("save some resources \n");
		// ========================================================= load all res
		listR = daoR.loadAll();
		for (Resource resource : listR) {
			System.out.println(resource.getiD());
		}
		System.out.println("load resources \n");
		// ========================================================= delete a res
		daoR.delete(l1);
		daoR.delete(p1);
		listR = daoR.loadAll();
		for (Resource resource : listR) {
			System.out.println(resource.getiD());
		}
		System.out.println("delete 2 resources \n");
		// ========================================================= modify a res
		((Room) r1).setFloor(10);
		((Room) r1).setCapacity(10);;
		((Room) r1).setDescription("la merda puzza");
		daoR.update(r1);
		for (Resource resource : listR) {
			if (resource instanceof Room) {
				System.out.println( ((Room) resource).getFloor() );
				System.out.println( ((Room) resource).getCapacity() );
				System.out.println( ((Room) resource).getDescription() );
			}
			
		}
		System.out.println("delete 2 resources \n");

	}

}
