package fr.univlittoral.javaquarium.dao;

import java.util.List;

public class AbstractGenericDAO<T> {
	protected T typeClass;
	
	public AbstractGenericDAO() {
		this.typeClass = null;
	}
	
	public AbstractGenericDAO(T val) {
		this.typeClass = val;
	}
	
	public void post(Object object) {
		
	}
	
	public void delete(int id) {
		
	}
	
	public T get(int id) {
		return null;
	}
	
	public List<T> getAll() {
		return null;
	}
	
}
