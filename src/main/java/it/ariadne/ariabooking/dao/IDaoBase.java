package it.ariadne.ariabooking.dao;

import java.util.List;

public interface IDaoBase<T> {

	public List<T> loadAll();
	
	public void save(T obj);
	
	public void update(T obj);
	
	public void delete(T obj);
	
}
