package dao;


import java.util.List;

import jakarta.ejb.Remote;

@Remote
public interface IDao <T> {
	T create(T o);
	T delete(T o);
	T update(T o);
	T findById(int id);
	List<T> findAll();
}
