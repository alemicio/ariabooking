package it.ariadne.ariabooking.dao.user;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import it.ariadne.ariabooking.model.User;

public class DaoUserMap extends DaoUser {
	
	private	TreeMap<String,User> users = new TreeMap<String, User>();

	public List<User> loadAll() {
		List<User> list = new ArrayList<User>();
		for (String key : users.keySet()) {
			list.add(users.get(key));
		}
		return list;
	}

	public void save(User u) {
		users.put(u.getUsername(), u);
	}

	public void update(User u) {
		users.put(u.getUsername(), u);
	}

	public void delete(User u) {
		users.remove(u.getUsername());
	}

}
