package it.ariadne.ariabooking.services;


import java.util.ArrayList;
import java.util.List;

import it.ariadne.ariabooking.dao.user.DaoUser;
import it.ariadne.ariabooking.dao.user.DaoUserDB;
import it.ariadne.ariabooking.model.User;

public class ServiceLogin {
	
	private DaoUser daoUa;
	private List<User> listU;
	
	public ServiceLogin() {
		super();
		this.daoUa = new DaoUserDB();
		this.listU = new ArrayList<User>();
	}
	public ServiceLogin(DaoUser daoU) {
		super();
		this.daoUa = daoU;
		this.listU = new ArrayList<User>();
	}


	public int log(String user, String pss) {
		int good = 0;
		listU = daoUa.loadAll();
		
		for (User u : listU) {
			if(u.getUsername().equals(user)){
				
				good++;
				 
				if(u.getPassword().equals(pss)){
					good++;
				}
			}
		}
		switch (good) {
		case 1:
			System.out.println("Wrong password !");
			break;
		case 2:
			System.out.println("Founded !");
			break;
		default:
			System.out.println("User not exist");
			break;
		}
		return good;	
	}


}
