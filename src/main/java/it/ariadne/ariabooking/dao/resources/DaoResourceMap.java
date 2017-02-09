
package it.ariadne.ariabooking.dao.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import it.ariadne.ariabooking.model.resources.Resource;

public class DaoResourceMap extends DaoResources {
	
	private TreeMap<Integer, Resource> resources = new TreeMap<Integer, Resource>();

	public List<Resource> loadAll() {
		List<Resource> list = new ArrayList<Resource>();
		for (Integer key : resources.keySet()) {
			list.add(resources.get(key));
		}
		return list;
	}

	public void save(Resource res) {
		try {
			Integer n = resources.lastKey();
			n++;
			resources.put(n, res);
			res.setiD(n);
		} catch (Exception e) {
			resources.put(1, res);
			res.setiD(1);
		}
	}

	public void update(Resource res) {
		resources.put(res.getiD(), res);
	}

	public void delete(Resource res) {
		resources.remove(res.getiD());
	}

}
