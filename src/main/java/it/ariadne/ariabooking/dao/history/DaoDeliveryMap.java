package it.ariadne.ariabooking.dao.history;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import it.ariadne.model.history.Delivery;

public class DaoDeliveryMap extends DaoDelivery {
	
	private TreeMap<Integer, Delivery> deliveries = new TreeMap<Integer, Delivery>();

	public List<Delivery> loadAll() {
		List<Delivery> list = new ArrayList<Delivery>();
		for (Integer key : deliveries.keySet()) {
			list.add(deliveries.get(key));
		}
		return list;
	}

	public void save(Delivery del) {
		try {
			Integer n = deliveries.lastKey();
			n++;
			deliveries.put(n, del);
			del.setDeliveryId(n);
		} catch (Exception e) {
			deliveries.put(1, del);
			del.setDeliveryId(1);
		}	
	}

	public void update(Delivery del) {
		deliveries.put(del.getDeliveryId(), del);
	}

	public void delete(Delivery del) {
		deliveries.remove(del.getDeliveryId());
	}

}
