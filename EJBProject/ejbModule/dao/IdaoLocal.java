package dao;

import java.util.List;

import jakarta.ejb.Local;
@Local
public interface IdaoLocal <T> {
	T create(T o);
	T delete(T o);
	T update(T o);
	T findById(int id);
	List<T> findAll();
}

