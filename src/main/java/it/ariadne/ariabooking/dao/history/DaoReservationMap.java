package it.ariadne.ariabooking.dao.history;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import it.ariadne.model.history.Reservation;

public class DaoReservationMap extends DaoReservation {
	
	private TreeMap<Integer, Reservation> reservations = new TreeMap<Integer, Reservation>();

	public List<Reservation> loadAll() {
		List<Reservation> list = new ArrayList<Reservation>();
		for (Integer key : reservations.keySet()) {
			list.add(reservations.get(key));
		}
		return list;
	}

	public void save(Reservation res) {
		try {
			Integer n = reservations.lastKey();
			n++;
			reservations.put(n, res);
			res.setReservationId(n);
		} catch (Exception e) {
			reservations.put(1, res);
			res.setReservationId(1);
		}	
	}

	public void update(Reservation res) {
		reservations.put(res.getReservationId(), res);
	}

	public void delete(Reservation res) {
		reservations.remove(res.getReservationId());
	}

}
