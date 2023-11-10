package sessions;

import java.util.List;

import dao.IDao;
import entities.student;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name = "G6StudS")
public class StudentService implements IDao<student> {
  
	@PersistenceContext 
	private EntityManager em;
	
	@Override
	@PermitAll
	public student create(student o) {
		em.persist(o);
		return o;
	}
	
	@Override
	@PermitAll
	public student delete(student o) {
		em.remove(o);
		return o;
	}

	@Override
	@PermitAll
	public student update(student o) {
		em.merge(o);
		return o;
	}

	@Override
	@PermitAll
	public student findById(int id) {
		student  e= em.find(student.class, id);
	     if(e==null) throw new RuntimeException("Student introvable");
	     return e;
	     
	}

	@Override
	@PermitAll
	public List<student> findAll() {
		Query query = em.createQuery("select e from student e");
		return  query.getResultList();
	}
}
